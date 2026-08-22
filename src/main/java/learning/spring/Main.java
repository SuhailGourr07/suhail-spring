package learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee employee1 = ioc.getBean("emp1", Employee.class);
		Employee employee2 = ioc.getBean("emp1", Employee.class);
		Employee employee3 = ioc.getBean("emp1", Employee.class);
		Employee employee4 = ioc.getBean("emp1", Employee.class);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		
		
	}

}
