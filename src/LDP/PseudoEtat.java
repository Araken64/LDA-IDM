/**
 */
package LDP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pseudo Etat</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.PseudoEtat#getReference <em>Reference</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getPseudoEtat()
 * @model abstract="true"
 * @generated
 */
public interface PseudoEtat extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference</em>' reference.
	 * @see #setReference(Activite)
	 * @see LDP.LDPPackage#getPseudoEtat_Reference()
	 * @model required="true"
	 * @generated
	 */
	Activite getReference();

	/**
	 * Sets the value of the '{@link LDP.PseudoEtat#getReference <em>Reference</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference</em>' reference.
	 * @see #getReference()
	 * @generated
	 */
	void setReference(Activite value);

} // PseudoEtat
