/**
 */
package LDPparallel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Etat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.PseudoEtat#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see LDPparallel.LDPparallelPackage#getPseudoEtat()
 * @model abstract="true"
 * @generated
 */
public interface PseudoEtat extends ElementProcessus {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(ElementProcessus)
	 * @see LDPparallel.LDPparallelPackage#getPseudoEtat_Reference()
	 * @model required="true"
	 * @generated
	 */
	ElementProcessus getReference();

	/**
	 * Sets the value of the '{@link LDPparallel.PseudoEtat#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(ElementProcessus value);

} // PseudoEtat
