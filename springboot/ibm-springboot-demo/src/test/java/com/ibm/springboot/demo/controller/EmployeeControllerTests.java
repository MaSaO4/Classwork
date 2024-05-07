package com.ibm.springboot.demo.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.ibm.springboot.demo.model.Employee;
import com.ibm.springboot.demo.service.EmployeeServiceImpl;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTests {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private EmployeeServiceImpl employeeService;
	
	@BeforeEach
	public void setUp() {
		
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee("101","Chintu",1200,"adasd.mail.com"));
		empList.add(new Employee("102","Pintu",1200,"ghfgfh.mail.com"));
		empList.add(new Employee("103","Mintu",1200,"mcnx.mail.com"));
		
		when(employeeService.getAllEmp()).thenReturn(empList);
	}
	
	@Test
	public void testEmployeeController() throws Exception{
		
		mockMvc.perform(get("/Class2/all-emp")).andExpect(status().isOk());
		
	}
	
	public void testEmployeeControllerMediaPrint() throws Exception{
		
		mockMvc.perform(get("/Class2/all-emp")).andExpect(content().contentType(MediaType.APPLICATION_JSON));
		
	}
	
	public void testEmployeeControllerPrint() throws Exception{
		
		mockMvc.perform(get("/Class2/all-emp")).andDo(print());
		
	}
}
