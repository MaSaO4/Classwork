//package com.ibm.springboot.demo.aspect;
//
//import org.aspectj.lang.annotation.AfterReturning;
//
//import org.aspectj.lang.annotation.Aspect;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//import com.ibm.springboot.demo.model.Employee;
//import com.ibm.springboot.demo.service.EmailService;
//
//@Aspect
//@Component
//public class EmailAspect {
//
//	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
//
//	@Autowired
//	private EmailService emailService;
//
////	@Pointcut("execution(* com.ibm.springboot.demo.service.EmployeeServiceImpl.getEmpById(String)) && args(employeeId)")
////	public void getEmailByIdPointcut(String employeeId) {
////	}
//
//	@AfterReturning("execution(* com.ibm.springboot.demo.service.*.*(..))")
//
////	@AfterReturning(pointcut = "getEmailByIdPointcut(employeeId)", returning = "employee")
//	public void sendEmailNotification() {
//		Employee employee = new Employee();
//		LOG.info(employee.toString());
//		emailService.sendEmail(employee);
//	}
//}