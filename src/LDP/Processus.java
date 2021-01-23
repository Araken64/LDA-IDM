/**
 */
package LDP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Processus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link LDP.Processus#getActivites <em>Activites</em>}</li>
 *   <li>{@link LDP.Processus#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDP.Processus#getFin <em>Fin</em>}</li>
 *   <li>{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}</li>
 * </ul>
 *
 * @see LDP.LDPPackage#getProcessus()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='suivant precedent'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot suivant='self.activites -&gt; one( a : Activite | a.suivante.oclIsUndefined())' precedent='self.activites -&gt; one(a : Activite | a.precedente.oclIsUndefined())'"
 * @generated
 */
public interface Processus extends EObject {
	/**
	 * Returns the value of the '<em><b>Activites</b></em>' containment reference list.
	 * The list contents are of type {@link LDP.Activite}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activites</em>' containment reference list.
	 * @see LDP.LDPPackage#getProcessus_Activites()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Activite> getActivites();

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Debut)
	 * @see LDP.LDPPackage#getProcessus_Debut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Debut getDebut();

	/**
	 * Sets the value of the '{@link LDP.Processus#getDebut <em>Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debut</em>' containment reference.
	 * @see #getDebut()
	 * @generated
	 */
	void setDebut(Debut value);

	/**
	 * Returns the value of the '<em><b>Fin</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fin</em>' containment reference.
	 * @see #setFin(Fin)
	 * @see LDP.LDPPackage#getProcessus_Fin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fin getFin();

	/**
	 * Sets the value of the '{@link LDP.Processus#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Fin value);

	/**
	 * Returns the value of the '<em><b>Activite Courante</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activite Courante</em>' reference.
	 * @see #setActiviteCourante(Activite)
	 * @see LDP.LDPPackage#getProcessus_ActiviteCourante()
	 * @model
	 * @generated
	 */
	Activite getActiviteCourante();

	/**
	 * Sets the value of the '{@link LDP.Processus#getActiviteCourante <em>Activite Courante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activite Courante</em>' reference.
	 * @see #getActiviteCourante()
	 * @generated
	 */
	void setActiviteCourante(Activite value);

} // Processus
