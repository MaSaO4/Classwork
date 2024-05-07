package com.ibm.springboot.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.springboot.demo.service.RestConsumeService;

@RequestMapping("Class1")
@RestController
public class HelloController {
	
	@Autowired
	private RestConsumeService restConsumeService;

	@GetMapping("hello")
	public String hello() {
		return restConsumeService.getRestData();
	}

////	@RequestMapping
//	@GetMapping("/hi")
//	public String hi() {
//		System.out.println("Hiiiiii!!!");
//		return "Hello World";
//	}
//	
//	@GetMapping("get-data")
//	public String data() {
//		System.out.println("Hellu!!!");
//		return "Hello Controller World";
//	}
	
//	@GetMapping("/add(int a,int b)")
//	public int add(int a,int b) {
//		int c= a +b;
//		return c;
	}

//}
