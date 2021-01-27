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
	static HashMap<ElementProcessus, Thread> mappingThread;
	static Processus processus;
	// static HashMap<Jonction, Integer> verifPreJonction;

	public void execute(String fileName, Object target, HashMap tags) throws LDPparallelEngineException {
		processus = LDPparallelManipulation.getProcessus(fileName);
		if (processus == null) throw new LDPparallelEngineException("Processus was not found in model");
		mappingThread = new HashMap<>();
		Debut debut = processus.getDebut(); // TODO case if already active sequences at inital state
		runDebut(debut, target, tags);
	}
	
	private void runFourche(Fourche fourche, Object target, HashMap tags) {
		for(ElementProcessus element : fourche.getSucc()) {
			Thread th = new Thread(() -> runElementProcessus(element, fourche, target, tags));
			mappingThread.put(element, th);
			th.start();
		}
	}
	
	private void runJonction(Jonction jonction, ElementProcessus origin, Object target, HashMap tags) {
		for(ElementProcessus element : jonction.getPred()) {
			try {
				mappingThread.get(element).join();
			} catch (InterruptedException e) {
				throw new LDPparallelEngineException("A thread has been interrupted", e);
			}
		}
		if (jonction.getPred().get(0) == origin) { // only one predecessor (one thread) run the successor
			Thread th = new Thread(() -> runElementProcessus(jonction.getSucc(), jonction, target, tags));
			mappingThread.put(jonction.getSucc(), th);
			th.start();
		}
	}
	
	private void runPorte(Porte porte, ElementProcessus origin, Object target, HashMap tags) {
		if(porte instanceof Fourche) {
			runFourche((Fourche) porte, target, tags);
		} else {
			runJonction((Jonction) porte, origin, target, tags);
		}
	}
	
	private void runElementProcessus(ElementProcessus element, ElementProcessus origin, Object target, HashMap tags) {
		if (element instanceof Porte) {
			System.out.println("BeginElement : Porte");
			runPorte((Porte) element, origin, target, tags);
			System.out.println("FinishElement : Porte");
		} else if (element instanceof Sequence) {
			System.out.println("BeginElement : Sequence -> " + ((Sequence) element).getName());
			runSequence((Sequence) element, target, tags);
			System.out.println("FinishElement : Sequence -> " + ((Sequence) element).getName());
		} else {
			System.out.println("BeginElement : PseudoEtat");
			runPseudoEtat((PseudoEtat) element, target, tags);
			System.out.println("FinishElement : PseudoEtat");
		}
		
		Stream<Porte> portesSuivantes = processus.getPortes().stream().filter(porte -> isPredecessor(element, porte));
		portesSuivantes.forEach(porte -> {
			Thread th = new Thread(() -> runElementProcessus(porte, element, target, tags));
			mappingThread.put(porte, th);
			th.start();
		});
		
		if(element == processus.getFin().getReference()) {
			Thread th = new Thread(() -> runFin(processus.getFin(), target, tags));
			mappingThread.put(processus.getFin(), th);
			th.start();
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
		Thread th = new Thread(() -> runElementProcessus(debut.getReference(), debut, target, tags));
		mappingThread.put(debut.getReference(), th);
		th.start();
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

