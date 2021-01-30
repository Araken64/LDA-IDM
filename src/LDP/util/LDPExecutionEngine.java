package LDP.util;

import java.util.HashMap;
import java.util.List;

import common.ModelHelper;

public class LDPExecutionEngine {
	/**
	 * 
	 * @param fileName : the model of the process to be executed (XMI file name)
	 * @param target   : a Java object on which the methods will be called
	 * @param tags     : A map associating a tag and an object allowing both to
	 *                 specify the calculation parameters and to retrieve the
	 *                 calculated values.
	 * @throws LDPEngineException
	 */
	public void execute(String fileName, Object target, HashMap tags) throws LDPEngineException {
		LDPManipulation ldp = new LDPManipulation();
		LDP.Processus processus = ldp.getProcessus(fileName);
		if (processus == null) throw new LDPEngineException("Processus was not found in model");
		LDP.Activite currentActivity = processus.getDebut().getReference();

		LDP.Operation operation;
		List<String> paramsName;
		Object[] params;
		Object result;
		
		System.out.println("-----------Début de l'exécution du processus séquentiel, tags = " + tags + "\n");

		while (currentActivity != null) { // while last activity have not been executed
			processus.setActiviteCourante(currentActivity);
			operation = currentActivity.getAction();
			paramsName = operation.getParamsTag();
			params = paramsName.stream().map(name -> tags.get(name)).toArray();
			try {
				result = ModelHelper.dynamicInvoke(operation.getMethodName(), target, params);
			} catch (Exception e) {
				throw new LDPEngineException("Dynamic invoke failed : check method name or params", e);
			}
			tags.put(operation.getReturnTag(), result);
			System.out.println("Exécution de l'activité " + currentActivity.getDescription() + ", tags = " + tags);
			currentActivity = currentActivity.getSuivante();
		}
		processus.setActiviteCourante(null);
		System.out.println("\n-------- Les résultats sont : "+tags);
	}
}

final class LDPEngineException extends RuntimeException {
	private static final long serialVersionUID = -4453736123810268631L;

	/**
	 * constructor with string message and given throwable
	 * 
	 * @param errorMessage
	 * @param err
	 */
	public LDPEngineException(String errorMessage, Throwable err) {
		super(errorMessage, err);
	}

	/**
	 * constructor with only string message
	 * 
	 * @param errorMessage
	 */
	public LDPEngineException(String errorMessage) {
		super(errorMessage);
	}
}
