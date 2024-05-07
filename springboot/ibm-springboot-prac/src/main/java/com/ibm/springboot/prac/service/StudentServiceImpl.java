package com.ibm.springboot.prac.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springboot.prac.model.Student;

@Service
public class StudentServiceImpl implements StudentInterface{
	
	private List<Student> stuList = new ArrayList<>(Arrays.asList(new Student(1,"Pinku",23,"Science")));
	
	@Override
	public String getCourse(Integer studentId) {
		for(Student s:stuList) {
			
		}
		return null;
	}

	@Override
	public List<Student> getStudentList(String course) {
	
		return null;
	}

	@Override
	public String deleteStudent(Integer studentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student getCourseByAge(Integer age) {
		// TODO Auto-generated method stub
		return null;
	}

}
