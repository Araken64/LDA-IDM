/**
 */
package LDPparallel.impl;

import LDPparallel.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LDPparallelFactoryImpl extends EFactoryImpl implements LDPparallelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LDPparallelFactory init() {
		try {
			LDPparallelFactory theLDPparallelFactory = (LDPparallelFactory)EPackage.Registry.INSTANCE.getEFactory(LDPparallelPackage.eNS_URI);
			if (theLDPparallelFactory != null) {
				return theLDPparallelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LDPparallelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPparallelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case LDPparallelPackage.PROCESSUS: return createProcessus();
			case LDPparallelPackage.SEQUENCE: return createSequence();
			case LDPparallelPackage.ACTIVITE: return createActivite();
			case LDPparallelPackage.DEBUT: return createDebut();
			case LDPparallelPackage.FIN: return createFin();
			case LDPparallelPackage.FOURCHE: return createFourche();
			case LDPparallelPackage.JONCTION: return createJonction();
			case LDPparallelPackage.OPERATION: return createOperation();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Processus createProcessus() {
		ProcessusImpl processus = new ProcessusImpl();
		return processus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sequence createSequence() {
		SequenceImpl sequence = new SequenceImpl();
		return sequence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite createActivite() {
		ActiviteImpl activite = new ActiviteImpl();
		return activite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Debut createDebut() {
		DebutImpl debut = new DebutImpl();
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fin createFin() {
		FinImpl fin = new FinImpl();
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fourche createFourche() {
		FourcheImpl fourche = new FourcheImpl();
		return fourche;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Jonction createJonction() {
		JonctionImpl jonction = new JonctionImpl();
		return jonction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LDPparallelPackage getLDPparallelPackage() {
		return (LDPparallelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LDPparallelPackage getPackage() {
		return LDPparallelPackage.eINSTANCE;
	}

} //LDPparallelFactoryImpl
