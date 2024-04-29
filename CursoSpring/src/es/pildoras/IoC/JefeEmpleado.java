package es.pildoras.IoC;

public class JefeEmpleado implements Empleados {
	private CreacionInformes informeNuevo;
	public JefeEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones relativas a mis empleados de secci�n";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe presentado por el jefe con arreglos. "+informeNuevo.getInforme();
	}
}
