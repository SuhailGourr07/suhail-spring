package learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.entity.Address;
import learning.spring.entity.Employee;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");

		Employee employee1 = (Employee) ioc.getBean("emp1", Employee.class);

		System.out.println(employee1);

		employee1.setAddress(employee1.applyAddress());
		System.out.println(employee1);

		Address a1 = employee1.applyAddress();
		System.out.println(a1);

	}

}
