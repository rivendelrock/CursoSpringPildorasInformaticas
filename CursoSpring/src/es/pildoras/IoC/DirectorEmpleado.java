package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
//Creacion de campo tipo creacionInforme
	private CreacionInformes informeNuevo;
	//Creación de dependencia utilizando constructor que inyecta la dependencia. 
	
	public DirectorEmpleado (CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	@Override
	public String getTareas() {
		
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el Director. "+informeNuevo.getInforme();
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
	
	//Método Init, ejecutar tareas antes de que el Bean sea creado. Suelen ser void pero pueden tener return
	public void metodoInicial () {
		System.out.println("Método antes de que creen el bean. Dentro del método init. Aquí irían las tareas a ejecutar antes de que el Bean esté listo");
	}
	
	//Método destroy para después de que se haya destruido el bean
	public void metodoFinal () {
		System.out.println(" Dentro del método destroy. Aquí irían las tareas a ejecutar después de que muera el bean");
	}
}
