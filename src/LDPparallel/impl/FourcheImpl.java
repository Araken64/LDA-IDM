/**
 */
package LDPparallel.impl;

import LDPparallel.ElementProcessus;
import LDPparallel.Fourche;
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
 * An implementation of the model object '<em><b>Fourche</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.impl.FourcheImpl#getPred <em>Pred</em>}</li>
 *   <li>{@link LDPparallel.impl.FourcheImpl#getSucc <em>Succ</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FourcheImpl extends PorteImpl implements Fourche {
	/**
	 * The cached value of the '{@link #getPred() <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPred()
	 * @generated
	 * @ordered
	 */
	protected ElementProcessus pred;

	/**
	 * The cached value of the '{@link #getSucc() <em>Succ</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSucc()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementProcessus> succ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FourcheImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPparallelPackage.Literals.FOURCHE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElementProcessus getPred() {
		if (pred != null && pred.eIsProxy()) {
			InternalEObject oldPred = (InternalEObject)pred;
			pred = (ElementProcessus)eResolveProxy(oldPred);
			if (pred != oldPred) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.FOURCHE__PRED, oldPred, pred));
			}
		}
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementProcessus basicGetPred() {
		return pred;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPred(ElementProcessus newPred) {
		ElementProcessus oldPred = pred;
		pred = newPred;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.FOURCHE__PRED, oldPred, pred));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementProcessus> getSucc() {
		if (succ == null) {
			succ = new EObjectResolvingEList<ElementProcessus>(ElementProcessus.class, this, LDPparallelPackage.FOURCHE__SUCC);
		}
		return succ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPparallelPackage.FOURCHE__PRED:
				if (resolve) return getPred();
				return basicGetPred();
			case LDPparallelPackage.FOURCHE__SUCC:
				return getSucc();
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
			case LDPparallelPackage.FOURCHE__PRED:
				setPred((ElementProcessus)newValue);
				return;
			case LDPparallelPackage.FOURCHE__SUCC:
				getSucc().clear();
				getSucc().addAll((Collection<? extends ElementProcessus>)newValue);
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
			case LDPparallelPackage.FOURCHE__PRED:
				setPred((ElementProcessus)null);
				return;
			case LDPparallelPackage.FOURCHE__SUCC:
				getSucc().clear();
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
			case LDPparallelPackage.FOURCHE__PRED:
				return pred != null;
			case LDPparallelPackage.FOURCHE__SUCC:
				return succ != null && !succ.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FourcheImpl
