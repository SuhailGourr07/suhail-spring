package learning.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	// Primitive and String based dependency
	private int id;
	private String name;
	private String gender;
	
	// Dependent Object based dependency
	private Address address;
	
	// Collection Dependency
	private List<String> list;
	
	private Set<Integer> set;
	
	private Map<Integer, String> map;
	
	
	
	public Employee() {
		System.out.println("Emp NoArgs Constructor");
	}
	
	
	public Employee(int id, String name, String gender, Address address, List<String> list, Set<Integer> set,
			Map<Integer, String> map) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.address = address;
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<String> getList() {
		return list;
	}


	public void setList(List<String> list) {
		this.list = list;
	}


	public Set<Integer> getSet() {
		return set;
	}


	public void setSet(Set<Integer> set) {
		this.set = set;
	}


	public Map<Integer, String> getMap() {
		return map;
	}


	public void setMap(Map<Integer, String> map) {
		this.map = map;
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
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", address=" + address + ", list="
				+ list + ", set=" + set + ", map=" + map + "]";
	}
	
}
