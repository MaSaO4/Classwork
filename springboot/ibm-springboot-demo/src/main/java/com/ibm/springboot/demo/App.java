package com.ibm.springboot.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {

	private final static Logger LOG2 = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {

		LOG2.info("Starting");
		SpringApplication.run(App.class, args);
		LOG2.info("Started");
	}

}
