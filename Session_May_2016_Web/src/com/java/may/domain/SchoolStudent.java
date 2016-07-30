package com.java.may.domain;

import java.util.ArrayList;

public class SchoolStudent extends Student{
	
	
	String school;
	ArrayList majors = new ArrayList();
	
	public static void main(String args[]){
		Student student = new SchoolStudent();
		Student student2 = new Student("Waqar");
		Student student3 = new CollegeStudent();
		
		CollegeStudent collegeStudent = new CollegeStudent();
		System.out.println(student.getName());
			
		
	}
	

}
