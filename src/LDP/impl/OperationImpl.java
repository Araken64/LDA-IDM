/**
 */
package LDP.impl;

import LDP.LDPPackage;
import LDP.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link LDP.impl.OperationImpl#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link LDP.impl.OperationImpl#getReturnTag <em>Return Tag</em>}</li>
 *   <li>{@link LDP.impl.OperationImpl#getParamsTag <em>Params Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends MinimalEObjectImpl.Container implements Operation {
	/**
	 * The default value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected static final String METHOD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMethodName() <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodName()
	 * @generated
	 * @ordered
	 */
	protected String methodName = METHOD_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnTag() <em>Return Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTag()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnTag() <em>Return Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnTag()
	 * @generated
	 * @ordered
	 */
	protected String returnTag = RETURN_TAG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParamsTag() <em>Params Tag</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamsTag()
	 * @generated
	 * @ordered
	 */
	protected EList<String> paramsTag;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LDPPackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMethodName() {
		return methodName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethodName(String newMethodName) {
		String oldMethodName = methodName;
		methodName = newMethodName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.OPERATION__METHOD_NAME, oldMethodName, methodName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReturnTag() {
		return returnTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReturnTag(String newReturnTag) {
		String oldReturnTag = returnTag;
		returnTag = newReturnTag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LDPPackage.OPERATION__RETURN_TAG, oldReturnTag, returnTag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getParamsTag() {
		if (paramsTag == null) {
			paramsTag = new EDataTypeUniqueEList<String>(String.class, this, LDPPackage.OPERATION__PARAMS_TAG);
		}
		return paramsTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LDPPackage.OPERATION__METHOD_NAME:
				return getMethodName();
			case LDPPackage.OPERATION__RETURN_TAG:
				return getReturnTag();
			case LDPPackage.OPERATION__PARAMS_TAG:
				return getParamsTag();
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
			case LDPPackage.OPERATION__METHOD_NAME:
				setMethodName((String)newValue);
				return;
			case LDPPackage.OPERATION__RETURN_TAG:
				setReturnTag((String)newValue);
				return;
			case LDPPackage.OPERATION__PARAMS_TAG:
				getParamsTag().clear();
				getParamsTag().addAll((Collection<? extends String>)newValue);
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
			case LDPPackage.OPERATION__METHOD_NAME:
				setMethodName(METHOD_NAME_EDEFAULT);
				return;
			case LDPPackage.OPERATION__RETURN_TAG:
				setReturnTag(RETURN_TAG_EDEFAULT);
				return;
			case LDPPackage.OPERATION__PARAMS_TAG:
				getParamsTag().clear();
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
			case LDPPackage.OPERATION__METHOD_NAME:
				return METHOD_NAME_EDEFAULT == null ? methodName != null : !METHOD_NAME_EDEFAULT.equals(methodName);
			case LDPPackage.OPERATION__RETURN_TAG:
				return RETURN_TAG_EDEFAULT == null ? returnTag != null : !RETURN_TAG_EDEFAULT.equals(returnTag);
			case LDPPackage.OPERATION__PARAMS_TAG:
				return paramsTag != null && !paramsTag.isEmpty();
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
		result.append(" (methodName: ");
		result.append(methodName);
		result.append(", returnTag: ");
		result.append(returnTag);
		result.append(", paramsTag: ");
		result.append(paramsTag);
		result.append(')');
		return result.toString();
	}

} //OperationImpl
