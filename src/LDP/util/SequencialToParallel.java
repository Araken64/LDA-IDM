package LDP.util;

import java.util.ArrayList;

public class SequencialToParallel {
	
	/**
	 * 
	 * @param modelP, representation du modele sequentiel en modele parallelise (une sequence et toutes les activites à la chaîne)
	 * @param activite, une activite du modele parallelise
	 * @return integer, le nombre de d'operation necessaire pour la bonne execution de l'operation de l'activite passee en parametre
	 */
	public static int nombreParamTagBesoinResultat(LDPparallel.Processus modelP, LDPparallel.Activite activite) {
		int cpt = 0;
		for (int nb_paramTag = 0; nb_paramTag < activite.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramTags de l'operation de l'activite passee en parametre
			for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) { // parcours de toutes les sequence, on a potentiellement deplace des activites auparavant
				for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) { // parcours de toutes les activites
					// test : si le paramTag est egal au returnTag d'une autre operation => donc l'activite passee en parametre necessite au prealable l'execution d'une autre operation
					if (activite.getAction().getParamsTag().get(nb_paramTag).equals(modelP.getSequences().get(nb_seq).getActivites().get(nb_act).getAction().getReturnTag())) {
						cpt++;
					}
				}
			}
		}
		return cpt;
	}
	
	/**
	 * 
	 * @param modelP, representation du modele sequentiel en modele parallelise (une sequence et toutes les activites à la chaîne)
	 * @return Processus, le modele transforme en modele parallelise
	 */
	public static LDPparallel.Processus transformation(LDPparallel.Processus modelP) {
		int cptBesoinResultat = 0; // compteur pour les paramTags qui necessitent une operation anterieur
		boolean derniereAct = true; // detection si l'activite est la derniere, ici la premiere analyser car le parcours se fait depuis la fin
		// parcours du modelP en partant de la fin (une sequence, x activite(s))
		for (int nb_activite_modelP = modelP.getSequences().get(0).getActivites().size()-1; nb_activite_modelP >= 0; nb_activite_modelP--) { // parcours de toutes les activites de la sequence 0
			LDPparallel.Activite act = modelP.getSequences().get(0).getActivites().get(nb_activite_modelP); // recuperation de l'activite courante
			System.out.println(act.getDescription());
			for (int nb_paramTag = 0; nb_paramTag < act.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramTags de l'operation de l'activite courante
				for (int nb_act = 0; nb_act < modelP.getSequences().get(0).getActivites().size(); nb_act++) { // on reparcours toutes les activites pour effectuer le test suivant
					// test : si le paramTag est egal au returnTag d'une autre operation
					if (act.getAction().getParamsTag().get(nb_paramTag).equals(modelP.getSequences().get(0).getActivites().get(nb_act).getAction().getReturnTag())) {
						cptBesoinResultat++;
					}
				}
			}
			
			/* switch se basant sur le nombre d'operation qui doit etre necessairement executee au prealable:
			 * 0 : l'operation peut etre effectuee des le depart (activite de depart) soit avant une autre activite donc concatenation dans la meme sequence soit en predecesseur d'une jonction (parallelisation)
			 * 1 : l'operation necessite le resultat d'une autre operation, soit avant une autre activite -> concatenation dans la meme sequence soit en predecesseur d'une jonction (liee à une operation qui necessite plusieurs resultats) => parallelisation
			 */
			switch (cptBesoinResultat) {
				case 0:
					for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) { // parcours de toutes les sequences
						for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) { // parcours de toutes les activites
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(nb_seq).getActivites().get(nb_act); // activite courante
							for (int nb_paramTag = 0; nb_paramTag < rechercheAct.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramsTag de l'activite
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(nb_paramTag))) { // test : returnTag = paramTag
									int cptParamTagResultatOperationAnterieur = nombreParamTagBesoinResultat(modelP, rechercheAct); // nombre de resultat que necessite l'activite à laquelle elle est liee
									if (cptParamTagResultatOperationAnterieur == 1) { // est lie a une activite qui requiert son resultat => dans la meme sequence
										LDPparallel.Sequence seq = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(rechercheAct)).toArray()[0]; // recuperation de la sequence de l'activite trouvee
										seq.getActivites().get(nb_act).setPrecedente(act); // set le predecesseur de notre activite suivante
										seq.getActivites().add(act);
										seq.getActivites().get(nb_act+1).setSuivante(seq.getActivites().get(nb_act)); // set le successeur de notre activite
										seq.setPremiereActivite(act);
										if (seq.getName() != null)
											seq.setName(seq.getName() + act.getDescription());
										else
											seq.setName(act.getDescription());
									} else { // est lie à une activite qui necessite plusieurs resultat (jonction)
										modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence()); // creation d'une nouvelle sequence
										modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act); // ajout de l'activite dans la sequence creee
										modelP.getSequences().get(modelP.getSequences().size()-1).setPremiereActivite(act); // l'activite se met comme la premiere
										if (modelP.getSequences().get(modelP.getSequences().size()-1).getName() != null)
											modelP.getSequences().get(modelP.getSequences().size()-1).setName(modelP.getSequences().get(modelP.getSequences().size()-1).getName() + act.getDescription());
										else
											modelP.getSequences().get(modelP.getSequences().size()-1).setName(act.getDescription());
										act.setPrecedente(null);
										act.setSuivante(null);
										LDPparallel.Jonction jonction1 = (LDPparallel.Jonction) modelP.getPortes().get(0);
										jonction1.getPred().add(modelP.getSequences().get(modelP.getSequences().size()-1));
									}			
								}	
							}
						}
					}
					break;
				case 1: // meme cas que dans le case precedent avec quelques subtilites
					for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) {
						for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) {
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(nb_seq).getActivites().get(nb_act);
							for (int nb_paramTag = 0; nb_paramTag < rechercheAct.getAction().getParamsTag().size(); nb_paramTag++) {
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(nb_paramTag))) {
									derniereAct = false;
									int cptParamTagResultatOperationAnterieur = nombreParamTagBesoinResultat(modelP, rechercheAct);
									if (cptParamTagResultatOperationAnterieur >= 2) {
										modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
										modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
										if (modelP.getSequences().get(modelP.getSequences().size()-1).getName() != null)
											modelP.getSequences().get(modelP.getSequences().size()-1).setName(modelP.getSequences().get(modelP.getSequences().size()-1).getName() + act.getDescription());
										else
											modelP.getSequences().get(modelP.getSequences().size()-1).setName(act.getDescription());
										act.setPrecedente(null);
										act.setSuivante(null);
										LDPparallel.Jonction jonction2 = (LDPparallel.Jonction) modelP.getPortes().get(0);
										jonction2.getPred().add(modelP.getSequences().get(modelP.getSequences().size()-1));
									} else if (cptParamTagResultatOperationAnterieur == 1) {
										LDPparallel.Sequence seq1 = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(rechercheAct)).toArray()[0];
										seq1.getActivites().get(nb_act).setPrecedente(act);
										seq1.getActivites().add(act);
										seq1.getActivites().get(nb_act+1).setSuivante(seq1.getActivites().get(nb_act));
										if (seq1.getName() != null)
											seq1.setName(seq1.getName() + act.getDescription());
										else
											seq1.setName(act.getDescription());
									}				
								}
							}
						}
					}
					if (derniereAct) {
								modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
								modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
								if (modelP.getSequences().get(modelP.getSequences().size()-1).getName() != null)
									modelP.getSequences().get(modelP.getSequences().size()-1).setName(modelP.getSequences().get(modelP.getSequences().size()-1).getName() + act.getDescription());
								else
									modelP.getSequences().get(modelP.getSequences().size()-1).setName(act.getDescription());
								act.setPrecedente(null);
								act.setSuivante(null);
								derniereAct = false;
					}
					break;
			}
			// 2 : l'operation necessite 2 resultats ou plus donc installation d'une parallelisation => se met en successeur d'une jonction
			if (cptBesoinResultat >= 2) {
				modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
				modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act);
				if (modelP.getSequences().get(modelP.getSequences().size()-1).getName() != null)
					modelP.getSequences().get(modelP.getSequences().size()-1).setName(modelP.getSequences().get(modelP.getSequences().size()-1).getName() + act.getDescription());
				else
					modelP.getSequences().get(modelP.getSequences().size()-1).setName(act.getDescription());
				modelP.getSequences().get(modelP.getSequences().size()-1).setPremiereActivite(act);
				act.setPrecedente(null);
				act.setSuivante(null);
				modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createJonction());
				LDPparallel.Jonction jonction = (LDPparallel.Jonction) modelP.getPortes().get(modelP.getPortes().size()-1);
				jonction.setSucc(modelP.getSequences().get(modelP.getSequences().size()-1));
			}
			cptBesoinResultat = 0;
		}
		
		System.out.println("Finalisation du modele");
		modelP.getSequences().remove(0); // suppression de la premiere sequence (elle comportait le modele sequentiel)
		
		// Fourche de depart si parallelisme
		LDPparallel.Debut debutP = LDPparallel.LDPparallelFactory.eINSTANCE.createDebut();
		if (modelP.getPortes().size() > 0) {
			modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createFourche());
			LDPparallel.Fourche fourche = (LDPparallel.Fourche) modelP.getPortes().get(modelP.getPortes().size()-1);
			fourche.setPred(debutP);
			debutP.setReference(modelP.getPortes().get(modelP.getPortes().size()-1));
			ArrayList<LDPparallel.Jonction> listJonction = new ArrayList<LDPparallel.Jonction>();
			for (LDPparallel.Porte porte : modelP.getPortes()) { // parcours de toutes les portes pour determiner le nombre de jonction
				if (porte instanceof LDPparallel.Jonction) {
					listJonction.add((LDPparallel.Jonction)porte);
				}
			}
			for (LDPparallel.Jonction jonction : listJonction) {
				for (LDPparallel.ElementProcessus seq : jonction.getPred()) {
					fourche.getSucc().add(seq);
				}
			}
		} else {
			debutP.setReference(modelP.getSequences().get(modelP.getSequences().size()-1));
		}
		
		
		// Jonction de fermeture
		LDPparallel.Fin finP = LDPparallel.LDPparallelFactory.eINSTANCE.createFin();
		int cptJonction = 0;
		ArrayList<LDPparallel.Jonction> listJonction = new ArrayList<LDPparallel.Jonction>();
		for (LDPparallel.Porte porte : modelP.getPortes()) { // parcours de toutes les portes pour determiner le nombre de jonction
			if (porte instanceof LDPparallel.Jonction) {
				listJonction.add((LDPparallel.Jonction)porte);
				cptJonction++;
			}
		}
		if (cptJonction >= 2) { // si plusieurs jonctions dans le modele
			modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createJonction()); // creation d'une jonction supplementaire
			LDPparallel.Jonction jonction = (LDPparallel.Jonction) modelP.getPortes().get(modelP.getPortes().size()-1);
			for (LDPparallel.Jonction j : listJonction) { // parcours de toutes les jonctions
				jonction.getPred().add(j.getSucc()); // ajout en tant que predecesseur à cette nouvelle jonction tout les successeurs des jonctions existantes, permet de cloturer le modele
			}
			jonction.setSucc(finP); // element fin du modele
			finP.setReference(jonction);
		} else {
			finP.setReference(modelP.getSequences().get(0)); // positionne à la premiere sequence (qui est la derniere en terme d'execution car on commence par la fin)
		}
		
		modelP.setDebut(debutP);
		modelP.setFin(finP);
		return(modelP);
	}
	
	/**
	 * 
	 * @param modelS, modele sequentiel
	 * @param modelP, copie du modele sequentiel dans une sequence et cast en modele parallele
	 */
	public static void copieModelStoModelP(LDP.Processus modelS, LDPparallel.Processus modelP) {
		modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
		// copie de chaque activite du modelS dans le modelP
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
		
		// mise en place des activites precedentes et suivantes
		for (int nb_act = 0; nb_act < modelP.getSequences().get(0).getActivites().size(); nb_act++) {
			if (nb_act == 0) { // la premiere, on set que l'activite suivante
				modelP.getSequences().get(0).getActivites().get(nb_act).setSuivante(modelP.getSequences().get(0).getActivites().get(nb_act+1));
			} else if (nb_act == modelP.getSequences().get(0).getActivites().size()-1) { // la derniere, on set que l'activite precedente
				modelP.getSequences().get(0).getActivites().get(nb_act).setPrecedente(modelP.getSequences().get(0).getActivites().get(nb_act-1));
			} else { // pour toutes les activites restantes on set l'activite precedente et suivante
				modelP.getSequences().get(0).getActivites().get(nb_act).setSuivante(modelP.getSequences().get(0).getActivites().get(nb_act+1));
				modelP.getSequences().get(0).getActivites().get(nb_act).setPrecedente(modelP.getSequences().get(0).getActivites().get(nb_act-1));
			}
		}
		LDPparallel.Debut debutP = LDPparallel.LDPparallelFactory.eINSTANCE.createDebut();
		debutP.setReference(modelP.getSequences().get(0));
		LDPparallel.Fin finP = LDPparallel.LDPparallelFactory.eINSTANCE.createFin();
		finP.setReference(modelP.getSequences().get(0));
		modelP.setDebut(debutP);
		modelP.setFin(finP);
	}
	
	public static void main(String argv[]) {
		LDPManipulation ldpm = new LDPManipulation();
		System.out.println(" Chargement du modele");
		LDP.Processus modelS = ldpm.getProcessus("model/Calcul.xmi");
		LDPparallel.Processus modelP = LDPparallel.LDPparallelFactory.eINSTANCE.createProcessus();
		copieModelStoModelP(modelS, modelP);
		transformation(modelP);
		ldpm.sauverModele("model/CalculParallel.xmi", modelP);
		System.out.println("Fin transformation");
	}
}
