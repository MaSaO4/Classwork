package com.ibm.springboot.prac.model;

public class Student {
	
	private int studentId;
	private String name;
	private int age;
	public Student(int studentId, String name, int age, String course) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.course = course;
	}
	private String course;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", age=" + age + ", course=" + course + "]";
	}
	
}
