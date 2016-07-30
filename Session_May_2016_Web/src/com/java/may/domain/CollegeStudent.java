package com.java.may.domain;

import java.util.ArrayList;

public class CollegeStudent extends Student{

	String collegeName;
	double gpa;
	
	CollegeStudent(){
		super();
		System.out.println("College student called");
	}
	
	public static void main (String args[]){
		CollegeStudent cStudent = new CollegeStudent();
	}

}
