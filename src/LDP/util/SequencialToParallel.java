package LDP.util;

public class SequencialToParallel {
	
	public static int nombreParamTagBesoinResultat(LDPparallel.Processus modelP, LDPparallel.Activite activite) {
		int cpt = 0;
		for (int nb_paramTag = 0; nb_paramTag < activite.getAction().getParamsTag().size(); nb_paramTag++) { //parcours des paramTags de l'opération de l'activité courante
			for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) {
				for (int nb_returnTag = 0; nb_returnTag < modelP.getSequences().get(nb_seq).getActivites().size(); nb_returnTag++) {
					//Si le paramTag est égal au returnTag d'une autre opération;
					if (activite.getAction().getParamsTag().get(nb_paramTag).equals(modelP.getSequences().get(nb_seq).getActivites().get(nb_returnTag).getAction().getReturnTag())) {
						cpt++;
					}
				}
			}
		}
		System.out.println("****************");
		System.out.println("Cpt = " + cpt);
		System.out.println("****************");
		return cpt;
	}
	
	public static LDPparallel.Processus transformation(LDPparallel.Processus modelP) {
		int cptBesoinResultat = 0; //Compteur pour les paramTags qui nécessitent une opération antérieur
		//Parcours du modelP en partant de la fin
		for (int nb_activite_modelP = modelP.getSequences().get(0).getActivites().size()-1; nb_activite_modelP >= 0; nb_activite_modelP--) {
			System.out.println("nb_activite_modelP = " + nb_activite_modelP);
			LDPparallel.Activite act = modelP.getSequences().get(0).getActivites().get(nb_activite_modelP); //récupération de l'activité courante
			for (int nb_paramTag = 0; nb_paramTag < act.getAction().getParamsTag().size(); nb_paramTag++) { //parcours des paramTags de l'opération de l'activité courante
				for (int nb_returnTag = 0; nb_returnTag < modelP.getSequences().get(0).getActivites().size(); nb_returnTag++) {
					//Si le paramTag est égal au returnTag d'une autre opération;
					if (act.getAction().getParamsTag().get(nb_paramTag).equals(modelP.getSequences().get(0).getActivites().get(nb_returnTag).getAction().getReturnTag())) {
						cptBesoinResultat++;
					}
				}
			}
			
			System.out.println("Entrée switch");
			switch (cptBesoinResultat) {
				case 0: // x valeur(s) donnée(s) par l'utilisateur, création de l'élement fourche pour l'activité/séquence courantes
					System.out.println("case 0");
					
					for (int h = 0; h < modelP.getSequences().size(); h++) {
						for (int i = 0; i < modelP.getSequences().get(h).getActivites().size(); i++) {
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(h).getActivites().get(i);
							for (int j = 0; j < rechercheAct.getAction().getParamsTag().size(); j++) {
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(j))) { //returnTag = paramTag
									int k = nombreParamTagBesoinResultat(modelP, rechercheAct);
									System.out.println("k = " + k + ", activité = " + rechercheAct.getDescription());
									if (k == 1) { // est lié a une activité qui requiert son résultat => dans la même séquence
										System.out.println("Sqrt");
										LDPparallel.Sequence seq = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(rechercheAct)).toArray()[0];
										seq.getActivites().get(i).setPrecedente(act);
										seq.getActivites().add(act);
										seq.getActivites().get(i+1).setSuivante(seq.getActivites().get(0));
										seq.setPremiereActivite(act);
										seq.setName(seq.getName() + "Sqrt");
									} else { // est lié à une activité qui nécessite plusieurs résultat (jonction)
										System.out.println("Mult");
										modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
										modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
										modelP.getSequences().get(modelP.getSequences().size()-1).setPremiereActivite(act);
										modelP.getSequences().get(modelP.getSequences().size()-1).setName("seqMult");
										act.setPrecedente(null);
										act.setSuivante(null);
										LDPparallel.Jonction jonction1 = (LDPparallel.Jonction) modelP.getPortes().get(0);
										jonction1.getPred().add(modelP.getSequences().get(modelP.getSequences().size()-1));
									}			
								}	
							}
						}
					}
					
					LDPparallel.Fourche fourche = (LDPparallel.Fourche) modelP.getPortes().get(1);
					LDPparallel.Sequence seq = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(act)).toArray()[0];
					fourche.getSucc().add(seq);
					break;
				case 1: // 1 valeur donnée par une opération antérieur, l'activité va dans la séquence, le predécesseur de l'activité avec qui elle est dépendante
					System.out.println("case 1");
					for (int h = 0; h < modelP.getSequences().size(); h++) {
						for (int i = 0; i < modelP.getSequences().get(h).getActivites().size(); i++) {
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(h).getActivites().get(i);
							for (int j = 0; j < rechercheAct.getAction().getParamsTag().size(); j++) {
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(j))) { //returnTag = paramTag
									int k = nombreParamTagBesoinResultat(modelP, rechercheAct);
									System.out.println("k = " + k + ", activité = " + rechercheAct.getDescription());
									if (k == 2) {
										System.out.println("Div");
										System.out.println("case 1, lié à une jontion");
										modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
										modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
										modelP.getSequences().get(modelP.getSequences().size()-1).setName("seqDiv");
										act.setPrecedente(null);
										act.setSuivante(null);
										LDPparallel.Jonction jonction2 = (LDPparallel.Jonction) modelP.getPortes().get(0);
										jonction2.getPred().add(modelP.getSequences().get(modelP.getSequences().size()-1));
									} else if (k == 1) {
										System.out.println("case 1, lié à une séquence");
										LDPparallel.Sequence seq1 = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(rechercheAct)).toArray()[1];
										seq1.getActivites().get(i).setPrecedente(act);
										seq1.getActivites().add(act);
										seq1.getActivites().get(i+1).setSuivante(seq1.getActivites().get(0));							
									}				
								}
							}
						}
					}
					break;
				case 2: // 2 valeurs données par une opération antérieur, création de l'élément jonction, puis la sortie est la séquence avec l'activité courante
					System.out.println("case 2");
					System.out.println("Plus");
					modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
					modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
					modelP.getSequences().get(modelP.getSequences().size()-1).setName("seqPlus");
					modelP.getSequences().get(modelP.getSequences().size()-1).setPremiereActivite(act);
					act.setPrecedente(null);
					act.setSuivante(null);
					modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createJonction());
					LDPparallel.Jonction jonction = (LDPparallel.Jonction) modelP.getPortes().get(0);
					jonction.setSucc(modelP.getSequences().get(modelP.getSequences().size()-1));
					modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createFourche());
					break;
			}
			
			cptBesoinResultat = 0;
			System.out.println("-----------------------------------------------------------------------------------");
		}
		
		System.out.println("Finalisation du modèle");
		modelP.getSequences().remove(0);
		LDPparallel.Debut debutP = LDPparallel.LDPparallelFactory.eINSTANCE.createDebut();
		debutP.setReference(modelP.getPortes().get(1));
		LDPparallel.Fin finP = LDPparallel.LDPparallelFactory.eINSTANCE.createFin();
		finP.setReference(modelP.getPortes().get(0));
		return(modelP);
	}
	
	public static void copieModelStoModelP(LDP.Processus modelS, LDPparallel.Processus modelP) {
		modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
		//Copie de chaque activité du modelS dans le modelP
		for (LDP.Activite act : modelS.getActivites()) {
			LDPparallel.Activite actP = LDPparallel.LDPparallelFactory.eINSTANCE.createActivite();
			LDPparallel.Operation op = LDPparallel.LDPparallelFactory.eINSTANCE.createOperation();
			
			op.setMethodName(act.getAction().getMethodName());
			op.setReturnTag(act.getAction().getReturnTag());
			for (String tag : act.getAction().getParamsTag()) {
				op.getParamsTag().add(tag);
			}
			
			actP.setAction(op);
			actP.setDescription(act.getDescription());
			modelP.getSequences().get(0).getActivites().add(actP);
		}
		
		//Mise en place des activités précédentes et suivantes
		for (int i = 0; i < modelP.getSequences().get(0).getActivites().size(); i++) {
			if (i == 0) { //La première, on set que l'activité suivante
				modelP.getSequences().get(0).getActivites().get(i).setSuivante(modelP.getSequences().get(0).getActivites().get(i+1));
			} else if (i == modelP.getSequences().get(0).getActivites().size()-1) { //La dernière, on set que l'activité précédente
				modelP.getSequences().get(0).getActivites().get(i).setPrecedente(modelP.getSequences().get(0).getActivites().get(i-1));
			} else { //Pour toutes les activités restantes
				modelP.getSequences().get(0).getActivites().get(i).setSuivante(modelP.getSequences().get(0).getActivites().get(i+1));
				modelP.getSequences().get(0).getActivites().get(i).setPrecedente(modelP.getSequences().get(0).getActivites().get(i-1));
			}
		}
		LDPparallel.Debut debutP = LDPparallel.LDPparallelFactory.eINSTANCE.createDebut();
		debutP.setReference(modelP.getSequences().get(0));
		LDPparallel.Fin finP = LDPparallel.LDPparallelFactory.eINSTANCE.createFin();
		finP.setReference(modelP.getSequences().get(0));
	}
	
	public static void main(String argv[]) {
		LDPManipulation ldpm = new LDPManipulation();
		System.out.println(" Chargement du modèle");
		LDP.Processus modelS = ldpm.getProcessus("model/MyCalcul.xmi");
		LDPparallel.Processus modelP = LDPparallel.LDPparallelFactory.eINSTANCE.createProcessus();
		copieModelStoModelP(modelS, modelP);
		transformation(modelP);
		ldpm.sauverModele("model/MyCalculParallel.xmi", modelP);
		System.out.println("Fin transformation");
	}
}
