/**
 */
package LDP.impl;

import LDP.Activite;
import LDP.Debut;
import LDP.Fin;
import LDP.LDPPackage;
import LDP.Processus;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.ProcessusImpl#getActivites <em>Activites</em>}</li>
 *   <li>{@link LDP.impl.ProcessusImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDP.impl.ProcessusImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link LDP.impl.ProcessusImpl#getActiviteCourante <em>Activite Courante</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessusImpl extends MinimalEObjectImpl.Container implements Processus {
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
	 * The cached value of the '{@link #getDebut() <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebut()
	 * @generated
	 * @ordered
	 */
	protected Debut debut;

	/**
	 * The cached value of the '{@link #getFin() <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFin()
	 * @generated
	 * @ordered
	 */
	protected Fin fin;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.PROCESSUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Activite> getActivites() {
		if (activites == null) {
			activites = new EObjectContainmentEList<Activite>(Activite.class, this, LDPPackage.PROCESSUS__ACTIVITES);
		}
		return activites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Debut getDebut() {
		return debut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDebut(Debut newDebut, NotificationChain msgs) {
		Debut oldDebut = debut;
		debut = newDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.PROCESSUS__DEBUT, oldDebut, newDebut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDebut(Debut newDebut) {
		if (newDebut != debut) {
			NotificationChain msgs = null;
			if (debut != null)
				msgs = ((InternalEObject)debut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPPackage.PROCESSUS__DEBUT, null, msgs);
			if (newDebut != null)
				msgs = ((InternalEObject)newDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPPackage.PROCESSUS__DEBUT, null, msgs);
			msgs = basicSetDebut(newDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.PROCESSUS__DEBUT, newDebut, newDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fin getFin() {
		return fin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFin(Fin newFin, NotificationChain msgs) {
		Fin oldFin = fin;
		fin = newFin;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPPackage.PROCESSUS__FIN, oldFin, newFin);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFin(Fin newFin) {
		if (newFin != fin) {
			NotificationChain msgs = null;
			if (fin != null)
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPPackage.PROCESSUS__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPPackage.PROCESSUS__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.PROCESSUS__FIN, newFin, newFin));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPPackage.PROCESSUS__ACTIVITE_COURANTE, oldActiviteCourante, activiteCourante));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.PROCESSUS__ACTIVITE_COURANTE, oldActiviteCourante, activiteCourante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPPackage.PROCESSUS__ACTIVITES:
				return ((InternalEList<?>)getActivites()).basicRemove(otherEnd, msgs);
			case LDPPackage.PROCESSUS__DEBUT:
				return basicSetDebut(null, msgs);
			case LDPPackage.PROCESSUS__FIN:
				return basicSetFin(null, msgs);
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
			case LDPPackage.PROCESSUS__ACTIVITES:
				return getActivites();
			case LDPPackage.PROCESSUS__DEBUT:
				return getDebut();
			case LDPPackage.PROCESSUS__FIN:
				return getFin();
			case LDPPackage.PROCESSUS__ACTIVITE_COURANTE:
				if (resolve) return getActiviteCourante();
				return basicGetActiviteCourante();
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
			case LDPPackage.PROCESSUS__ACTIVITES:
				getActivites().clear();
				getActivites().addAll((Collection<? extends Activite>)newValue);
				return;
			case LDPPackage.PROCESSUS__DEBUT:
				setDebut((Debut)newValue);
				return;
			case LDPPackage.PROCESSUS__FIN:
				setFin((Fin)newValue);
				return;
			case LDPPackage.PROCESSUS__ACTIVITE_COURANTE:
				setActiviteCourante((Activite)newValue);
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
			case LDPPackage.PROCESSUS__ACTIVITES:
				getActivites().clear();
				return;
			case LDPPackage.PROCESSUS__DEBUT:
				setDebut((Debut)null);
				return;
			case LDPPackage.PROCESSUS__FIN:
				setFin((Fin)null);
				return;
			case LDPPackage.PROCESSUS__ACTIVITE_COURANTE:
				setActiviteCourante((Activite)null);
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
			case LDPPackage.PROCESSUS__ACTIVITES:
				return activites != null && !activites.isEmpty();
			case LDPPackage.PROCESSUS__DEBUT:
				return debut != null;
			case LDPPackage.PROCESSUS__FIN:
				return fin != null;
			case LDPPackage.PROCESSUS__ACTIVITE_COURANTE:
				return activiteCourante != null;
		}
		return super.eIsSet(featureID);
	}

} //ProcessusImpl
