/**
 */
package LDPparallel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sequence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDPparallel.Sequence#getName <em>Name</em>}</li>
 *   <li>{@link LDPparallel.Sequence#getActivites <em>Activites</em>}</li>
 *   <li>{@link LDPparallel.Sequence#getActiviteCourante <em>Activite Courante</em>}</li>
 *   <li>{@link LDPparallel.Sequence#getPremiereActivite <em>Premiere Activite</em>}</li>
 * </ul>
 *
 * @see LDPparallel.LDPparallelPackage#getSequence()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='suivant precedent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot suivant='self.activites -&gt; one( a : Activite | a.suivante.oclIsUndefined())' precedent='self.activites -&gt; one(a : Activite | a.precedente.oclIsUndefined())'"
 * @generated
 */
public interface Sequence extends ElementProcessus {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see LDPparallel.LDPparallelPackage#getSequence_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link LDPparallel.Sequence#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Activites</b></em>' containment reference list.
	 * The list contents are of type {@link LDPparallel.Activite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activites</em>' containment reference list.
	 * @see LDPparallel.LDPparallelPackage#getSequence_Activites()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activite> getActivites();

	/**
	 * Returns the value of the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Courante</em>' reference.
	 * @see #setActiviteCourante(Activite)
	 * @see LDPparallel.LDPparallelPackage#getSequence_ActiviteCourante()
	 * @model
	 * @generated
	 */
	Activite getActiviteCourante();

	/**
	 * Sets the value of the '{@link LDPparallel.Sequence#getActiviteCourante <em>Activite Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Courante</em>' reference.
	 * @see #getActiviteCourante()
	 * @generated
	 */
	void setActiviteCourante(Activite value);

	/**
	 * Returns the value of the '<em><b>Premiere Activite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Premiere Activite</em>' reference.
	 * @see #setPremiereActivite(Activite)
	 * @see LDPparallel.LDPparallelPackage#getSequence_PremiereActivite()
	 * @model required="true"
	 * @generated
	 */
	Activite getPremiereActivite();

	/**
	 * Sets the value of the '{@link LDPparallel.Sequence#getPremiereActivite <em>Premiere Activite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Premiere Activite</em>' reference.
	 * @see #getPremiereActivite()
	 * @generated
	 */
	void setPremiereActivite(Activite value);

} // Sequence
