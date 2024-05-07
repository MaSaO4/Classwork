package ibm.day3;

class Employee{
	private int empId;
	private String firstName;
	private double exp;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String firstName, double exp) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.exp = exp;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	
	
}

public class ObjectDemo {

	public static void main(String[] args) {
		
		Employee emp = new Employee(101, "Sonu",10.5);
		
		System.out.println(emp.getFirstName());

	}

}
