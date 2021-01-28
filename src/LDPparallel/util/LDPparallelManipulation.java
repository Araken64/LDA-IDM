package LDPparallel.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import common.ModelHelper;
import common.Calcul;

public class LDPparallelManipulation {
	public static LDPparallel.Processus getProcessus(String modelFile) {
		Resource resource = ModelHelper.chargerModele(modelFile, LDPparallel.LDPparallelPackage.eINSTANCE);
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
	
	public static void main(String argv[]) {
	
		HashMap<String, Integer> tags = new HashMap<>();
		tags.put("A",1);tags.put("B",1);tags.put("D",1);tags.put("H",1);tags.put("J",1);
		tags.put("P",1);tags.put("Q",1);tags.put("S",1);tags.put("L",1);tags.put("T",1);
		Calcul target = new Calcul();
		
		LDPparallelExecutionEngine ldp = new LDPparallelExecutionEngine();

		ldp.execute("model/parallel/BigProcessusParallel_handmade.xmi", target, tags);
	}
}
