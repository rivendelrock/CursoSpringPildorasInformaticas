package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		//Carga de xml de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext2.xml");
		
		//Petición de beans al contenedor Spring
		
		SecretarioEmpleado maria =  contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado juan =  contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		//Si trabajamos con patrón Singleton estos dos beans apuntarán a la misma dirección de memoria. Es el patron por defecto
		//de singleton. Si queremos cambiar el patron para que no sean el mismo objeto tenemos que decirle en el scope del xml que sea prototype.
		
		System.out.println(maria);
		System.out.println(juan);
		contexto.close();

	}

}
