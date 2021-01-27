package LDP.util;

import java.util.HashMap;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLMapImpl;

import LDPparallel.util.Calcul;

public class LDPManipulation {
	public void sauverModele(String uri, EObject root) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			resource.getContents().add(root);
			resource.save(null);
		} catch (Exception e) {
			System.err.println("ERREUR sauvegarde du modèle : "+e);
			e.printStackTrace();
		}
	}

	public Resource chargerModele(String uri, EPackage pack) {
		Resource resource = null;
		try {
			URI uriUri = URI.createURI(uri);
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
			resource = (new ResourceSetImpl()).createResource(uriUri);
			XMLResource.XMLMap xmlMap = new XMLMapImpl();
			xmlMap.setNoNamespacePackage(pack);
			java.util.Map options = new java.util.HashMap();
			options.put(XMLResource.OPTION_XML_MAP, xmlMap);
			resource.load(options);
		}
		catch(Exception e) {
			System.err.println("ERREUR chargement du modèle : "+e);
			e.printStackTrace();
		}
		return resource;
	}

	public LDP.Processus getProcessus(String modelFile) {
		Resource resource = chargerModele(modelFile, LDP.LDPPackage.eINSTANCE);
		if (resource == null) {
			System.err.println(" Erreur de chargement du modèle");
			return null;
		}

		TreeIterator<EObject> it = resource.getAllContents();

		LDP.Processus base = null;
		while(it.hasNext()) {
			EObject obj = (EObject) it.next();
			if (obj instanceof LDP.Processus) {
				base = (LDP.Processus) obj;
				break;
			}
		}
		return base;
	}
	
	public static void main(String argv[]) {
		LDPManipulation ldp = new LDPManipulation();
		LDPPrinter.printModel(ldp.getProcessus("model/Calcul.xmi"));
	
		HashMap<String, Integer> tags = new HashMap<>();
		tags.put("n",6);
		tags.put("puiss",3);
		tags.put("x", 100);
		Calcul target = new Calcul();
		
		LDPExecutionEngine engine = new LDPExecutionEngine();

		engine.execute("model/Calcul.xmi", target, tags);
		System.out.println("Le r�sultat du calcul est : "+tags.get("resDiv"));
	}
}
