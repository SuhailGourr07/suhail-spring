package learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.entity.Address;
import learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		Employee employee1 = ioc.getBean("emp1", Employee.class);
//		Address address1 = ioc.getBean("add1", Address.class);
		
		System.out.println(employee1);
//		System.out.println(address1);
		

		Employee emp2 = ioc.getBean("emp2", Employee.class);
		System.out.println(emp2);
		
	}
}
