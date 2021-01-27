package LDPparallel.util;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Stream;

import LDPparallel.Activite;
import LDPparallel.Debut;
import LDPparallel.ElementProcessus;
import LDPparallel.Fin;
import LDPparallel.Fourche;
import LDPparallel.Jonction;
import LDPparallel.Operation;
import LDPparallel.Porte;
import LDPparallel.Processus;
import LDPparallel.PseudoEtat;
import LDPparallel.Sequence;

import common.ModelHelper;



public class LDPparallelExecutionEngine {
	Processus processus;
	HashMap<Jonction, Integer> verifPreJonction = new HashMap<>();

	public void execute(String fileName, Object target, HashMap tags) throws LDPparallelEngineException {
		processus = LDPparallelManipulation.getProcessus(fileName);
		if (processus == null) throw new LDPparallelEngineException("Processus was not found in model");
		Debut debut = processus.getDebut(); // TODO case if already active sequences at inital state
		runDebut(debut, target, tags);
	}
	
	private void runFourche(Fourche fourche, Object target, HashMap tags) {
		for(ElementProcessus element : fourche.getSucc()) {
			new Thread(() -> runElementProcessus(element, target, tags)).start();
		}
	}
	
	// synchronized to protect verifPreJonction access
	private synchronized void runJonction(Jonction jonction, Object target, HashMap tags) {
		verifPreJonction.putIfAbsent(jonction, jonction.getPred().size());
		verifPreJonction.replace(jonction, verifPreJonction.get(jonction) - 1);
		System.out.println(verifPreJonction.get(jonction));
		if(verifPreJonction.get(jonction) == 0) {
			new Thread(() -> runElementProcessus(jonction.getSucc(), target, tags)).start();
		}
	}
	
	private void runPorte(Porte porte, Object target, HashMap tags) {
		if(porte instanceof Fourche) {
			runFourche((Fourche) porte, target, tags);
		} else {
			runJonction((Jonction) porte, target, tags);
		}
	}
	
	private void runElementProcessus(ElementProcessus element, Object target, HashMap tags) {
		if (element instanceof Porte) {
			System.out.println("BeginElement : Porte");
			runPorte((Porte) element, target, tags);
			System.out.println("FinishElement : Porte");
		} else if (element instanceof Sequence) {
			System.out.println("BeginElement : Sequence -> " + ((Sequence) element).getName());
			runSequence((Sequence) element, target, tags);
			System.out.println("FinishElement : Sequence -> " + ((Sequence) element).getName());
			
			if(element == processus.getFin().getReference()) {
				new Thread(() -> runFin(processus.getFin(), target, tags)).start();
			}
			Stream<Porte> portesSuivantes = processus.getPortes().stream().filter(porte -> isPredecessor(element, porte));
			portesSuivantes.forEach(porte -> {
				new Thread(() -> runPorte(porte, target, tags)).start();
			});
		} else {
			System.out.println("BeginElement : PseudoEtat");
			runPseudoEtat((PseudoEtat) element, target, tags);
			System.out.println("FinishElement : PseudoEtat");
		}
	}

	private void runPseudoEtat(PseudoEtat etat, Object target, HashMap tags) {
		if(etat instanceof Debut) {
			runDebut((Debut) etat, target, tags);
		} else {
			runFin((Fin) etat, target, tags);
		}
	}
	
	private void runDebut(Debut debut, Object target, HashMap tags) {
		System.out.println("BeginElement : Debut");
		new Thread(() -> runElementProcessus(debut.getReference(), target, tags)).start();
		System.out.println("FinishElement : Debut");
	}
	
	private void runFin(Fin fin, Object target, HashMap tags) {
		System.out.println("Fin execution");
		System.out.println(tags);
	}
	
	private void runSequence(Sequence sequence, Object target, HashMap tags) {		
		Operation operation;
		List<String> paramsName;
		Object[] params;
		Object result;
		
		Activite currentActivity = sequence.getPremiereActivite(); // TODO case if already current activity
		
		while(currentActivity != null) { // while last activity have not been executed
			sequence.setActiviteCourante(currentActivity);
			operation = currentActivity.getAction();
			paramsName = operation.getParamsTag();
			params = paramsName.stream().map(name -> tags.get(name)).toArray();
			try {
				result = ModelHelper.dynamicInvoke(operation.getMethodName(), target, params);
			} catch(Exception e) {
				throw new LDPparallelEngineException("Dynamic invoke failed : check method name or params", e);
			}
			tags.put(operation.getReturnTag(), result);
			currentActivity = currentActivity.getSuivante();
		}
		sequence.setActiviteCourante(null);
	}
	
	private static boolean isPredecessor(ElementProcessus element, Porte porte) {
		if (porte instanceof Fourche) return ((Fourche) porte).getPred() == element;
		else return ((Jonction) porte).getPred().contains(element);
	}
}


final class LDPparallelEngineException extends RuntimeException {
	private static final long serialVersionUID = 1528671094537296572L;

	public LDPparallelEngineException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	
	public LDPparallelEngineException(String errorMessage) {
        super(errorMessage);
    }
}

