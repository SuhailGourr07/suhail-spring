package learning.spring.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	private int id=11;
	private String name;
	private String gender;
	
	@Autowired
	private Address address;
	@Autowired
	private Address2 address2;
	
	public Employee() {
		System.out.println("NoArgs Constructor");
	}
	
	public Employee(int id, String name, String gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		System.out.println("Args Constructor");
	}
	
	public Address2 getAddress2() {
		return address2;
	}

	public void setAddress2(Address2 address2) {
		this.address2 = address2;
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", address2="
				+ address2 + "]";
	}
	
}
