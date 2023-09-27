package com.example.restClient.dao;

public class Student {	
	
	public Student(Long id, String firstName, Number age, Number marks) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.age = age;
		this.marks = marks;
	}
	
	public Student() {
		
	}
	
	public Long id;
	public 	String firstName;
	public Number age;
	public Number marks;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Number getAge() {
		return age;
	}
	public void setAge(Number age) {
		this.age = age;
	}
	public Number getMarks() {
		return marks;
	}
	public void setMarks(Number marks) {
		this.marks = marks;
	}
	
}
