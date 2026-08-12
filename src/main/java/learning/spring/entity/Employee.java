package learning.spring.entity;

public class Employee {

	private int id;
	private String name;
	private String gender;
	
	private Address address;
	
	public Employee() {
		System.out.println("Emp NoArgs Constructor");
	}
	
	public Employee(int id, String name, String gender,Address address) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		System.out.println("Emp Args Constructor");
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("Emp Id setter");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("Emp name setter");
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
		System.out.println("Emp gender setter");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
	
}
