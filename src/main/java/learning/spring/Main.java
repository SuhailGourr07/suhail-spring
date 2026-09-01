package learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import learning.spring.entity.Address;
import learning.spring.entity.Address2;
import learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new AnnotationConfigApplicationContext("learning.spring");
		
		Employee emp1 = ioc.getBean("employee", Employee.class);
		Address add1 = ioc.getBean("address",Address.class);
		Address2 add2 = ioc.getBean("address2",Address2.class);
		
		System.out.println(emp1);	
	
		emp1.setName("suhail");
		System.out.println(emp1);
		
		System.out.println(add1);
		System.out.println(add2);
	
	}

}
