/**
 */
package LDPparallel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see LDPparallel.LDPparallelPackage
 * @generated
 */
public interface LDPparallelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LDPparallelFactory eINSTANCE = LDPparallel.impl.LDPparallelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Processus</em>'.
	 * @generated
	 */
	Processus createProcessus();

	/**
	 * Returns a new object of class '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sequence</em>'.
	 * @generated
	 */
	Sequence createSequence();

	/**
	 * Returns a new object of class '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activite</em>'.
	 * @generated
	 */
	Activite createActivite();

	/**
	 * Returns a new object of class '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Debut</em>'.
	 * @generated
	 */
	Debut createDebut();

	/**
	 * Returns a new object of class '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fin</em>'.
	 * @generated
	 */
	Fin createFin();

	/**
	 * Returns a new object of class '<em>Fourche</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fourche</em>'.
	 * @generated
	 */
	Fourche createFourche();

	/**
	 * Returns a new object of class '<em>Jonction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Jonction</em>'.
	 * @generated
	 */
	Jonction createJonction();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LDPparallelPackage getLDPparallelPackage();

} //LDPparallelFactory
