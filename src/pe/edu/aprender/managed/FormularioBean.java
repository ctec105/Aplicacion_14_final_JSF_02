package pe.edu.aprender.managed;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import pe.edu.aprender.entity.Empleado;

@ManagedBean(name = "formulario")
public class FormularioBean {

	/*
	 * En el ManagedBean “FormularioBean” crearemos una variable de instancia de
	 * tipo “Empleado” con sus respectivos getter/setter
	 */
	private Empleado empleado = new Empleado();

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	// En el ManagedBean “FormularioBean” añadimos Action Method
	public String procesar() {
		// Invocar capa de negocio
		FacesMessage facesMessage = new FacesMessage("Registro completo ");
		FacesContext.getCurrentInstance().addMessage(null, facesMessage);

		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage("Su nombre completo es: "
						.concat(empleado.getNombre()).concat(" ")
						.concat(empleado.getApellido())));
		return "resultado";
	}

}