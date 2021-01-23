/**
 */
package LDPparallel.impl;

import LDPparallel.Activite;
import LDPparallel.LDPparallelPackage;
import LDPparallel.Sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.impl.SequenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link LDPparallel.impl.SequenceImpl#getActivites <em>Activites</em>}</li>
 *   <li>{@link LDPparallel.impl.SequenceImpl#getActiviteCourante <em>Activite Courante</em>}</li>
 *   <li>{@link LDPparallel.impl.SequenceImpl#getPremiereActivite <em>Premiere Activite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceImpl extends ElementProcessusImpl implements Sequence {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActivites() <em>Activites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivites()
	 * @generated
	 * @ordered
	 */
	protected EList<Activite> activites;

	/**
	 * The cached value of the '{@link #getActiviteCourante() <em>Activite Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiviteCourante()
	 * @generated
	 * @ordered
	 */
	protected Activite activiteCourante;

	/**
	 * The cached value of the '{@link #getPremiereActivite() <em>Premiere Activite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPremiereActivite()
	 * @generated
	 * @ordered
	 */
	protected Activite premiereActivite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPparallelPackage.Literals.SEQUENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.SEQUENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activite> getActivites() {
		if (activites == null) {
			activites = new EObjectContainmentEList<Activite>(Activite.class, this, LDPparallelPackage.SEQUENCE__ACTIVITES);
		}
		return activites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getActiviteCourante() {
		if (activiteCourante != null && activiteCourante.eIsProxy()) {
			InternalEObject oldActiviteCourante = (InternalEObject)activiteCourante;
			activiteCourante = (Activite)eResolveProxy(oldActiviteCourante);
			if (activiteCourante != oldActiviteCourante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE, oldActiviteCourante, activiteCourante));
			}
		}
		return activiteCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetActiviteCourante() {
		return activiteCourante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActiviteCourante(Activite newActiviteCourante) {
		Activite oldActiviteCourante = activiteCourante;
		activiteCourante = newActiviteCourante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE, oldActiviteCourante, activiteCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getPremiereActivite() {
		if (premiereActivite != null && premiereActivite.eIsProxy()) {
			InternalEObject oldPremiereActivite = (InternalEObject)premiereActivite;
			premiereActivite = (Activite)eResolveProxy(oldPremiereActivite);
			if (premiereActivite != oldPremiereActivite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE, oldPremiereActivite, premiereActivite));
			}
		}
		return premiereActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetPremiereActivite() {
		return premiereActivite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPremiereActivite(Activite newPremiereActivite) {
		Activite oldPremiereActivite = premiereActivite;
		premiereActivite = newPremiereActivite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE, oldPremiereActivite, premiereActivite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPparallelPackage.SEQUENCE__ACTIVITES:
				return ((InternalEList<?>)getActivites()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPparallelPackage.SEQUENCE__NAME:
				return getName();
			case LDPparallelPackage.SEQUENCE__ACTIVITES:
				return getActivites();
			case LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE:
				if (resolve) return getActiviteCourante();
				return basicGetActiviteCourante();
			case LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE:
				if (resolve) return getPremiereActivite();
				return basicGetPremiereActivite();
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
			case LDPparallelPackage.SEQUENCE__NAME:
				setName((String)newValue);
				return;
			case LDPparallelPackage.SEQUENCE__ACTIVITES:
				getActivites().clear();
				getActivites().addAll((Collection<? extends Activite>)newValue);
				return;
			case LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE:
				setActiviteCourante((Activite)newValue);
				return;
			case LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE:
				setPremiereActivite((Activite)newValue);
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
			case LDPparallelPackage.SEQUENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case LDPparallelPackage.SEQUENCE__ACTIVITES:
				getActivites().clear();
				return;
			case LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE:
				setActiviteCourante((Activite)null);
				return;
			case LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE:
				setPremiereActivite((Activite)null);
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
			case LDPparallelPackage.SEQUENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case LDPparallelPackage.SEQUENCE__ACTIVITES:
				return activites != null && !activites.isEmpty();
			case LDPparallelPackage.SEQUENCE__ACTIVITE_COURANTE:
				return activiteCourante != null;
			case LDPparallelPackage.SEQUENCE__PREMIERE_ACTIVITE:
				return premiereActivite != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SequenceImpl
