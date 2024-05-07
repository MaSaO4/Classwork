package com.ibm.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ibm.demo.model.Employee;

public class JavaConfig {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext("SpringConfig.xml");
		
		Employee emp = context.getBean();

	}

}
