package es.pildoras.IoC;

public class SecretarioEmpleado implements Empleados {

	//Esta clase va a recibir la inyección de dependencias usando un setter
	private CreacionInformes informeNuevo;

	public CreacionInformes getInformeNuevo() {
		return informeNuevo;
	}
//Este método será el encargado de crear la dependencia
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	@Override
	public String getTareas() {
		
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el secretario. "+informeNuevo.getInforme();
	}

	private String email;
	private String nombreEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	
}
