package LDP.util;

public class SequencialToParallel {
	public static void main(String argv[]) {

		LDPManipulation ldpm = new LDPManipulation();
		System.out.println(" Chargement du modèle");
		LDP.Processus modelS = ldpm.getProcessus("model/Calcul.xmi");
		//TODO copie modelS dans modelP
		LDPparallel.Processus modelP = LDPparallel.LDPparallelFactory.eINSTANCE.createProcessus();
		ldpm.sauverModele("model/CalculParallel.xmi", modelP);
	}

}
