/**
 */
package LDPparallel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see LDPparallel.LDPparallelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface LDPparallelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDPparallel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univ-pau.fr/m2ti/2020/LDP-parallel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDPparallel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPparallelPackage eINSTANCE = LDPparallel.impl.LDPparallelPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDPparallel.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.ProcessusImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Sequences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__SEQUENCES = 0;

	/**
	 * The feature id for the '<em><b>Portes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__PORTES = 1;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__DEBUT = 2;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__FIN = 3;

	/**
	 * The feature id for the '<em><b>Sequences Actives</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__SEQUENCES_ACTIVES = 4;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.ElementProcessusImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getElementProcessus()
	 * @generated
	 */
	int ELEMENT_PROCESSUS = 1;

	/**
	 * The number of structural features of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Element Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.SequenceImpl <em>Sequence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.SequenceImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getSequence()
	 * @generated
	 */
	int SEQUENCE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__NAME = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITES = ELEMENT_PROCESSUS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__ACTIVITE_COURANTE = ELEMENT_PROCESSUS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Premiere Activite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE__PREMIERE_ACTIVITE = ELEMENT_PROCESSUS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Sequence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.ActiviteImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 3;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Suivante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__SUIVANTE = 1;

	/**
	 * The feature id for the '<em><b>Precedente</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__PRECEDENTE = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Pas Dans Suivant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE = 0;

	/**
	 * The number of operations of the '<em>Activite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.PseudoEtatImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getPseudoEtat()
	 * @generated
	 */
	int PSEUDO_ETAT = 4;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT__REFERENCE = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.DebutImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 5;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Debut</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEBUT_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.FinImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 6;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN__REFERENCE = PSEUDO_ETAT__REFERENCE;

	/**
	 * The number of structural features of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_FEATURE_COUNT = PSEUDO_ETAT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fin</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIN_OPERATION_COUNT = PSEUDO_ETAT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.PorteImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 7;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = ELEMENT_PROCESSUS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = ELEMENT_PROCESSUS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.FourcheImpl <em>Fourche</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.FourcheImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getFourche()
	 * @generated
	 */
	int FOURCHE = 8;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE__PRED = PORTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE__SUCC = PORTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Fourche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE_FEATURE_COUNT = PORTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Fourche</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOURCHE_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.JonctionImpl <em>Jonction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.JonctionImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getJonction()
	 * @generated
	 */
	int JONCTION = 9;

	/**
	 * The feature id for the '<em><b>Pred</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION__PRED = PORTE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Succ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION__SUCC = PORTE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Jonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION_FEATURE_COUNT = PORTE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Jonction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JONCTION_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link LDPparallel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDPparallel.impl.OperationImpl
	 * @see LDPparallel.impl.LDPparallelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 10;

	/**
	 * The feature id for the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__METHOD_NAME = 0;

	/**
	 * The feature id for the '<em><b>Return Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__RETURN_TAG = 1;

	/**
	 * The feature id for the '<em><b>Params Tag</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__PARAMS_TAG = 2;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link LDPparallel.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDPparallel.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the containment reference list '{@link LDPparallel.Processus#getSequences <em>Sequences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sequences</em>'.
	 * @see LDPparallel.Processus#getSequences()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Sequences();

	/**
	 * Returns the meta object for the containment reference list '{@link LDPparallel.Processus#getPortes <em>Portes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Portes</em>'.
	 * @see LDPparallel.Processus#getPortes()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Portes();

	/**
	 * Returns the meta object for the containment reference '{@link LDPparallel.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDPparallel.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDPparallel.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDPparallel.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for the reference list '{@link LDPparallel.Processus#getSequencesActives <em>Sequences Actives</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sequences Actives</em>'.
	 * @see LDPparallel.Processus#getSequencesActives()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_SequencesActives();

	/**
	 * Returns the meta object for class '{@link LDPparallel.ElementProcessus <em>Element Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element Processus</em>'.
	 * @see LDPparallel.ElementProcessus
	 * @generated
	 */
	EClass getElementProcessus();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence</em>'.
	 * @see LDPparallel.Sequence
	 * @generated
	 */
	EClass getSequence();

	/**
	 * Returns the meta object for the attribute '{@link LDPparallel.Sequence#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see LDPparallel.Sequence#getName()
	 * @see #getSequence()
	 * @generated
	 */
	EAttribute getSequence_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link LDPparallel.Sequence#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see LDPparallel.Sequence#getActivites()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_Activites();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Sequence#getActiviteCourante <em>Activite Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Courante</em>'.
	 * @see LDPparallel.Sequence#getActiviteCourante()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_ActiviteCourante();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Sequence#getPremiereActivite <em>Premiere Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Premiere Activite</em>'.
	 * @see LDPparallel.Sequence#getPremiereActivite()
	 * @see #getSequence()
	 * @generated
	 */
	EReference getSequence_PremiereActivite();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDPparallel.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the attribute '{@link LDPparallel.Activite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see LDPparallel.Activite#getDescription()
	 * @see #getActivite()
	 * @generated
	 */
	EAttribute getActivite_Description();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suivante</em>'.
	 * @see LDPparallel.Activite#getSuivante()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Suivante();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedente</em>'.
	 * @see LDPparallel.Activite#getPrecedente()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Precedente();

	/**
	 * Returns the meta object for the containment reference '{@link LDPparallel.Activite#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see LDPparallel.Activite#getAction()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Action();

	/**
	 * Returns the meta object for the '{@link LDPparallel.Activite#pasDansSuivant(LDPparallel.Activite) <em>Pas Dans Suivant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pas Dans Suivant</em>' operation.
	 * @see LDPparallel.Activite#pasDansSuivant(LDPparallel.Activite)
	 * @generated
	 */
	EOperation getActivite__PasDansSuivant__Activite();

	/**
	 * Returns the meta object for class '{@link LDPparallel.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDPparallel.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.PseudoEtat#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDPparallel.PseudoEtat#getReference()
	 * @see #getPseudoEtat()
	 * @generated
	 */
	EReference getPseudoEtat_Reference();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDPparallel.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDPparallel.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte</em>'.
	 * @see LDPparallel.Porte
	 * @generated
	 */
	EClass getPorte();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Fourche <em>Fourche</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fourche</em>'.
	 * @see LDPparallel.Fourche
	 * @generated
	 */
	EClass getFourche();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Fourche#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Pred</em>'.
	 * @see LDPparallel.Fourche#getPred()
	 * @see #getFourche()
	 * @generated
	 */
	EReference getFourche_Pred();

	/**
	 * Returns the meta object for the reference list '{@link LDPparallel.Fourche#getSucc <em>Succ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Succ</em>'.
	 * @see LDPparallel.Fourche#getSucc()
	 * @see #getFourche()
	 * @generated
	 */
	EReference getFourche_Succ();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Jonction <em>Jonction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Jonction</em>'.
	 * @see LDPparallel.Jonction
	 * @generated
	 */
	EClass getJonction();

	/**
	 * Returns the meta object for the reference list '{@link LDPparallel.Jonction#getPred <em>Pred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Pred</em>'.
	 * @see LDPparallel.Jonction#getPred()
	 * @see #getJonction()
	 * @generated
	 */
	EReference getJonction_Pred();

	/**
	 * Returns the meta object for the reference '{@link LDPparallel.Jonction#getSucc <em>Succ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Succ</em>'.
	 * @see LDPparallel.Jonction#getSucc()
	 * @see #getJonction()
	 * @generated
	 */
	EReference getJonction_Succ();

	/**
	 * Returns the meta object for class '{@link LDPparallel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see LDPparallel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link LDPparallel.Operation#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see LDPparallel.Operation#getMethodName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link LDPparallel.Operation#getReturnTag <em>Return Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Tag</em>'.
	 * @see LDPparallel.Operation#getReturnTag()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnTag();

	/**
	 * Returns the meta object for the attribute list '{@link LDPparallel.Operation#getParamsTag <em>Params Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Params Tag</em>'.
	 * @see LDPparallel.Operation#getParamsTag()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ParamsTag();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LDPparallelFactory getLDPparallelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link LDPparallel.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.ProcessusImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Sequences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__SEQUENCES = eINSTANCE.getProcessus_Sequences();

		/**
		 * The meta object literal for the '<em><b>Portes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__PORTES = eINSTANCE.getProcessus_Portes();

		/**
		 * The meta object literal for the '<em><b>Debut</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__DEBUT = eINSTANCE.getProcessus_Debut();

		/**
		 * The meta object literal for the '<em><b>Fin</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__FIN = eINSTANCE.getProcessus_Fin();

		/**
		 * The meta object literal for the '<em><b>Sequences Actives</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__SEQUENCES_ACTIVES = eINSTANCE.getProcessus_SequencesActives();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.ElementProcessusImpl <em>Element Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.ElementProcessusImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getElementProcessus()
		 * @generated
		 */
		EClass ELEMENT_PROCESSUS = eINSTANCE.getElementProcessus();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.SequenceImpl <em>Sequence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.SequenceImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getSequence()
		 * @generated
		 */
		EClass SEQUENCE = eINSTANCE.getSequence();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEQUENCE__NAME = eINSTANCE.getSequence_Name();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIVITES = eINSTANCE.getSequence_Activites();

		/**
		 * The meta object literal for the '<em><b>Activite Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__ACTIVITE_COURANTE = eINSTANCE.getSequence_ActiviteCourante();

		/**
		 * The meta object literal for the '<em><b>Premiere Activite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEQUENCE__PREMIERE_ACTIVITE = eINSTANCE.getSequence_PremiereActivite();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.ActiviteImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getActivite()
		 * @generated
		 */
		EClass ACTIVITE = eINSTANCE.getActivite();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTIVITE__DESCRIPTION = eINSTANCE.getActivite_Description();

		/**
		 * The meta object literal for the '<em><b>Suivante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__SUIVANTE = eINSTANCE.getActivite_Suivante();

		/**
		 * The meta object literal for the '<em><b>Precedente</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__PRECEDENTE = eINSTANCE.getActivite_Precedente();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITE__ACTION = eINSTANCE.getActivite_Action();

		/**
		 * The meta object literal for the '<em><b>Pas Dans Suivant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE = eINSTANCE.getActivite__PasDansSuivant__Activite();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.PseudoEtatImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getPseudoEtat()
		 * @generated
		 */
		EClass PSEUDO_ETAT = eINSTANCE.getPseudoEtat();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PSEUDO_ETAT__REFERENCE = eINSTANCE.getPseudoEtat_Reference();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.DebutImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.FinImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.PorteImpl <em>Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.PorteImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getPorte()
		 * @generated
		 */
		EClass PORTE = eINSTANCE.getPorte();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.FourcheImpl <em>Fourche</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.FourcheImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getFourche()
		 * @generated
		 */
		EClass FOURCHE = eINSTANCE.getFourche();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOURCHE__PRED = eINSTANCE.getFourche_Pred();

		/**
		 * The meta object literal for the '<em><b>Succ</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOURCHE__SUCC = eINSTANCE.getFourche_Succ();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.JonctionImpl <em>Jonction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.JonctionImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getJonction()
		 * @generated
		 */
		EClass JONCTION = eINSTANCE.getJonction();

		/**
		 * The meta object literal for the '<em><b>Pred</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JONCTION__PRED = eINSTANCE.getJonction_Pred();

		/**
		 * The meta object literal for the '<em><b>Succ</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JONCTION__SUCC = eINSTANCE.getJonction_Succ();

		/**
		 * The meta object literal for the '{@link LDPparallel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDPparallel.impl.OperationImpl
		 * @see LDPparallel.impl.LDPparallelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '<em><b>Method Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__METHOD_NAME = eINSTANCE.getOperation_MethodName();

		/**
		 * The meta object literal for the '<em><b>Return Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__RETURN_TAG = eINSTANCE.getOperation_ReturnTag();

		/**
		 * The meta object literal for the '<em><b>Params Tag</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION__PARAMS_TAG = eINSTANCE.getOperation_ParamsTag();

	}

} //LDPparallelPackage
