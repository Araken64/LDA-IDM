/**
 */
package LDP.impl;

import LDP.Activite;
import LDP.Debut;
import LDP.Fin;
import LDP.LDPFactory;
import LDP.LDPPackage;
import LDP.Operation;
import LDP.Processus;
import LDP.PseudoEtat;

import LDP.util.LDPValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDPPackageImpl extends EPackageImpl implements LDPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass processusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pseudoEtatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass debutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see LDP.LDPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LDPPackageImpl() {
		super(eNS_URI, LDPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LDPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LDPPackage init() {
		if (isInited) return (LDPPackage)EPackage.Registry.INSTANCE.getEPackage(LDPPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLDPPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LDPPackageImpl theLDPPackage = registeredLDPPackage instanceof LDPPackageImpl ? (LDPPackageImpl)registeredLDPPackage : new LDPPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLDPPackage.createPackageContents();

		// Initialize created meta-data
		theLDPPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theLDPPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return LDPValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLDPPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LDPPackage.eNS_URI, theLDPPackage);
		return theLDPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProcessus() {
		return processusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Activites() {
		return (EReference)processusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Debut() {
		return (EReference)processusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_Fin() {
		return (EReference)processusEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProcessus_ActiviteCourante() {
		return (EReference)processusEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getActivite() {
		return activiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getActivite_Description() {
		return (EAttribute)activiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Suivante() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Precedente() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getActivite_Action() {
		return (EReference)activiteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getActivite__PasDansSuivant__Activite() {
		return activiteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPseudoEtat() {
		return pseudoEtatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPseudoEtat_Reference() {
		return (EReference)pseudoEtatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDebut() {
		return debutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFin() {
		return finEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperation() {
		return operationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_MethodName() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_ReturnTag() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperation_ParamsTag() {
		return (EAttribute)operationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDPFactory getLDPFactory() {
		return (LDPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		processusEClass = createEClass(PROCESSUS);
		createEReference(processusEClass, PROCESSUS__ACTIVITES);
		createEReference(processusEClass, PROCESSUS__DEBUT);
		createEReference(processusEClass, PROCESSUS__FIN);
		createEReference(processusEClass, PROCESSUS__ACTIVITE_COURANTE);

		activiteEClass = createEClass(ACTIVITE);
		createEAttribute(activiteEClass, ACTIVITE__DESCRIPTION);
		createEReference(activiteEClass, ACTIVITE__SUIVANTE);
		createEReference(activiteEClass, ACTIVITE__PRECEDENTE);
		createEReference(activiteEClass, ACTIVITE__ACTION);
		createEOperation(activiteEClass, ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE);

		pseudoEtatEClass = createEClass(PSEUDO_ETAT);
		createEReference(pseudoEtatEClass, PSEUDO_ETAT__REFERENCE);

		debutEClass = createEClass(DEBUT);

		finEClass = createEClass(FIN);

		operationEClass = createEClass(OPERATION);
		createEAttribute(operationEClass, OPERATION__METHOD_NAME);
		createEAttribute(operationEClass, OPERATION__RETURN_TAG);
		createEAttribute(operationEClass, OPERATION__PARAMS_TAG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		debutEClass.getESuperTypes().add(this.getPseudoEtat());
		finEClass.getESuperTypes().add(this.getPseudoEtat());

		// Initialize classes, features, and operations; add parameters
		initEClass(processusEClass, Processus.class, "Processus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcessus_Activites(), this.getActivite(), null, "activites", null, 1, -1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Debut(), this.getDebut(), null, "debut", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_Fin(), this.getFin(), null, "fin", null, 1, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcessus_ActiviteCourante(), this.getActivite(), null, "activiteCourante", null, 0, 1, Processus.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activiteEClass, Activite.class, "Activite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActivite_Description(), ecorePackage.getEString(), "description", null, 1, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Suivante(), this.getActivite(), this.getActivite_Precedente(), "suivante", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Precedente(), this.getActivite(), this.getActivite_Suivante(), "precedente", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivite_Action(), this.getOperation(), null, "action", null, 0, 1, Activite.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getActivite__PasDansSuivant__Activite(), ecorePackage.getEBoolean(), "pasDansSuivant", 1, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActivite(), "act", 1, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(pseudoEtatEClass, PseudoEtat.class, "PseudoEtat", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPseudoEtat_Reference(), this.getActivite(), null, "reference", null, 1, 1, PseudoEtat.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(debutEClass, Debut.class, "Debut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(finEClass, Fin.class, "Fin", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(operationEClass, Operation.class, "Operation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOperation_MethodName(), ecorePackage.getEString(), "methodName", null, 1, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_ReturnTag(), ecorePackage.getEString(), "returnTag", null, 0, 1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperation_ParamsTag(), ecorePackage.getEString(), "paramsTag", null, 0, -1, Operation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
			   "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
		   });
		addAnnotation
		  (processusEClass,
		   source,
		   new String[] {
			   "constraints", "suivant precedent"
		   });
		addAnnotation
		  (activiteEClass,
		   source,
		   new String[] {
			   "constraints", "pasDeCycle"
		   });
		addAnnotation
		  (debutEClass,
		   source,
		   new String[] {
			   "constraints", "premiereActivite"
		   });
		addAnnotation
		  (finEClass,
		   source,
		   new String[] {
			   "constraints", "derniersActivite"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (processusEClass,
		   source,
		   new String[] {
			   "suivant", "self.activites -> one( a : Activite | a.suivante.oclIsUndefined())",
			   "precedent", "self.activites -> one(a : Activite | a.precedente.oclIsUndefined())"
		   });
		addAnnotation
		  (activiteEClass,
		   source,
		   new String[] {
			   "pasDeCycle", "self.pasDansSuivant(self)"
		   });
		addAnnotation
		  (getActivite__PasDansSuivant__Activite(),
		   source,
		   new String[] {
			   "body", "if self.suivante.oclIsUndefined() then true \n\t\t\t      else not(self.suivante = act) and self.suivante.pasDansSuivant(act)\n\t\t\t      endif"
		   });
		addAnnotation
		  (debutEClass,
		   source,
		   new String[] {
			   "premiereActivite", "self.reference.precedente.oclIsUndefined()"
		   });
		addAnnotation
		  (finEClass,
		   source,
		   new String[] {
			   "derniersActivite", "self.reference.suivante.oclIsUndefined()"
		   });
	}

} //LDPPackageImpl
