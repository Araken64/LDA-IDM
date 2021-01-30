package LDP.util;

import org.eclipse.emf.common.util.EList;

public class LDPPrinter {
	public static void printOperation(LDP.Operation operation) {
		System.out.print("OPERATION = " + operation.getMethodName() + "(");
		EList<String> paramsTag = operation.getParamsTag();
		if(!paramsTag.isEmpty()) {
			System.out.print(paramsTag.get(0));
			int index = 1;
			while(index < paramsTag.size()) {
				System.out.print(", " + paramsTag.get(index));
				index += 1;
			}
		}
		System.out.println(") : " + operation.getReturnTag());
	}
	
	public static void printActivity(LDP.Activite activity) {
		System.out.print("ACTIVITE = '" + activity.getDescription() + "' -> " );
		printOperation(activity.getAction());
	}
	
	public static void printProcessus(LDP.Processus processus) {
		LDP.Activite currentActivity = processus.getDebut().getReference(); // get first Activity
		while(currentActivity != null) { // while last activity have not been treated
			printActivity(currentActivity);
			currentActivity = currentActivity.getSuivante();
		}
	}
	
	public static void printCurrentActiviy(LDP.Processus processus) {
		System.out.print("ACTIVITE COURANTE -> ");
		if(processus.getActiviteCourante() != null) printActivity(processus.getActiviteCourante());
	}
	
	public static void printDebut(LDP.Processus processus) {
		System.out.print("DEBUT -> ");
		printActivity(processus.getDebut().getReference());
	}
	
	public static void printFin(LDP.Processus processus) {
		System.out.print("FIN -> ");
		printActivity(processus.getFin().getReference());
	}
	
	public static void printModel(LDP.Processus processus) {
		System.out.println("----------- Affichage du modèle -----------\n");
		printDebut(processus);
		printFin(processus);
		printProcessus(processus);
		System.out.println("----------- -----------\n");
	}
}