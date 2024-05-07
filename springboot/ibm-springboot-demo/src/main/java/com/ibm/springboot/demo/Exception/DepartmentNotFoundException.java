package com.ibm.springboot.demo.Exception;

public class DepartmentNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DepartmentNotFoundException(String msg) {
		super(msg);
	}

}
