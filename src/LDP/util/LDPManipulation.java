package LDP.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import common.Calcul;
import common.ModelHelper;

public class LDPManipulation {

	public static LDP.Processus getProcessus(String modelFile) {
		Resource resource = ModelHelper.chargerModele(modelFile, LDP.LDPPackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modèle");
			return null;
		}

		TreeIterator<EObject> it = resource.getAllContents();

		LDP.Processus base = null;
		while(it.hasNext()) {
			EObject obj = it.next();
			if (obj instanceof LDP.Processus) {
				base = (LDP.Processus) obj;
				break;
			}
		}
		return base;
	}
	
	public static void main(String argv[]) {
		LDPPrinter.printModel(getProcessus("model/sequential/BigProcessus.xmi"));
	
		HashMap<String, Integer> tags = new HashMap<>();
		tags.put("A",1);tags.put("B",1);tags.put("D",1);tags.put("H",1);tags.put("J",1);
		tags.put("P",1);tags.put("Q",1);tags.put("S",1);tags.put("L",1);tags.put("T",1);
		
		Calcul target = new Calcul();
		
		LDPExecutionEngine engine = new LDPExecutionEngine();

		engine.execute("model/sequential/BigProcessus.xmi", target, tags);
	}
}
