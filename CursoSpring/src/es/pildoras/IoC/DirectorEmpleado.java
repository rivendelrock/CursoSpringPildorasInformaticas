package es.pildoras.IoC;

public class DirectorEmpleado implements Empleados {
//Creacion de campo tipo creacionInforme
	private CreacionInformes informeNuevo;
	//Creaci�n de dependencia utilizando constructor que inyecta la dependencia. 
	
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
	
	//M�todo Init, ejecutar tareas antes de que el Bean sea creado. Suelen ser void pero pueden tener return
	public void metodoInicial () {
		System.out.println("M�todo antes de que creen el bean. Dentro del m�todo init. Aqu� ir�an las tareas a ejecutar antes de que el Bean est� listo");
	}
	
	//M�todo destroy para despu�s de que se haya destruido el bean
	public void metodoFinal () {
		System.out.println(" Dentro del m�todo destroy. Aqu� ir�an las tareas a ejecutar despu�s de que muera el bean");
	}
}
