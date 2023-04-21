package com.training.example.java;

public class TestStudent {

	
	public static void main(String[] args) {
		
		
		// JVM - new() operator create the object in the memory and initialize the object properties
		Student student1 = new Student("john", "dev", 1, "core java");
		
		System.out.println("student details - " + student1);  // Java compiler student1.toString() 
		
		System.out.println("student details - " + student1);  
		// objectreference.property or objectreference.method()
		
	}
}
