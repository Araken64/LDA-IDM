/**
 */
package LDP;

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
 * @see LDP.LDPFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface LDPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "LDP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.univ-pau.fr/m2ti/2020/LDP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "LDP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPPackage eINSTANCE = LDP.impl.LDPPackageImpl.init();

	/**
	 * The meta object id for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ProcessusImpl
	 * @see LDP.impl.LDPPackageImpl#getProcessus()
	 * @generated
	 */
	int PROCESSUS = 0;

	/**
	 * The feature id for the '<em><b>Activites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITES = 0;

	/**
	 * The feature id for the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__DEBUT = 1;

	/**
	 * The feature id for the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__FIN = 2;

	/**
	 * The feature id for the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS__ACTIVITE_COURANTE = 3;

	/**
	 * The number of structural features of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Processus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESSUS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.ActiviteImpl
	 * @see LDP.impl.LDPPackageImpl#getActivite()
	 * @generated
	 */
	int ACTIVITE = 1;

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
	 * The meta object id for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.PseudoEtatImpl
	 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
	 * @generated
	 */
	int PSEUDO_ETAT = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT__REFERENCE = 0;

	/**
	 * The number of structural features of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Pseudo Etat</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PSEUDO_ETAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.DebutImpl
	 * @see LDP.impl.LDPPackageImpl#getDebut()
	 * @generated
	 */
	int DEBUT = 3;

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
	 * The meta object id for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.FinImpl
	 * @see LDP.impl.LDPPackageImpl#getFin()
	 * @generated
	 */
	int FIN = 4;

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
	 * The meta object id for the '{@link LDP.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see LDP.impl.OperationImpl
	 * @see LDP.impl.LDPPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 5;

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
	 * Returns the meta object for class '{@link LDP.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Processus</em>'.
	 * @see LDP.Processus
	 * @generated
	 */
	EClass getProcessus();

	/**
	 * Returns the meta object for the containment reference list '{@link LDP.Processus#getActivites <em>Activites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activites</em>'.
	 * @see LDP.Processus#getActivites()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Activites();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getDebut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Debut</em>'.
	 * @see LDP.Processus#getDebut()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Debut();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Processus#getFin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fin</em>'.
	 * @see LDP.Processus#getFin()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_Fin();

	/**
	 * Returns the meta object for the reference '{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activite Courante</em>'.
	 * @see LDP.Processus#getActiviteCourante()
	 * @see #getProcessus()
	 * @generated
	 */
	EReference getProcessus_ActiviteCourante();

	/**
	 * Returns the meta object for class '{@link LDP.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activite</em>'.
	 * @see LDP.Activite
	 * @generated
	 */
	EClass getActivite();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Activite#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see LDP.Activite#getDescription()
	 * @see #getActivite()
	 * @generated
	 */
	EAttribute getActivite_Description();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getSuivante <em>Suivante</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Suivante</em>'.
	 * @see LDP.Activite#getSuivante()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Suivante();

	/**
	 * Returns the meta object for the reference '{@link LDP.Activite#getPrecedente <em>Precedente</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Precedente</em>'.
	 * @see LDP.Activite#getPrecedente()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Precedente();

	/**
	 * Returns the meta object for the containment reference '{@link LDP.Activite#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see LDP.Activite#getAction()
	 * @see #getActivite()
	 * @generated
	 */
	EReference getActivite_Action();

	/**
	 * Returns the meta object for the '{@link LDP.Activite#pasDansSuivant(LDP.Activite) <em>Pas Dans Suivant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pas Dans Suivant</em>' operation.
	 * @see LDP.Activite#pasDansSuivant(LDP.Activite)
	 * @generated
	 */
	EOperation getActivite__PasDansSuivant__Activite();

	/**
	 * Returns the meta object for class '{@link LDP.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pseudo Etat</em>'.
	 * @see LDP.PseudoEtat
	 * @generated
	 */
	EClass getPseudoEtat();

	/**
	 * Returns the meta object for the reference '{@link LDP.PseudoEtat#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference</em>'.
	 * @see LDP.PseudoEtat#getReference()
	 * @see #getPseudoEtat()
	 * @generated
	 */
	EReference getPseudoEtat_Reference();

	/**
	 * Returns the meta object for class '{@link LDP.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Debut</em>'.
	 * @see LDP.Debut
	 * @generated
	 */
	EClass getDebut();

	/**
	 * Returns the meta object for class '{@link LDP.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fin</em>'.
	 * @see LDP.Fin
	 * @generated
	 */
	EClass getFin();

	/**
	 * Returns the meta object for class '{@link LDP.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see LDP.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Operation#getMethodName <em>Method Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method Name</em>'.
	 * @see LDP.Operation#getMethodName()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_MethodName();

	/**
	 * Returns the meta object for the attribute '{@link LDP.Operation#getReturnTag <em>Return Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Return Tag</em>'.
	 * @see LDP.Operation#getReturnTag()
	 * @see #getOperation()
	 * @generated
	 */
	EAttribute getOperation_ReturnTag();

	/**
	 * Returns the meta object for the attribute list '{@link LDP.Operation#getParamsTag <em>Params Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Params Tag</em>'.
	 * @see LDP.Operation#getParamsTag()
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
	LDPFactory getLDPFactory();

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
		 * The meta object literal for the '{@link LDP.impl.ProcessusImpl <em>Processus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ProcessusImpl
		 * @see LDP.impl.LDPPackageImpl#getProcessus()
		 * @generated
		 */
		EClass PROCESSUS = eINSTANCE.getProcessus();

		/**
		 * The meta object literal for the '<em><b>Activites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITES = eINSTANCE.getProcessus_Activites();

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
		 * The meta object literal for the '<em><b>Activite Courante</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESSUS__ACTIVITE_COURANTE = eINSTANCE.getProcessus_ActiviteCourante();

		/**
		 * The meta object literal for the '{@link LDP.impl.ActiviteImpl <em>Activite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.ActiviteImpl
		 * @see LDP.impl.LDPPackageImpl#getActivite()
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
		 * The meta object literal for the '{@link LDP.impl.PseudoEtatImpl <em>Pseudo Etat</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.PseudoEtatImpl
		 * @see LDP.impl.LDPPackageImpl#getPseudoEtat()
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
		 * The meta object literal for the '{@link LDP.impl.DebutImpl <em>Debut</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.DebutImpl
		 * @see LDP.impl.LDPPackageImpl#getDebut()
		 * @generated
		 */
		EClass DEBUT = eINSTANCE.getDebut();

		/**
		 * The meta object literal for the '{@link LDP.impl.FinImpl <em>Fin</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.FinImpl
		 * @see LDP.impl.LDPPackageImpl#getFin()
		 * @generated
		 */
		EClass FIN = eINSTANCE.getFin();

		/**
		 * The meta object literal for the '{@link LDP.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see LDP.impl.OperationImpl
		 * @see LDP.impl.LDPPackageImpl#getOperation()
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

} //LDPPackage
