package com.java.may.domain;

import java.util.ArrayList;

public class Student {

	String firstName;
	String lastName;
	String address;
ArrayList grades = new ArrayList();
	int age;
	
	public Student(){
		System.out.println("Parent Constructor called");
	}
	
	Student(String name){
		System.out.println(name);
	}
	Student(String name, String address){
		ArrayList test = new ArrayList();
		//test.add()
	}

	
	
	// constructor overloading
	
	
	public String getName() {
		return "Student Parent";
	}

	public void setName(String firstName, String lastName) {
		String name = firstName + lastName;
	}
	public void setName(String name) {
		firstName = name;
	}


}
