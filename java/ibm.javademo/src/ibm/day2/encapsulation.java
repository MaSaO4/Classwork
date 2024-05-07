package ibm.day2;

class NewEmp{
	
	String name;
	int age;
	private String department;
	private int salary;
	
	public NewEmp(String name,String department,int age,int salary) {
		this.name=name;
		this.salary=salary;
		this.department=department;
		this.age=age;
	}
	public void setSalary(int sal) {
		this.salary=sal;
	}
	int getSalary() {
		return salary;
	}
	public void showDetails() {
		System.out.println(name);
		System.out.println();
		System.out.println(salary);
		
	}
}

public class encapsulation {

	public static void main(String[] args) {
		
		NewEmp emp1=new NewEmp("Don","Sales",25,50000);
		emp1.showDetails();
		emp1.setSalary(69342);
		System.out.println(emp1.getSalary());
		emp1.showDetails();
		

	}

}