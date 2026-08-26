package learning.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import learning.spring.entity.DatabaseSingleton;

public class Main {

	public static void main(String[] args) {

		ApplicationContext ioc = new ClassPathXmlApplicationContext("application-context.xml");
		
		DatabaseSingleton dbSingleton1 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		DatabaseSingleton dbSingleton2 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		DatabaseSingleton dbSingleton3 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		DatabaseSingleton dbSingleton4 = ioc.getBean("dbSingleton", DatabaseSingleton.class);
		
		System.out.println(dbSingleton1);
		System.out.println(dbSingleton2);
		System.out.println(dbSingleton3);
		System.out.println(dbSingleton4);
		
	}

}
