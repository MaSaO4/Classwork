package com.ibm.springboot.demo.Exception;

public class EmployeeNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmployeeNotFoundException(String msg) {
		super(msg);
	}

}
