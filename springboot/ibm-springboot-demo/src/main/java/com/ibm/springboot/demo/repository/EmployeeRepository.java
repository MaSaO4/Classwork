package com.ibm.springboot.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springboot.demo.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {

	// no need to define methods for basic CRUD operations
	// you may need to define methods for other business operation requirements
	
	public abstract List<Employee>findByUsername(String username);
	
}