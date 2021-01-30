package LDPparallel.util;

import org.eclipse.emf.common.util.EList;

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

public class LDPparallelPrinter {
	public static void printOperation(Operation operation) {
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
	
	
	
	public static void printActivity(Activite activity) {
		System.out.print("ACTIVITE = '" + activity.getDescription() + "' -> " );
		printOperation(activity.getAction());
	}
	
	public static void printProcessus(Processus processus) {
		for(Sequence sequence : processus.getSequences()) {
			printSequence(sequence);
		}
		for(Porte porte : processus.getPortes()) {
			printPorte(porte);
		}
	}
	
	public static void printDebut(Debut debut) {
		System.out.print("DEBUT -> ");
		printElementProcessus(debut.getReference());
	}
	
	public static void printFin(Fin fin) {
		System.out.print("FIN -> ");
		printElementProcessus(fin.getReference());
	}
	
	public static void printPseudoEtat(PseudoEtat etat) {
		if (etat instanceof Debut) {
			printDebut((Debut) etat);
		} else {
			printFin((Fin) etat);
		}
	}
	
	public static void printPorte(Porte porte) {
		if (porte instanceof Fourche) {
			printFourche((Fourche) porte);
		} else {
			printJonction((Jonction) porte);
		}
	}
	
	public static void printFourche(Fourche fourche) {
		System.out.print("FOURCHE : (");
		if (fourche.getPred() instanceof Sequence) {
			System.out.print(((Sequence) fourche.getPred()).getName());
		} else if (fourche.getPred() instanceof Porte) {
			System.out.print("Autre porte");
		} else {
			System.out.print("Pseudo Element");
		}
		System.out.print( ") -> [");
		for(ElementProcessus element : fourche.getSucc()) {
			if (element instanceof Sequence) {
				System.out.print(((Sequence) element).getName());
			} else if (element instanceof Porte) {
				System.out.print("Autre porte");
			} else {
				System.out.print("Pseudo Element");
			}
			System.out.print(", ");
		}
		System.out.println("]");
	}
	
	public static void printJonction(Jonction jonction) {
		System.out.print("JONCTION : [");
		for(ElementProcessus element : jonction.getPred()) {
			if (element instanceof Sequence) {
				System.out.print(((Sequence) element).getName());
			} else if (element instanceof Porte) {
				System.out.print("Autre porte");
			} else {
				System.out.print("Pseudo Element");
			}
			System.out.print(", ");
		}
		System.out.print( "] -> (");
		if (jonction.getSucc() instanceof Sequence) {
			System.out.print(((Sequence) jonction.getSucc()).getName());
		} else if (jonction.getSucc() instanceof Porte) {
			System.out.print("Autre porte");
		} else {
			System.out.print("Pseudo Element");
		}
		System.out.println(")");
	}



	public static void printElementProcessus(ElementProcessus element) {
		if (element instanceof Sequence) {
			printSequence((Sequence) element);
		} else if (element instanceof Porte) {
			printPorte((Porte) element);
		} else {
			printPseudoEtat((PseudoEtat) element);
		}
	}
	
	public static void printSequence(Sequence sequence) {
		System.out.println("SEQUENCE : " + sequence.getName() + " [");
		printFirstActivity(sequence);
		for(Activite activity : sequence.getActivites()) {
			System.out.print("	");
			printActivity(activity);
		}
		printCurrentActivity(sequence);
		System.out.println("\n]");
	}
	
	public static void printFirstActivity(Sequence sequence) {
		System.out.print("	First Activity -> ");
		printActivity(sequence.getPremiereActivite());
	}
	
	public static void printCurrentActivity(Sequence sequence) {
		System.out.print("	Activite Courante -> ");
		if(sequence.getActiviteCourante() != null) printActivity(sequence.getActiviteCourante());
	}
	
	public static void printModel(Processus processus) {
		System.out.println("----------- Affichage du modèle -----------\n");
		printDebut(processus.getDebut());
		printFin(processus.getFin());
		printProcessus(processus);
		System.out.println("----------- -----------\n");
	}
}