//package com.ibm.springboot.demo.aspect;
//
//import org.slf4j.LoggerFactory;
//import org.springframework.stereotype.Component;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.AfterThrowing;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.Logger;
//
//@Aspect
//@Component
//public class EmployeeServiceAspect {
//
//	private final Logger LOG4 = LoggerFactory.getLogger(this.getClass());
//
//	@Before("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceMethod() {
//		LOG4.info("BEFORE A method from EmployeeServiceImpl's invoked");
//	}
//
//	@After("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceMethod2() {
//		LOG4.info("AFTER a method from EmployeeServiceImpl's invoked");
//	}
//
//	@AfterReturning("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceSuccess() {
//		// send email to a specific id, use yahoo mail
//		// get to know spring actuator
//		// basic understanding of microservices
//		LOG4.info("method returned successfully");
//	}
//
//	@AfterThrowing("execution(* com.ibm.springboot.demo.service.*.*(..))")
//	public void serviceFailed() {
//		LOG4.info("Data could not be returned");
//	}
//
//	// get the business data
//
//	@Before("execution(*com.ibm.springboot.demo.serce.*.(..))")
//	public void beforeAdvice(JoinPoint jp) {
//		if (jp.getArgs().length > 0) {
//			LOG4.info(jp.getArgs().toString());
//		}
//
//		LOG4.info(jp.getSignature().toString());
//		LOG4.info(jp.getTarget().toString());
//
//	}
//
//}
