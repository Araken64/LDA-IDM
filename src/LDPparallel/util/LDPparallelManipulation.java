package LDPparallel.util;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

public class LDPparallelManipulation {
	public static LDPparallel.Processus getProcessus(String modelFile) {
		LDP.util.LDPManipulation ldp = new LDP.util.LDPManipulation(); // TODO package management + static
		Resource resource = ldp.chargerModele(modelFile, LDPparallel.LDPparallelPackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modèle");
			return null;
		}

		TreeIterator<EObject> it = resource.getAllContents();

		LDPparallel.Processus processus = null;
		while(it.hasNext()) {
			EObject obj = (EObject) it.next();
			if (obj instanceof LDPparallel.Processus) {
				processus = (LDPparallel.Processus) obj;
				break;
			}
		}
		return processus;
	}
}
