package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// Creación de objetos de tipo empleado
		
	ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext.xml");
//	Empleados juan =  contexto.getBean("miEmpleado",Empleados.class);
//	System.out.println(juan.getTareas());
//	System.out.println(juan.getInforme());
	SecretarioEmpleado maria =  contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
	System.out.println(maria.getTareas());
 	System.out.println(maria.getInforme());
 	System.out.println(maria.getEmail());
 	System.out.println(maria.getNombreEmpresa());
	contexto.close();
	
	}

}
