/**
 */
package LDPparallel.util;

import LDPparallel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see LDPparallel.LDPparallelPackage
 * @generated
 */
public class LDPparallelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LDPparallelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPparallelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LDPparallelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LDPparallelSwitch<Adapter> modelSwitch =
		new LDPparallelSwitch<Adapter>() {
			@Override
			public Adapter caseProcessus(Processus object) {
				return createProcessusAdapter();
			}
			@Override
			public Adapter caseElementProcessus(ElementProcessus object) {
				return createElementProcessusAdapter();
			}
			@Override
			public Adapter caseSequence(Sequence object) {
				return createSequenceAdapter();
			}
			@Override
			public Adapter caseActivite(Activite object) {
				return createActiviteAdapter();
			}
			@Override
			public Adapter casePseudoEtat(PseudoEtat object) {
				return createPseudoEtatAdapter();
			}
			@Override
			public Adapter caseDebut(Debut object) {
				return createDebutAdapter();
			}
			@Override
			public Adapter caseFin(Fin object) {
				return createFinAdapter();
			}
			@Override
			public Adapter casePorte(Porte object) {
				return createPorteAdapter();
			}
			@Override
			public Adapter caseFourche(Fourche object) {
				return createFourcheAdapter();
			}
			@Override
			public Adapter caseJonction(Jonction object) {
				return createJonctionAdapter();
			}
			@Override
			public Adapter caseOperation(Operation object) {
				return createOperationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Processus <em>Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Processus
	 * @generated
	 */
	public Adapter createProcessusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.ElementProcessus <em>Element Processus</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.ElementProcessus
	 * @generated
	 */
	public Adapter createElementProcessusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Sequence <em>Sequence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Sequence
	 * @generated
	 */
	public Adapter createSequenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Activite <em>Activite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Activite
	 * @generated
	 */
	public Adapter createActiviteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.PseudoEtat <em>Pseudo Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.PseudoEtat
	 * @generated
	 */
	public Adapter createPseudoEtatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Debut <em>Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Debut
	 * @generated
	 */
	public Adapter createDebutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Fin <em>Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Fin
	 * @generated
	 */
	public Adapter createFinAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Porte
	 * @generated
	 */
	public Adapter createPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Fourche <em>Fourche</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Fourche
	 * @generated
	 */
	public Adapter createFourcheAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Jonction <em>Jonction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Jonction
	 * @generated
	 */
	public Adapter createJonctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link LDPparallel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see LDPparallel.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LDPparallelAdapterFactory
