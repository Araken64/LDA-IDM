package LDPparallel.util;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import LDP.util.LDPExecutionEngine;
import LDP.util.LDPManipulation;
import LDP.util.LDPPrinter;

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
		// LDPManipulation ldp = new LDPManipulation();
		// LDPPrinter.printModel(ldp.getProcessus("model/CalculParallel.xmi"));
	
		HashMap<String, Integer> tags = new HashMap<>();
		tags.put("x1", 1);
		tags.put("x2", 1);
		tags.put("x3", 9);
		tags.put("x4", 1);
		Calcul target = new Calcul();

		LDPparallelExecutionEngine.execute("model/TestExecutionParallel.xmi", target, tags);
	}
}
