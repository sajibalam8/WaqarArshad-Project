package com.java.may.loop;

import java.util.ArrayList;
import com.java.may.domain.Student;

public class Loop {

	public void forLoop() {

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 0) {
				System.out.println("i  == " + i);
				for (int j = 0; j < 10; j++) {
					System.out.println(" j: " + j);
				}
			}
			if (i % 2 == 1) {
				System.out.println("i  == " + i);
				System.out.println("this is odd value of i and we will skip it");
			}
		}

	}

	public static void main(String args[]) {
		Loop forLoop = new Loop();
		ArrayList studentList = forLoop.populateClass();
		//System.out.println(studentList.size());
		
		
	}
	
	public ArrayList populateClass(){
		ArrayList studentList = new ArrayList();
		for(int i = 0; i < 10; i++ ){
			Student student = new Student();
			student.setName("Student "+i);
			//student.populateGrades();
			//System.out.println(student.getGrades().size());
			studentList.add(student);
		}
		
		 
		return studentList;
		
	}
	
	public void printResult(){
		
	}
}
