package com.ibm.springboot.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.model.Department;
import com.ibm.springboot.demo.service.DepartmentService;

@RestController
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentservice;
	
	@GetMapping("all-dept")
	public ResponseEntity<List<Department>>getAllDepartments() {
		
		List<Department> department = departmentservice.getAllDepartments();
		HttpStatus status = HttpStatus.OK;
		HttpHeaders head = new HttpHeaders();
		head.add("message","All records fetched");
		ResponseEntity<List<Department>> response = new ResponseEntity<List<Department>>(department,head,status);
		return response;
		
	}
	
	@GetMapping("dept-id/{deptId}")
	public ResponseEntity<Department> findDeptById(@PathVariable(name="deptId") String departmetnId) {
		
		Department department = departmentservice.getDepartmentById(departmetnId);
		HttpHeaders head = new HttpHeaders();
		head.add("message", "Exclusive record fetched");
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<Department> response = new ResponseEntity<Department>(department,head,status);
		return response;
		
	}
	
	@PostMapping("add-dept")
	public ResponseEntity<Department> addDept(@RequestBody Department department){
		
		Department deptToBeAdded = departmentservice.addDepartment(department);
		HttpHeaders head = new HttpHeaders();
		head.add("message", "Record added successfully");
		HttpStatus status=HttpStatus.OK;
		ResponseEntity<Department> response = new ResponseEntity<Department>(deptToBeAdded,head,status);
		return response;
		
	}

}
