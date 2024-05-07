package com.ibm.springboot.prac.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ibm.springboot.prac.model.Student;

public interface StudentInterface {

	public String getCourse(Integer studentId);
	public List<Student> getStudentList(String course);
	public String deleteStudent(Integer studentId);
	public Student getCourseByAge(Integer age);
}
