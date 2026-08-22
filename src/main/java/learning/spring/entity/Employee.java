package learning.spring.entity;

public class Employee {

	private int id;
	private String name;
	private String gender;

	public Employee() {
		System.out.println("NoArgs Constructor");
	}

	public Employee(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Args Constructor");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Id setter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("name setter");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("gender setter");
	}
}
