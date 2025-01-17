package com.ibm.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.demo.model.Employee;

public class SpringContextDemo {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
//		Employee emp =new Employee();
//		Employee emp = context.getBean(Employee.class);
		Employee emp1 = context.getBean("employee",Employee.class);
		
		System.out.println(emp1.hashCode());
		System.out.println(emp1.toString());
		
		Employee emp2 = context.getBean("employee1",Employee.class);
		
		System.out.println(emp2.hashCode());
		System.out.println(emp2.toString());
		
		((AbstractApplicationContext)context).close();

	}

}
