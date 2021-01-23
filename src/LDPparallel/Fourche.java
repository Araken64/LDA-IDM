/**
 */
package LDPparallel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fourche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.Fourche#getPred <em>Pred</em>}</li>
 *   <li>{@link LDPparallel.Fourche#getSucc <em>Succ</em>}</li>
 * </ul>
 *
 * @see LDPparallel.LDPparallelPackage#getFourche()
 * @model
 * @generated
 */
public interface Fourche extends Porte {
	/**
	 * Returns the value of the '<em><b>Pred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' reference.
	 * @see #setPred(ElementProcessus)
	 * @see LDPparallel.LDPparallelPackage#getFourche_Pred()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getPred();

	/**
	 * Sets the value of the '{@link LDPparallel.Fourche#getPred <em>Pred</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' reference.
	 * @see #getPred()
	 * @generated
	 */
	void setPred(ElementProcessus value);

	/**
	 * Returns the value of the '<em><b>Succ</b></em>' reference list.
	 * The list contents are of type {@link LDPparallel.ElementProcessus}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Succ</em>' reference list.
	 * @see LDPparallel.LDPparallelPackage#getFourche_Succ()
	 * @model required="true"
	 * @generated
	 */
	EList<ElementProcessus> getSucc();

} // Fourche
