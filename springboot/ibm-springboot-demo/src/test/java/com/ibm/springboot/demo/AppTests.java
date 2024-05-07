package com.ibm.springboot.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ibm.springboot.demo.service.EmployeeServiceImpl;

@SpringBootTest
public class AppTests {

	@Autowired
	EmployeeServiceImpl employeeService;

	private final static Logger LOG = LoggerFactory.getLogger(AppTests.class);

//	@BeforeEach
//	@AfterEach

	@BeforeAll
	public static void beforeTest() {
		LOG.info("Before All");
	}

	@AfterAll
	public static void afterTest() {
		LOG.info("After All");
	}

	@Test
	public void testAllEmps() {
		assertEquals(employeeService.getAllEmp().size(), 24);
	}

	@Test
	public void testAddEmp() {
//		Employee emp = new Employee("1029", "Test Name", 1029, "");
		assertEquals(employeeService.getAllEmp().size(), 24);
	}

	@Timeout(value = 50, unit = TimeUnit.MILLISECONDS) // RESULT MUST COME IN THE TIME DURATION
	@Test
	public void testAllEmpsTimeut() {
		assertTimeout(Duration.ofMillis(50), () -> {
			employeeService.getAllEmp();
		});
	}

	@Disabled
	@ParameterizedTest
	@ValueSource(strings = { "Delphine", "Anna" })
	void testGetEmpById(String employeeId) {
		assertEquals(employeeId, employeeService.getEmpById(employeeId).getusername());
	}

//	@Test
//	void contextLoads() {
//	}

	// POSITIVE TEST CASE example
	@Test
	public void testPos() {

		Integer expected = 10;
		Integer actual = 5 + 5;

		assertEquals(expected, actual);

	}

	// NEGATIVE TEST CASE example
	@Test
	public void testNeg() {

		Integer unexpected = 10;
		Integer actual = 5 + 6;

		assertNotEquals(unexpected, actual);

	}

}
