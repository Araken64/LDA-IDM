/**
 */
package LDPparallel.impl;

import LDPparallel.Activite;
import LDPparallel.LDPparallelPackage;
import LDPparallel.Operation;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.impl.ActiviteImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link LDPparallel.impl.ActiviteImpl#getSuivante <em>Suivante</em>}</li>
 *   <li>{@link LDPparallel.impl.ActiviteImpl#getPrecedente <em>Precedente</em>}</li>
 *   <li>{@link LDPparallel.impl.ActiviteImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActiviteImpl extends MinimalEObjectImpl.Container implements Activite {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuivante() <em>Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuivante()
	 * @generated
	 * @ordered
	 */
	protected Activite suivante;

	/**
	 * The cached value of the '{@link #getPrecedente() <em>Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecedente()
	 * @generated
	 * @ordered
	 */
	protected Activite precedente;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Operation action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActiviteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPparallelPackage.Literals.ACTIVITE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getSuivante() {
		if (suivante != null && suivante.eIsProxy()) {
			InternalEObject oldSuivante = (InternalEObject)suivante;
			suivante = (Activite)eResolveProxy(oldSuivante);
			if (suivante != oldSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.ACTIVITE__SUIVANTE, oldSuivante, suivante));
			}
		}
		return suivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetSuivante() {
		return suivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuivante(Activite newSuivante, NotificationChain msgs) {
		Activite oldSuivante = suivante;
		suivante = newSuivante;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__SUIVANTE, oldSuivante, newSuivante);
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
	public void setSuivante(Activite newSuivante) {
		if (newSuivante != suivante) {
			NotificationChain msgs = null;
			if (suivante != null)
				msgs = ((InternalEObject)suivante).eInverseRemove(this, LDPparallelPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
			if (newSuivante != null)
				msgs = ((InternalEObject)newSuivante).eInverseAdd(this, LDPparallelPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
			msgs = basicSetSuivante(newSuivante, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__SUIVANTE, newSuivante, newSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Activite getPrecedente() {
		if (precedente != null && precedente.eIsProxy()) {
			InternalEObject oldPrecedente = (InternalEObject)precedente;
			precedente = (Activite)eResolveProxy(oldPrecedente);
			if (precedente != oldPrecedente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LDPparallelPackage.ACTIVITE__PRECEDENTE, oldPrecedente, precedente));
			}
		}
		return precedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activite basicGetPrecedente() {
		return precedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrecedente(Activite newPrecedente, NotificationChain msgs) {
		Activite oldPrecedente = precedente;
		precedente = newPrecedente;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__PRECEDENTE, oldPrecedente, newPrecedente);
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
	public void setPrecedente(Activite newPrecedente) {
		if (newPrecedente != precedente) {
			NotificationChain msgs = null;
			if (precedente != null)
				msgs = ((InternalEObject)precedente).eInverseRemove(this, LDPparallelPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
			if (newPrecedente != null)
				msgs = ((InternalEObject)newPrecedente).eInverseAdd(this, LDPparallelPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
			msgs = basicSetPrecedente(newPrecedente, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__PRECEDENTE, newPrecedente, newPrecedente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Operation newAction, NotificationChain msgs) {
		Operation oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__ACTION, oldAction, newAction);
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
	public void setAction(Operation newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.ACTIVITE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LDPparallelPackage.ACTIVITE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPparallelPackage.ACTIVITE__ACTION, newAction, newAction));
	}

	/**
	 * The cached invocation delegate for the '{@link #pasDansSuivant(LDPparallel.Activite) <em>Pas Dans Suivant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #pasDansSuivant(LDPparallel.Activite)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate PAS_DANS_SUIVANT_ACTIVITE__EINVOCATION_DELEGATE = ((EOperation.Internal)LDPparallelPackage.Literals.ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean pasDansSuivant(Activite act) {
		try {
			return (Boolean)PAS_DANS_SUIVANT_ACTIVITE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{act}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				if (suivante != null)
					msgs = ((InternalEObject)suivante).eInverseRemove(this, LDPparallelPackage.ACTIVITE__PRECEDENTE, Activite.class, msgs);
				return basicSetSuivante((Activite)otherEnd, msgs);
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				if (precedente != null)
					msgs = ((InternalEObject)precedente).eInverseRemove(this, LDPparallelPackage.ACTIVITE__SUIVANTE, Activite.class, msgs);
				return basicSetPrecedente((Activite)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				return basicSetSuivante(null, msgs);
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				return basicSetPrecedente(null, msgs);
			case LDPparallelPackage.ACTIVITE__ACTION:
				return basicSetAction(null, msgs);
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
			case LDPparallelPackage.ACTIVITE__DESCRIPTION:
				return getDescription();
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				if (resolve) return getSuivante();
				return basicGetSuivante();
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				if (resolve) return getPrecedente();
				return basicGetPrecedente();
			case LDPparallelPackage.ACTIVITE__ACTION:
				return getAction();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LDPparallelPackage.ACTIVITE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				setSuivante((Activite)newValue);
				return;
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				setPrecedente((Activite)newValue);
				return;
			case LDPparallelPackage.ACTIVITE__ACTION:
				setAction((Operation)newValue);
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
			case LDPparallelPackage.ACTIVITE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				setSuivante((Activite)null);
				return;
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				setPrecedente((Activite)null);
				return;
			case LDPparallelPackage.ACTIVITE__ACTION:
				setAction((Operation)null);
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
			case LDPparallelPackage.ACTIVITE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case LDPparallelPackage.ACTIVITE__SUIVANTE:
				return suivante != null;
			case LDPparallelPackage.ACTIVITE__PRECEDENTE:
				return precedente != null;
			case LDPparallelPackage.ACTIVITE__ACTION:
				return action != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case LDPparallelPackage.ACTIVITE___PAS_DANS_SUIVANT__ACTIVITE:
				return pasDansSuivant((Activite)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //ActiviteImpl
