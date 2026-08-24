package learning.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee employee1 = ioc.getBean("emp1", Employee.class);
		
		System.out.println(employee1);
		
		ioc.registerShutdownHook();
		
	}

}
