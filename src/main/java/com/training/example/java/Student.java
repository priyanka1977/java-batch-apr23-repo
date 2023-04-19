package com.training.example.java;

public class Student {

	private String firstName;
	private String lastName;
	private int id;
	private String course;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Student(String firstName, String lastName, int id, String course) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.course = course;
	}

	public Student() {
		System.out.println("Student Object Constructed...");
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", course=" + course + "]";
	}

	
}
