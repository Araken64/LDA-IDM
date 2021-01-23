/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Operation#getMethodName <em>Method Name</em>}</li>
 *   <li>{@link LDP.Operation#getReturnTag <em>Return Tag</em>}</li>
 *   <li>{@link LDP.Operation#getParamsTag <em>Params Tag</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends EObject {
	/**
	 * Returns the value of the '<em><b>Method Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Name</em>' attribute.
	 * @see #setMethodName(String)
	 * @see LDP.LDPPackage#getOperation_MethodName()
	 * @model required="true"
	 * @generated
	 */
	String getMethodName();

	/**
	 * Sets the value of the '{@link LDP.Operation#getMethodName <em>Method Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Name</em>' attribute.
	 * @see #getMethodName()
	 * @generated
	 */
	void setMethodName(String value);

	/**
	 * Returns the value of the '<em><b>Return Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Tag</em>' attribute.
	 * @see #setReturnTag(String)
	 * @see LDP.LDPPackage#getOperation_ReturnTag()
	 * @model
	 * @generated
	 */
	String getReturnTag();

	/**
	 * Sets the value of the '{@link LDP.Operation#getReturnTag <em>Return Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Tag</em>' attribute.
	 * @see #getReturnTag()
	 * @generated
	 */
	void setReturnTag(String value);

	/**
	 * Returns the value of the '<em><b>Params Tag</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Params Tag</em>' attribute list.
	 * @see LDP.LDPPackage#getOperation_ParamsTag()
	 * @model
	 * @generated
	 */
	EList<String> getParamsTag();

} // Operation
