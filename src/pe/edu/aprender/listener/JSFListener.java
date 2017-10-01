package pe.edu.aprender.listener;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

import org.apache.log4j.Logger;

/*
 * Con esta clase vamos a comprender el Ciclo de Vida de un face o
 * monitorear ejecución de fases de JSF
 */

public class JSFListener implements PhaseListener {

	private static final long serialVersionUID = 1L;

	static Logger logger = Logger.getLogger(JSFListener.class.getName());

	/*
	 * Los métodos beforePhase() y afterPhase() se ejecutan para todas las fases
	 * del ciclo de procesamiento de un request, por tanto, si se desea ejecutar
	 * alguna lógica especial en determinada fase, se deberá obtener el ID de la
	 * fase y en base a condiciones, controlar el flujo del código
	 */
	@Override
	public void beforePhase(PhaseEvent arg0) {
		logger.info("Antes de fase: " + arg0.getPhaseId());

	}

	@Override
	public void afterPhase(PhaseEvent arg0) {
		logger.info("Despues de fase: " + arg0.getPhaseId());
	}

	/*
	 * El método getPhaseId() sirve para determinar a que fase está asociado el
	 * listener. Cuando se usa para cualquier fase retorna el valor ANY_PHASE:
	 */
	@Override
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}