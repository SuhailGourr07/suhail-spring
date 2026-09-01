package learning.spring.entity;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city = "Noida";
	private String state = "UP";
	
	public Address() {
		System.out.println("NoArgs Constructor");
	}
	
	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		System.out.println("Args Constructor");
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("city setter");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("state setter");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
}
