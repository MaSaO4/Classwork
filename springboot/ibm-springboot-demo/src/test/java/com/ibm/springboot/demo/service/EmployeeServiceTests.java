package com.ibm.springboot.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.repository.EmployeeRepository;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {

	@MockBean
	private EmployeeRepository employeeRepository;

	@InjectMocks
	private EmployeeServiceImpl employeeServiceImpl;

	private static final Logger LOG = LoggerFactory.getLogger(EmployeeServiceTests.class);

	@BeforeEach
	public void setUp() {

		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("101","Pintu",120000,"asda.mail"));
		empList.add(new Employee("102","Chintu",120000,"lkkhj.mail"));
		empList.add(new Employee("103","Mintu",120000,"qmsk.mail"));
		when(employeeRepository.findAll()).thenReturn(empList);
		
	}

	@Test //POSITIVE
	public void testAllEmps() {
		assertEquals(employeeServiceImpl.getAllEmp().size(), 24);
	}
	
	@Disabled    //USED TO SKIP TEST
	@Test //NEGATIVE
	public void testAllEmps2() {
		assertEquals(employeeServiceImpl.getAllEmp().size(), 10);
	}

	@Test
	public void testAllEmpsTimes() {
		employeeRepository.findAll();
		employeeRepository.findAll();
		verify(employeeRepository, times(2)).findAll();
	}
	
}
