/**
 */
package LDP.util;

import LDP.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see LDP.LDPPackage
 * @generated
 */
public class LDPValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LDPValidator INSTANCE = new LDPValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "LDP";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LDPValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LDPPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LDPPackage.PROCESSUS:
				return validateProcessus((Processus)value, diagnostics, context);
			case LDPPackage.ACTIVITE:
				return validateActivite((Activite)value, diagnostics, context);
			case LDPPackage.PSEUDO_ETAT:
				return validatePseudoEtat((PseudoEtat)value, diagnostics, context);
			case LDPPackage.DEBUT:
				return validateDebut((Debut)value, diagnostics, context);
			case LDPPackage.FIN:
				return validateFin((Fin)value, diagnostics, context);
			case LDPPackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessus(Processus processus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(processus, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessus_suivant(processus, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcessus_precedent(processus, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the suivant constraint of '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSUS__SUIVANT__EEXPRESSION = "self.activites -> one( a : Activite | a.suivante.oclIsUndefined())";

	/**
	 * Validates the suivant constraint of '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessus_suivant(Processus processus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPPackage.Literals.PROCESSUS,
				 processus,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "suivant",
				 PROCESSUS__SUIVANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the precedent constraint of '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROCESSUS__PRECEDENT__EEXPRESSION = "self.activites -> one(a : Activite | a.precedente.oclIsUndefined())";

	/**
	 * Validates the precedent constraint of '<em>Processus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcessus_precedent(Processus processus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPPackage.Literals.PROCESSUS,
				 processus,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "precedent",
				 PROCESSUS__PRECEDENT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivite(Activite activite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activite, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activite, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivite_pasDeCycle(activite, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the pasDeCycle constraint of '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITE__PAS_DE_CYCLE__EEXPRESSION = "self.pasDansSuivant(self)";

	/**
	 * Validates the pasDeCycle constraint of '<em>Activite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivite_pasDeCycle(Activite activite, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPPackage.Literals.ACTIVITE,
				 activite,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "pasDeCycle",
				 ACTIVITE__PAS_DE_CYCLE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePseudoEtat(PseudoEtat pseudoEtat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pseudoEtat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebut(Debut debut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(debut, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(debut, diagnostics, context);
		if (result || diagnostics != null) result &= validateDebut_premiereActivite(debut, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the premiereActivite constraint of '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String DEBUT__PREMIERE_ACTIVITE__EEXPRESSION = "self.reference.precedente.oclIsUndefined()";

	/**
	 * Validates the premiereActivite constraint of '<em>Debut</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebut_premiereActivite(Debut debut, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPPackage.Literals.DEBUT,
				 debut,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "premiereActivite",
				 DEBUT__PREMIERE_ACTIVITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFin(Fin fin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(fin, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(fin, diagnostics, context);
		if (result || diagnostics != null) result &= validateFin_derniersActivite(fin, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the derniersActivite constraint of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FIN__DERNIERS_ACTIVITE__EEXPRESSION = "self.reference.suivante.oclIsUndefined()";

	/**
	 * Validates the derniersActivite constraint of '<em>Fin</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFin_derniersActivite(Fin fin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPPackage.Literals.FIN,
				 fin,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "derniersActivite",
				 FIN__DERNIERS_ACTIVITE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operation, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LDPValidator
