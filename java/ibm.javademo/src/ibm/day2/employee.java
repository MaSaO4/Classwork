package ibm.day2;

public class employee {
	
	String name;
	int age;
	private double salary;
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void printEmployee() {

		System.out.println("Name: "+name + " Age: "+ age + " Salary: "+ salary);
	}
	public employee(String name,int age, double salary) {
		this.name=name;
		this.age=age;
		this.salary=salary;
	}

	public String toString() {
		return(name + " " + age + " " + salary);
	}
	
}
