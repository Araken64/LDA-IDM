package LDP.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class LDPExecutionEngine {
	public static void execute(String fileName, Object target, HashMap tags) throws Exception {
		LDPManipulation ldp = new LDPManipulation();
		LDP.Processus processus = ldp.getProcessus(fileName);
		LDP.Activite firstActivity = processus.getDebut().getReference();
		processus.setActiviteCourante(firstActivity);
		LDP.Operation operation = firstActivity.getAction();
		
		List<String> paramsName = operation.getParamsTag();
		Object[] params = paramsName.stream().map(name -> tags.get(name)).toArray();
		Object result = dynamicInvoke(operation.getMethodName(), target, params);
		
		LDP.Activite lastActivity = processus.getFin().getReference();
		
		LDP.Activite nextActivity = firstActivity.getSuivante();
		while(nextActivity != null) {
			
		}
	}
	
	public static Object dynamicInvoke(String methodName, Object target, Object params[]) throws Exception {
		   Class cl = target.getClass();
		   Class[] paramsClass = new Class[params.length];
		   for (int i=0; i < params.length; i++)
		      paramsClass[i] = params[i].getClass();
		   Method met = cl.getMethod(methodName, paramsClass);
		   Object result = met.invoke(target, params);
		   return result;
		}
}
