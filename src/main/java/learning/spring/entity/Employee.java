package learning.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id=11;
	private String name;
	private String gender;
	
	@Autowired
	@Qualifier(value = "add1")
	private IAddress address;
	
	
	public Employee() {
		System.out.println("NoArgs Constructor");
	}
	
	public Employee(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Args Constructor");
	}
	

	public IAddress getAddress() {
		return address;
	}

	public void setAddress(IAddress address) {
		this.address = address;
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

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + "]";
	}
}
