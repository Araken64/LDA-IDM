/**
 */
package LDPparallel.impl;

import LDPparallel.Debut;
import LDPparallel.Fin;
import LDPparallel.LDPparallelPackage;
import LDPparallel.Porte;
import LDPparallel.Processus;
import LDPparallel.Sequence;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.impl.ProcessusImpl#getSequences <em>Sequences</em>}</li>
 *   <li>{@link LDPparallel.impl.ProcessusImpl#getPortes <em>Portes</em>}</li>
 *   <li>{@link LDPparallel.impl.ProcessusImpl#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDPparallel.impl.ProcessusImpl#getFin <em>Fin</em>}</li>
 *   <li>{@link LDPparallel.impl.ProcessusImpl#getSequencesActives <em>Sequences Actives</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcessusImpl extends MinimalEObjectImpl.Container implements Processus {
	/**
	 * The cached value of the '{@link #getSequences() <em>Sequences</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequences()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequences;

	/**
	 * The cached value of the '{@link #getPortes() <em>Portes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortes()
	 * @generated
	 * @ordered
	 */
	protected EList<Porte> portes;

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
	 * The cached value of the '{@link #getSequencesActives() <em>Sequences Actives</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSequencesActives()
	 * @generated
	 * @ordered
	 */
	protected EList<Sequence> sequencesActives;

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
		return LDPparallelPackage.Literals.PROCESSUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sequence> getSequences() {
		if (sequences == null) {
			sequences = new EObjectContainmentEList<Sequence>(Sequence.class, this, LDPparallelPackage.PROCESSUS__SEQUENCES);
		}
		return sequences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Porte> getPortes() {
		if (portes == null) {
			portes = new EObjectContainmentEList<Porte>(Porte.class, this, LDPparallelPackage.PROCESSUS__PORTES);
		}
		return portes;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPparallelPackage.PROCESSUS__DEBUT, oldDebut, newDebut);
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
				msgs = ((InternalEObject)debut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.PROCESSUS__DEBUT, null, msgs);
			if (newDebut != null)
				msgs = ((InternalEObject)newDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.PROCESSUS__DEBUT, null, msgs);
			msgs = basicSetDebut(newDebut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.PROCESSUS__DEBUT, newDebut, newDebut));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPparallelPackage.PROCESSUS__FIN, oldFin, newFin);
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
				msgs = ((InternalEObject)fin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.PROCESSUS__FIN, null, msgs);
			if (newFin != null)
				msgs = ((InternalEObject)newFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.PROCESSUS__FIN, null, msgs);
			msgs = basicSetFin(newFin, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.PROCESSUS__FIN, newFin, newFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Sequence> getSequencesActives() {
		if (sequencesActives == null) {
			sequencesActives = new EObjectResolvingEList<Sequence>(Sequence.class, this, LDPparallelPackage.PROCESSUS__SEQUENCES_ACTIVES);
		}
		return sequencesActives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPparallelPackage.PROCESSUS__SEQUENCES:
				return ((InternalEList<?>)getSequences()).basicRemove(otherEnd, msgs);
			case LDPparallelPackage.PROCESSUS__PORTES:
				return ((InternalEList<?>)getPortes()).basicRemove(otherEnd, msgs);
			case LDPparallelPackage.PROCESSUS__DEBUT:
				return basicSetDebut(null, msgs);
			case LDPparallelPackage.PROCESSUS__FIN:
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
			case LDPparallelPackage.PROCESSUS__SEQUENCES:
				return getSequences();
			case LDPparallelPackage.PROCESSUS__PORTES:
				return getPortes();
			case LDPparallelPackage.PROCESSUS__DEBUT:
				return getDebut();
			case LDPparallelPackage.PROCESSUS__FIN:
				return getFin();
			case LDPparallelPackage.PROCESSUS__SEQUENCES_ACTIVES:
				return getSequencesActives();
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
			case LDPparallelPackage.PROCESSUS__SEQUENCES:
				getSequences().clear();
				getSequences().addAll((Collection<? extends Sequence>)newValue);
				return;
			case LDPparallelPackage.PROCESSUS__PORTES:
				getPortes().clear();
				getPortes().addAll((Collection<? extends Porte>)newValue);
				return;
			case LDPparallelPackage.PROCESSUS__DEBUT:
				setDebut((Debut)newValue);
				return;
			case LDPparallelPackage.PROCESSUS__FIN:
				setFin((Fin)newValue);
				return;
			case LDPparallelPackage.PROCESSUS__SEQUENCES_ACTIVES:
				getSequencesActives().clear();
				getSequencesActives().addAll((Collection<? extends Sequence>)newValue);
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
			case LDPparallelPackage.PROCESSUS__SEQUENCES:
				getSequences().clear();
				return;
			case LDPparallelPackage.PROCESSUS__PORTES:
				getPortes().clear();
				return;
			case LDPparallelPackage.PROCESSUS__DEBUT:
				setDebut((Debut)null);
				return;
			case LDPparallelPackage.PROCESSUS__FIN:
				setFin((Fin)null);
				return;
			case LDPparallelPackage.PROCESSUS__SEQUENCES_ACTIVES:
				getSequencesActives().clear();
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
			case LDPparallelPackage.PROCESSUS__SEQUENCES:
				return sequences != null && !sequences.isEmpty();
			case LDPparallelPackage.PROCESSUS__PORTES:
				return portes != null && !portes.isEmpty();
			case LDPparallelPackage.PROCESSUS__DEBUT:
				return debut != null;
			case LDPparallelPackage.PROCESSUS__FIN:
				return fin != null;
			case LDPparallelPackage.PROCESSUS__SEQUENCES_ACTIVES:
				return sequencesActives != null && !sequencesActives.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProcessusImpl
