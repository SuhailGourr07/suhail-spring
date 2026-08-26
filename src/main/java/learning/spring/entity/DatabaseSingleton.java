package learning.spring.entity;

public class DatabaseSingleton {

	private DatabaseSingleton() {
		System.out.println("private constructor");
	}
	private static DatabaseSingleton dbSingleton = new DatabaseSingleton();
	
	public DatabaseSingleton getInstance() {
		return dbSingleton;
	}
}
