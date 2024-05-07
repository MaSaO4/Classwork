package com.ibm.springboot.demo.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springboot.demo.Exception.DepartmentNotFoundException;
import com.ibm.springboot.demo.model.Department;
import com.ibm.springboot.demo.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService{

	private final Logger LOG3 = LoggerFactory.getLogger(this.getClass());
	@Autowired
	DepartmentRepository departmentRepository ;

	@Override
	public List<Department> getAllDepartments() {
		
		List<Department> deptList = departmentRepository.findAll();
		if(!deptList.isEmpty()) {
			
			LOG3.info("All department records");
			return deptList;
			
		}else {
			
			String errMsg = " NO DEPARTMENTS PRESENT ";
			LOG3.warn(errMsg);
			throw new DepartmentNotFoundException(errMsg);
			
		}
	
	}

	@Override
	public Department getDepartmentById(String departmentId) {
		Optional<Department> dept = departmentRepository.findById(departmentId);
		if(dept.isEmpty()) {
			
			String errMsg = "No department with id " + departmentId + " is present";
			LOG3.warn(errMsg);
			throw new DepartmentNotFoundException(errMsg);
			
		}else {
			
			LOG3.info("Record with id "+ departmentId);
			return dept.get();
		
		}
	}

	@Override
	public Department addDepartment(Department department) {
		LOG3.info(department.toString());
		return departmentRepository.save(department);
	}
	
	
}
