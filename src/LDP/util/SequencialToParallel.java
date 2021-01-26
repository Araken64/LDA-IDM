package LDP.util;

public class SequencialToParallel {
	
	/**
	 * 
	 * @param modelP, représentation du modèle séquentiel en modèle parallélisé (une séquence et toutes les activités à la chaîne)
	 * @param activite, une activité du modèle parallélisé
	 * @return integer, le nombre de d'opération nécessaire pour la bonne exécution de l'opération de l'activité passée en paramétre
	 */
	public static int nombreParamTagBesoinResultat(LDPparallel.Processus modelP, LDPparallel.Activite activite) {
		int cpt = 0;
		for (int nb_paramTag = 0; nb_paramTag < activite.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramTags de l'opération de l'activité passée en paramétre
			for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) { // parcours de toutes les séquence, on a potentiellement déplacé des activités auparavant
				for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) { // parcours de toutes les activités
					// test : si le paramTag est égal au returnTag d'une autre opération => donc l'activité passée en paramétre nécessite au préalable l'exécution d'une autre opération
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
	 * @param modelP, représentation du modèle séquentiel en modèle parallélisé (une séquence et toutes les activités à la chaîne)
	 * @return Processus, le modèle transformé en modèle parallélisé
	 */
	public static LDPparallel.Processus transformation(LDPparallel.Processus modelP) {
		int cptBesoinResultat = 0; // compteur pour les paramTags qui nécessitent une opération antérieur
		boolean derniereAct = true; // détection si l'activité est la dernière, ici la première analyser car le parcours se fait depuis la fin
		// parcours du modelP en partant de la fin (une séquence, x activité(s))
		for (int nb_activite_modelP = modelP.getSequences().get(0).getActivites().size()-1; nb_activite_modelP >= 0; nb_activite_modelP--) { // parcours de toutes les activités de la séquence 0
			LDPparallel.Activite act = modelP.getSequences().get(0).getActivites().get(nb_activite_modelP); // récupération de l'activité courante
			System.out.println(act.getDescription());
			for (int nb_paramTag = 0; nb_paramTag < act.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramTags de l'opération de l'activité courante
				for (int nb_act = 0; nb_act < modelP.getSequences().get(0).getActivites().size(); nb_act++) { // on reparcours toutes les activités pour effectuer le test suivant
					// test : si le paramTag est égal au returnTag d'une autre opération
					if (act.getAction().getParamsTag().get(nb_paramTag).equals(modelP.getSequences().get(0).getActivites().get(nb_act).getAction().getReturnTag())) {
						cptBesoinResultat++;
					}
				}
			}
			
			/* switch se basant sur le nombre d'opération qui doit être nécessairement exécutée au préalable:
			 * 0 : l'opération peut être effectuée dès le départ (activité de départ) soit avant une autre activité donc concaténation dans la même séquence soit en prédécesseur d'une jonction (parallélisation)
			 * 1 : l'opération nécessite le résultat d'une autre opération, soit avant une autre activité -> concaténation dans la même séquence soit en prédécesseur d'une jonction (liée à une opération qui nécessite plusieurs résultats) => parallélisation
			 * 2 : l'opération nécessite 2 résultats donc installation d'une parallélissation => se met en successeur d'une jonction
			 */
			switch (cptBesoinResultat) {
				case 0:
					for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) { // parcours de toutes les séquences
						for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) { // parcours de toutes les activités
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(nb_seq).getActivites().get(nb_act); // activité courante
							for (int nb_paramTag = 0; nb_paramTag < rechercheAct.getAction().getParamsTag().size(); nb_paramTag++) { // parcours des paramsTag de l'activité
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(nb_paramTag))) { // test : returnTag = paramTag
									int cptParamTagResultatOperationAnterieur = nombreParamTagBesoinResultat(modelP, rechercheAct); // nombre de résultat que nécessite l'activité à laquelle elle est liée
									if (cptParamTagResultatOperationAnterieur == 1) { // est lié a une activité qui requiert son résultat => dans la même séquence
										LDPparallel.Sequence seq = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(rechercheAct)).toArray()[0]; // récupération de la séquence de l'activité trouvée
										seq.getActivites().get(nb_act).setPrecedente(act); // set le prédécesseur de notre activité suivante
										seq.getActivites().add(act);
										seq.getActivites().get(nb_act+1).setSuivante(seq.getActivites().get(nb_act)); // set le successeur de notre activité
										seq.setPremiereActivite(act);
										if (seq.getName() != null)
											seq.setName(seq.getName() + act.getDescription());
										else
											seq.setName(act.getDescription());
									} else { // est lié à une activité qui nécessite plusieurs résultat (jonction)
										modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence()); // création d'une nouvelle séquence
										modelP.getSequences().get(modelP.getSequences().size()-1).getActivites().add(act); // ajout de l'activité dans la séquence créée
										modelP.getSequences().get(modelP.getSequences().size()-1).setPremiereActivite(act); // l'activité se met comme la première
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
					if (modelP.getPortes().size() > 0) {
						LDPparallel.Fourche fourche = (LDPparallel.Fourche) modelP.getPortes().get(1);
						LDPparallel.Sequence seq = (LDPparallel.Sequence) modelP.getSequences().stream().filter(sequence -> sequence.getActivites().contains(act)).toArray()[0];
						fourche.getSucc().add(seq);
					}
					break;
				case 1: // même cas que dans le case précédent avec quelques subtilités
					for (int nb_seq = 0; nb_seq < modelP.getSequences().size(); nb_seq++) {
						for (int nb_act = 0; nb_act < modelP.getSequences().get(nb_seq).getActivites().size(); nb_act++) {
							LDPparallel.Activite rechercheAct = modelP.getSequences().get(nb_seq).getActivites().get(nb_act);
							for (int nb_paramTag = 0; nb_paramTag < rechercheAct.getAction().getParamsTag().size(); nb_paramTag++) {
								if (act.getAction().getReturnTag().equals(rechercheAct.getAction().getParamsTag().get(nb_paramTag))) {
									derniereAct = false;
									int cptParamTagResultatOperationAnterieur = nombreParamTagBesoinResultat(modelP, rechercheAct);
									if (cptParamTagResultatOperationAnterieur == 2) {
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
								System.out.println("Fin de sequence");
								System.out.println(act.getDescription());
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
				case 2:
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
					modelP.getPortes().add(LDPparallel.LDPparallelFactory.eINSTANCE.createFourche());
					break;
			}			
			cptBesoinResultat = 0;
		}
		
		System.out.println("Finalisation du modèle");
		modelP.getSequences().remove(0); // suppression de la première séquence (elle comportait le modèle séquentiel)
		LDPparallel.Debut debutP = LDPparallel.LDPparallelFactory.eINSTANCE.createDebut();
		if (modelP.getPortes().size() > 0) {
			debutP.setReference(modelP.getPortes().get(modelP.getPortes().size()-1));
		} else {
			debutP.setReference(modelP.getSequences().get(0));
		}
		LDPparallel.Fin finP = LDPparallel.LDPparallelFactory.eINSTANCE.createFin();
		finP.setReference(modelP.getSequences().get(0));
		modelP.setDebut(debutP);
		modelP.setFin(finP);
		return(modelP);
	}
	
	/**
	 * 
	 * @param modelS, modèle séquentiel
	 * @param modelP, copie du modèle séquentiel dans une séquence et cast en modèle parallèle
	 */
	public static void copieModelStoModelP(LDP.Processus modelS, LDPparallel.Processus modelP) {
		modelP.getSequences().add(LDPparallel.LDPparallelFactory.eINSTANCE.createSequence());
		// copie de chaque activité du modelS dans le modelP
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
		
		// mise en place des activités précédentes et suivantes
		for (int nb_act = 0; nb_act < modelP.getSequences().get(0).getActivites().size(); nb_act++) {
			if (nb_act == 0) { // la première, on set que l'activité suivante
				modelP.getSequences().get(0).getActivites().get(nb_act).setSuivante(modelP.getSequences().get(0).getActivites().get(nb_act+1));
			} else if (nb_act == modelP.getSequences().get(0).getActivites().size()-1) { // la dernière, on set que l'activité précédente
				modelP.getSequences().get(0).getActivites().get(nb_act).setPrecedente(modelP.getSequences().get(0).getActivites().get(nb_act-1));
			} else { // pour toutes les activités restantes on set l'activité précédente et suivante
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
		System.out.println(" Chargement du modèle");
		LDP.Processus modelS = ldpm.getProcessus("model/MyCalcul.xmi");
		LDPparallel.Processus modelP = LDPparallel.LDPparallelFactory.eINSTANCE.createProcessus();
		copieModelStoModelP(modelS, modelP);
		transformation(modelP);
		ldpm.sauverModele("model/MyCalculParallel.xmi", modelP);
		System.out.println("Fin transformation");
	}
}
