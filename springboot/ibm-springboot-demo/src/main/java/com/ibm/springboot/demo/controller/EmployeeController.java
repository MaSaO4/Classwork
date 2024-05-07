package com.ibm.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.service.EmployeeService;

@RestController
@RequestMapping("Class2")
@CrossOrigin(origins = "")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeservice;
	
	@GetMapping("emp-id/{eid}")
	public ResponseEntity<Employee> getEmpById(@PathVariable (name="eid") String employeeId){
		System.out.println(employeeId);
		Employee employee = employeeservice.getEmpById(employeeId);
		System.out.println(employee.toString());
		HttpStatus status = HttpStatus.OK;
		HttpHeaders head = new HttpHeaders();
		head.add("message","Employee data fetched successfully");
		ResponseEntity<Employee> response = new ResponseEntity<>(employee,head,status);
		return response;
	}
	
	@GetMapping("all-emp")
	public List<Employee> getAllEmp(){
		return employeeservice.getAllEmp();
	}
	
	@GetMapping("emp-fname/{uname}")
	public ResponseEntity<List<Employee>> findByFirstName(@PathVariable (name="uname") String username){
		System.out.println(username);
		List<Employee> empList = employeeservice.findByFirstName(username);
		HttpStatus status = HttpStatus.OK;
		HttpHeaders head = new HttpHeaders();
		head.add("message","Employee data fetched successfully");
		ResponseEntity<List<Employee>> response = new ResponseEntity<List<Employee>>(empList, head, status);
		return response;
	}
	@PostMapping("add-emp")
	public ResponseEntity<Employee> addEmp(@RequestBody Employee employee) {
		Employee empToBeAdded = employeeservice.addEmployee(employee);
		HttpStatus status = HttpStatus.CREATED;
		HttpHeaders headers = new HttpHeaders();
		headers.add("message", "Employee added successfully!");
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(empToBeAdded, headers, status);
		return response;
	}
	
	@PutMapping("update-emp")
	public ResponseEntity<Employee> updateEmp(@RequestBody String employeeId,Employee employee){
		Employee empToBeUpdated = employeeservice.updateEmp(employeeId, employee);
		HttpStatus status = HttpStatus.ACCEPTED;
		HttpHeaders head = new HttpHeaders();
		head.add("message", "Employee updated successfully");
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(empToBeUpdated,head,status);
		return response;	
	}
	
	@GetMapping("delete-emp/{eid}")
	public ResponseEntity<Employee> deleteEmp(@PathVariable(name ="eid") String employeeId){
		Employee empToBeDeleted = employeeservice.deleteEmpById(employeeId);
		HttpStatus status = HttpStatus.ACCEPTED;
		HttpHeaders head = new HttpHeaders();
		head.add("message", "Employee deleted successfully");
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(empToBeDeleted,head,status);
		return response;	
	}
	

//	@GetMapping("get-data")
//	public String meth() {
//		System.out.println("Method2");
//		return "asdfghjkl";
//	}
	
//	@GetMapping("emp-by-data")
//	public Employee empinfo() {
//		Employee emp = new Employee(101,"Monu",1234);
//		System.out.println(emp.toString());
//		return emp.toString();	
//		return new Employee(101,"Monu",1234);
	}
	
//	@GetMapping("emp-id/{eid}")
//	public ResponseEntity<Employee> getEmpById(@PathVariable (name="eid") Integer employeeId){
//		System.out.println(employeeId);
//		Employee employee = employeeservice.getEmpById(employeeId);
//		System.out.println(employee.toString());
//		HttpStatus status = HttpStatus.OK;
//		HttpHeaders head = new HttpHeaders();
//		head.add("message","Employee data fetched successfully");
//		ResponseEntity<Employee> response = new ResponseEntity<>(employee,status);
//		return response;
//	}
//	
//	@GetMapping("all-emp")
//	public List<Employee> getAllEmp(){
//		return employeeservice.getAllEmp();
//	}
//	
////	@GetMapping("emp-update")
////	public ResponseEntity<Employee> updateEmp(){
////		Employee employee = employeeservice.updateEmp(30,"Pintu");
////		HttpStatus status = HttpStatus.OK;
////		ResponseEntity<Employee> response = new ResponseEntity<>(employee,status);
////		return response;
////	}
//	
//	@GetMapping("emp-delete")
//	public String deleteEmp(){
//		return employeeservice.deleteEmp(20);
//	}
//	
//
//	@GetMapping("get-data")
//	public String meth() {
//		System.out.println("Method2");
//		return "asdfghjkl";
//	}
//	
//	@GetMapping("emp-by-data")
//	public Employee empinfo() {
////		Employee emp = new Employee(101,"Monu",1234);
////		System.out.println(emp.toString());
////		return emp.toString();	
//		return new Employee(101,"Monu",1234);
//	}
	
//	@GetMapping("get-all-emps")
//	public List<Employee> getAllEmployees(){
//		List<Employee> empList = new ArrayList<>();
//		empList.addAll(Arrays.asList(new Employee(1,"Sonu",12),new Employee(20,"Tonu",15),new Employee(30,"Ponu",20)));
//		return empList;
//	}



