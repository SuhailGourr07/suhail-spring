package learning.spring.entity;

public class Child extends Parent{

	private String age;
	private int salary;
	
	public Child() {
		System.out.println("Child NoArgs Constructor");
	}

	public Child(String age, int salary) {
		super();
		this.age = age;
		this.salary = salary;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Child [age=" + age + ", salary=" + salary + " compName=" + getCompName() + " empId=" + getEmpId() + "]";
	}
}
