/**
 */
package LDPparallel;

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
 *   <li>{@link LDPparallel.Processus#getSequences <em>Sequences</em>}</li>
 *   <li>{@link LDPparallel.Processus#getPortes <em>Portes</em>}</li>
 *   <li>{@link LDPparallel.Processus#getDebut <em>Debut</em>}</li>
 *   <li>{@link LDPparallel.Processus#getFin <em>Fin</em>}</li>
 *   <li>{@link LDPparallel.Processus#getSequencesActives <em>Sequences Actives</em>}</li>
 * </ul>
 *
 * @see LDPparallel.LDPparallelPackage#getProcessus()
 * @model
 * @generated
 */
public interface Processus extends EObject {
	/**
	 * Returns the value of the '<em><b>Sequences</b></em>' containment reference list.
	 * The list contents are of type {@link LDPparallel.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences</em>' containment reference list.
	 * @see LDPparallel.LDPparallelPackage#getProcessus_Sequences()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Sequence> getSequences();

	/**
	 * Returns the value of the '<em><b>Portes</b></em>' containment reference list.
	 * The list contents are of type {@link LDPparallel.Porte}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Portes</em>' containment reference list.
	 * @see LDPparallel.LDPparallelPackage#getProcessus_Portes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Porte> getPortes();

	/**
	 * Returns the value of the '<em><b>Debut</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debut</em>' containment reference.
	 * @see #setDebut(Debut)
	 * @see LDPparallel.LDPparallelPackage#getProcessus_Debut()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Debut getDebut();

	/**
	 * Sets the value of the '{@link LDPparallel.Processus#getDebut <em>Debut</em>}' containment reference.
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
	 * @see LDPparallel.LDPparallelPackage#getProcessus_Fin()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Fin getFin();

	/**
	 * Sets the value of the '{@link LDPparallel.Processus#getFin <em>Fin</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fin</em>' containment reference.
	 * @see #getFin()
	 * @generated
	 */
	void setFin(Fin value);

	/**
	 * Returns the value of the '<em><b>Sequences Actives</b></em>' reference list.
	 * The list contents are of type {@link LDPparallel.Sequence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sequences Actives</em>' reference list.
	 * @see LDPparallel.LDPparallelPackage#getProcessus_SequencesActives()
	 * @model
	 * @generated
	 */
	EList<Sequence> getSequencesActives();

} // Processus
