package LDP.util;

import org.eclipse.emf.common.util.EList;

public class LDPPrinter {
	public static void printOperation(LDP.Operation operation) {
		System.out.print("Operation : " + operation.getMethodName() + "(");
		EList<String> paramsTag = operation.getParamsTag();
		if(!paramsTag.isEmpty()) {
			System.out.print(paramsTag.get(0));
			int index = 1;
			while(index < paramsTag.size()) System.out.print(", " + paramsTag.get(index));
		}
		System.out.println(") : " + operation.getReturnTag());
	}
}