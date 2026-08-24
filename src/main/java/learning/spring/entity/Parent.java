package learning.spring.entity;

public class Parent {

	private String compName;
	private String empId;
	
	public Parent() {
		System.out.println("Parent NoArgs Constructor");
	}

	public Parent(String compName, String empId) {
		super();
		this.compName = compName;
		this.empId = empId;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Parent [compName=" + compName + ", empId=" + empId + "]";
	}
	
}
