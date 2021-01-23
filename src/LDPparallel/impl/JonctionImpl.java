/**
 */
package LDPparallel.impl;

import LDPparallel.ElementProcessus;
import LDPparallel.Jonction;
import LDPparallel.LDPparallelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Jonction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.impl.JonctionImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link LDPparallel.impl.JonctionImpl#getSucc <em>Succ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JonctionImpl extends PorteImpl implements Jonction {
	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementProcessus> pred;

	/**
	 * The cached value of the '{@link #getSucc() <em>Succ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucc()
	 * @generated
	 * @ordered
	 */
	protected ElementProcessus succ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JonctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPparallelPackage.Literals.JONCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementProcessus> getPred() {
		if (pred == null) {
			pred = new EObjectResolvingEList<ElementProcessus>(ElementProcessus.class, this, LDPparallelPackage.JONCTION__PRED);
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementProcessus getSucc() {
		if (succ != null && succ.eIsProxy()) {
			InternalEObject oldSucc = (InternalEObject)succ;
			succ = (ElementProcessus)eResolveProxy(oldSucc);
			if (succ != oldSucc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.JONCTION__SUCC, oldSucc, succ));
			}
		}
		return succ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementProcessus basicGetSucc() {
		return succ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSucc(ElementProcessus newSucc) {
		ElementProcessus oldSucc = succ;
		succ = newSucc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.JONCTION__SUCC, oldSucc, succ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPparallelPackage.JONCTION__PRED:
				return getPred();
			case LDPparallelPackage.JONCTION__SUCC:
				if (resolve) return getSucc();
				return basicGetSucc();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPparallelPackage.JONCTION__PRED:
				getPred().clear();
				getPred().addAll((Collection<? extends ElementProcessus>)newValue);
				return;
			case LDPparallelPackage.JONCTION__SUCC:
				setSucc((ElementProcessus)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LDPparallelPackage.JONCTION__PRED:
				getPred().clear();
				return;
			case LDPparallelPackage.JONCTION__SUCC:
				setSucc((ElementProcessus)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LDPparallelPackage.JONCTION__PRED:
				return pred != null && !pred.isEmpty();
			case LDPparallelPackage.JONCTION__SUCC:
				return succ != null;
		}
		return super.eIsSet(featureID);
	}

} //JonctionImpl
