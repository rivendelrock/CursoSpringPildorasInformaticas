package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoInityDestroy {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("ApplicationContext3.xml");
		
		Empleados juan =  contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(juan.getInforme());
		contexto.close();
	}

}
