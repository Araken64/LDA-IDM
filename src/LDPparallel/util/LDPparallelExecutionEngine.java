package LDPparallel.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
	private Map<Jonction, Integer> verifPreJonction = new HashMap<>();
	private Processus processus;
	private Object target;
	private HashMap tags;

	/**
	 * 
	 * @param fileName : the model of the process to be executed (XMI file name)
	 * @param target   : a Java object on which the methods will be called
	 * @param tags     : A map associating a tag and an object allowing both to
	 *                 specify the calculation parameters and to retrieve the
	 *                 calculated values.
	 * @throws LDPparallelEngineException
	 */
	public void execute(String fileName, Object target, HashMap tags) throws LDPparallelEngineException {
		processus = LDPparallelManipulation.getProcessus(fileName);
		if (processus == null)
			throw new LDPparallelEngineException("Processus was not found in model");
		this.target = target;
		this.tags = tags;
		Debut debut = processus.getDebut();
		System.out.println("Début de l'exécution du processus séquentiel, tags = " + tags + "\n");
		runDebut(debut);
	}

	/**
	 * 
	 * @param debut
	 */
	private void runDebut(Debut debut) {
		new Thread(() -> runElementProcessus(debut.getReference())).start();
	}

	/**
	 * 
	 * @param element
	 */
	private void runElementProcessus(ElementProcessus element) {
		if (element instanceof Sequence) {
			runSequence((Sequence) element);
			// if Fin references this ElementProcessus
			if (element == processus.getFin().getReference())
				new Thread(() -> runFin(processus.getFin())).start();
			// if a Porte has this ElementProcessus as predecessor
			Stream<Porte> portesSuivantes = processus.getPortes().stream()
					.filter(porte -> isPredecessor(element, porte));
			portesSuivantes.forEach(porte -> new Thread(() -> runPorte(porte)).start());
		} else if (element instanceof Porte) {
			runPorte((Porte) element);
		} else // last case : ElementProcessus is a PseudoEtat
			runPseudoEtat((PseudoEtat) element);
	}

	/**
	 * 
	 * @param sequence
	 */
	private void runSequence(Sequence sequence) {
		Operation operation;
		List<String> paramsName;
		Object[] params;
		Object result;

		Activite currentActivity = sequence.getPremiereActivite();
		
		System.out.println("	Lancement de la séquence " + sequence.getName()); 

		while (currentActivity != null) { // while last activity have not been executed
			sequence.setActiviteCourante(currentActivity);
			operation = currentActivity.getAction();
			paramsName = operation.getParamsTag();
			params = paramsName.stream().map(name -> tags.get(name)).toArray(); // get tags values required
			try {
				result = ModelHelper.dynamicInvoke(operation.getMethodName(), target, params);
			} catch (Exception e) {
				throw new LDPparallelEngineException("Dynamic invoke failed : check method name or params", e);
			}
			synchronized (tags) { // to avoid java.util.ConcurrentModificationException
				tags.put(operation.getReturnTag(), result);
				System.out.println("		Exécution de l'activité " + currentActivity.getDescription() +", tags = " + tags); 
			}
			currentActivity = currentActivity.getSuivante();
		}
		sequence.setActiviteCourante(null);
		System.out.println("	Fin de la séquence " + sequence.getName()); 
	}

	/**
	 * 
	 * @param porte
	 */
	private void runPorte(Porte porte) {
		if (porte instanceof Fourche)
			runFourche((Fourche) porte);
		else
			runJonction((Jonction) porte);
	}

	/**
	 * 
	 * @param fourche
	 */
	private void runFourche(Fourche fourche) {
		System.out.print("Passage de la "); LDPparallelPrinter.printFourche(fourche);
		for (ElementProcessus element : fourche.getSucc())
			new Thread(() -> runElementProcessus(element)).start();
	}

	/**
	 * synchronized to protect verifPreJonction access
	 * 
	 * @param jonction
	 */
	private synchronized void runJonction(Jonction jonction) {
		verifPreJonction.putIfAbsent(jonction, jonction.getPred().size()); // number of predecessor required
		verifPreJonction.replace(jonction, verifPreJonction.get(jonction) - 1); // decrease for each predecessor reach
		if (verifPreJonction.get(jonction) == 0) { // wait for the last thread to reach the Jonction
			System.out.print("Passage de la "); LDPparallelPrinter.printJonction(jonction);
			new Thread(() -> runElementProcessus(jonction.getSucc())).start();
		}
	}

	/**
	 * 
	 * @param etat
	 */
	private void runPseudoEtat(PseudoEtat etat) {
		if (etat instanceof Debut)
			runDebut((Debut) etat);
		else // last case : PseudoEtat is Fin
			runFin((Fin) etat);
	}

	/**
	 * 
	 * @param fin
	 */
	private void runFin(Fin fin) {
		System.out.println("\n-------- Les résultats sont : "+tags);
	}

	/**
	 * static util function
	 * 
	 * @param element : element which is potentially predecessor of porte
	 * @param porte   : porte which is potentially successor of element
	 * @return boolean
	 */
	private static boolean isPredecessor(ElementProcessus element, Porte porte) {
		if (porte instanceof Fourche)
			return ((Fourche) porte).getPred() == element;
		else
			return ((Jonction) porte).getPred().contains(element);
	}
}

final class LDPparallelEngineException extends RuntimeException {
	private static final long serialVersionUID = 1528671094537296572L;

	/**
	 * constructor with string message and given throwable
	 * 
	 * @param errorMessage
	 * @param err
	 */
	public LDPparallelEngineException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

	/**
	 * constructor with only string message
	 * 
	 * @param errorMessage
	 */
	public LDPparallelEngineException(String errorMessage) {
		super(errorMessage);
	}
}
