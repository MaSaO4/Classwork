package com.ibm.springboot.demo.service;

import java.util.List;

import com.ibm.springboot.demo.model.Employee;

public interface EmployeeService {
	
	public Employee getEmpById(String employeeId);
	public List<Employee> getAllEmp();
	public Employee updateEmp(String employeeId,Employee employee);
	public Employee deleteEmpById(String employeeId);
	public List<Employee> findByFirstName(String username);
	public Employee addEmployee(Employee employee);

}
