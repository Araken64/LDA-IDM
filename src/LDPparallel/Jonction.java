/**
 */
package LDPparallel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Jonction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.Jonction#getPred <em>Pred</em>}</li>
 *   <li>{@link LDPparallel.Jonction#getSucc <em>Succ</em>}</li>
 * </ul>
 *
 * @see LDPparallel.LDPparallelPackage#getJonction()
 * @model
 * @generated
 */
public interface Jonction extends Porte {
	/**
	 * Returns the value of the '<em><b>Pred</b></em>' reference list.
	 * The list contents are of type {@link LDPparallel.ElementProcessus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' reference list.
	 * @see LDPparallel.LDPparallelPackage#getJonction_Pred()
	 * @model required="true"
	 * @generated
	 */
	EList<ElementProcessus> getPred();

	/**
	 * Returns the value of the '<em><b>Succ</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ</em>' reference.
	 * @see #setSucc(ElementProcessus)
	 * @see LDPparallel.LDPparallelPackage#getJonction_Succ()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getSucc();

	/**
	 * Sets the value of the '{@link LDPparallel.Jonction#getSucc <em>Succ</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Succ</em>' reference.
	 * @see #getSucc()
	 * @generated
	 */
	void setSucc(ElementProcessus value);

} // Jonction
