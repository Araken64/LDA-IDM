package LDPparallel.util;

import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import LDP.util.LDPManipulation;
import LDPparallel.ElementProcessus;
import LDPparallel.Porte;
import LDPparallel.Sequence;



public class LDPparallelExecutionEngine {
	public static void execute(String fileName, Object target, HashMap tags) throws LDPparallelEngineException {
		LDPparallel.Processus processus = LDPparallelManipulation.getProcessus(fileName);
		if (processus == null) throw new LDPparallelEngineException("Processus was not found in model");
		// LDP.Activite currentActivity = processus.getActiviteCourante() != null ? processus.getActiviteCourante() : processus.getDebut().getReference();
		ElementProcessus debut = processus.getDebut().getReference(); // TODO case if actives sequences at inital state
		if (debut instanceof Porte) {
			
		} else if (debut instanceof Sequence) {
			
		}
		
		
	}
}
	
final class LDPparallelEngineException extends RuntimeException {
	public LDPparallelEngineException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
	
	public LDPparallelEngineException(String errorMessage) {
        super(errorMessage);
    }
}

