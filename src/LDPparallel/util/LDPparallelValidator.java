/**
 */
package LDPparallel.util;

import LDPparallel.*;

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
 * @see LDPparallel.LDPparallelPackage
 * @generated
 */
public class LDPparallelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LDPparallelValidator INSTANCE = new LDPparallelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "LDPparallel";

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
	public LDPparallelValidator() {
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
	  return LDPparallelPackage.eINSTANCE;
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
			case LDPparallelPackage.PROCESSUS:
				return validateProcessus((Processus)value, diagnostics, context);
			case LDPparallelPackage.ELEMENT_PROCESSUS:
				return validateElementProcessus((ElementProcessus)value, diagnostics, context);
			case LDPparallelPackage.SEQUENCE:
				return validateSequence((Sequence)value, diagnostics, context);
			case LDPparallelPackage.ACTIVITE:
				return validateActivite((Activite)value, diagnostics, context);
			case LDPparallelPackage.PSEUDO_ETAT:
				return validatePseudoEtat((PseudoEtat)value, diagnostics, context);
			case LDPparallelPackage.DEBUT:
				return validateDebut((Debut)value, diagnostics, context);
			case LDPparallelPackage.FIN:
				return validateFin((Fin)value, diagnostics, context);
			case LDPparallelPackage.PORTE:
				return validatePorte((Porte)value, diagnostics, context);
			case LDPparallelPackage.FOURCHE:
				return validateFourche((Fourche)value, diagnostics, context);
			case LDPparallelPackage.JONCTION:
				return validateJonction((Jonction)value, diagnostics, context);
			case LDPparallelPackage.OPERATION:
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
		return validate_EveryDefaultConstraint(processus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElementProcessus(ElementProcessus elementProcessus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elementProcessus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sequence, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_suivant(sequence, diagnostics, context);
		if (result || diagnostics != null) result &= validateSequence_precedent(sequence, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the suivant constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEQUENCE__SUIVANT__EEXPRESSION = "self.activites -> one( a : Activite | a.suivante.oclIsUndefined())";

	/**
	 * Validates the suivant constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence_suivant(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPparallelPackage.Literals.SEQUENCE,
				 sequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "suivant",
				 SEQUENCE__SUIVANT__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the precedent constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String SEQUENCE__PRECEDENT__EEXPRESSION = "self.activites -> one(a : Activite | a.precedente.oclIsUndefined())";

	/**
	 * Validates the precedent constraint of '<em>Sequence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSequence_precedent(Sequence sequence, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LDPparallelPackage.Literals.SEQUENCE,
				 sequence,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "precedent",
				 SEQUENCE__PRECEDENT__EEXPRESSION,
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
				(LDPparallelPackage.Literals.ACTIVITE,
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
		return validate_EveryDefaultConstraint(debut, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFin(Fin fin, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fin, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePorte(Porte porte, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(porte, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFourche(Fourche fourche, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fourche, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJonction(Jonction jonction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jonction, diagnostics, context);
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

} //LDPparallelValidator
