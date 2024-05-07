package com.ibm.springboot.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employees")
public class Employee {
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", username=" + username + ", salary=" + salary + ", email="
				+ email + "]";
	}

	@Id
	String employeeId;
	String username;
	double salary;
	String email;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Employee() {
		super();
	}

	public Employee(String employeeId, String username, double salary, String email) {
		super();
		this.employeeId = employeeId;
		this.username = username;
		this.salary = salary;
		this.email=email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getusername() {
		return username;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
