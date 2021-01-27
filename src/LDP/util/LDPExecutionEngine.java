package LDP.util;

import java.util.HashMap;
import java.util.List;

import common.ModelHelper;

public class LDPExecutionEngine {
	public void execute(String fileName, Object target, HashMap tags) throws LDPEngineException {
		LDPManipulation ldp = new LDPManipulation();
		LDP.Processus processus = ldp.getProcessus(fileName);
		if (processus == null) throw new LDPEngineException("Processus was not found in model");
		LDP.Activite currentActivity = processus.getActiviteCourante() != null ? processus.getActiviteCourante() : processus.getDebut().getReference();		
		// get current activity if defined else get first activity

		LDP.Operation operation;
		List<String> paramsName;
		Object[] params;
		Object result;
						
		while(currentActivity != null) { // while last activity have not been executed
			processus.setActiviteCourante(currentActivity);
			operation = currentActivity.getAction();
			paramsName = operation.getParamsTag();
			params = paramsName.stream().map(name -> tags.get(name)).toArray();
			try {
				result = ModelHelper.dynamicInvoke(operation.getMethodName(), target, params);
			} catch(Exception e) {
				throw new LDPEngineException("Dynamic invoke failed : check method name or params", e);
			}
			tags.put(operation.getReturnTag(), result);
			currentActivity = currentActivity.getSuivante();
		}
		processus.setActiviteCourante(null);
	}
	
}

final class LDPEngineException extends RuntimeException {
	public LDPEngineException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	
	public LDPEngineException(String errorMessage) {
        super(errorMessage);
    }
}
