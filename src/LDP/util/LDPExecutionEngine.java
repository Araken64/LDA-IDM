package LDP.util;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;

public class LDPExecutionEngine {
	public static void execute(String fileName, Object target, HashMap tags) {
		
		// LDP.Activite firstAct = target.getDebut().getReference();
		// target.setActiviteCourante(firstAct);
		// LDP.Operation op = firstAct.getAction();
		
		//if(op != null) {
		// 	String name = op.getMethodName();
		//	List<String> params = op.getParamsTag();
		//}
		LDP.Processus proc;

	}
	
	public Object dynamicInvoke(String methodName, Object target, Object params[]) throws Exception {
		   Class cl = target.getClass();
		   Class[] paramsClass = new Class[params.length];
		   for (int i=0; i < params.length; i++)
		      paramsClass[i] = params[i].getClass();
		   Method met = cl.getMethod(methodName, paramsClass);
		   Object result = met.invoke(target, params);
		   return result;
		}
}
