package learning.spring.entity;

public class Address {

	private String city;
	private String state;
	
	public Address() {
		System.out.println("Address NoArgs Constructor");
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
		System.out.println("Address Args Constructor");
	}
	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
		System.out.println("Address set city");
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
		System.out.println("Address set state");
	}


	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
	
	
}
