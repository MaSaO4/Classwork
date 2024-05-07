package com.ibm.springboot.demo.Exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.ibm.springboot.demo.model.Employee;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Employee> handleEmployeeNotFoundException(EmployeeNotFoundException e) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders head = new HttpHeaders();
		head.add("message", e.getMessage());
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(null, head, status);
		return response;
	}
	
	@ExceptionHandler(DepartmentNotFoundException.class)
	public ResponseEntity<Employee> handleDepartmentNotFoundException(DepartmentNotFoundException d) {

		HttpStatus status = HttpStatus.NOT_FOUND;
		HttpHeaders head = new HttpHeaders();
		head.add("message", d.getMessage());
		ResponseEntity<Employee> response = new ResponseEntity<Employee>(null, head, status);
		return response;
	}

}
