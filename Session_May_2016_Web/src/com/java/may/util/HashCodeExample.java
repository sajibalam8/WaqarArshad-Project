package com.java.may.util;

import com.java.may.domain.Student;

public class HashCodeExample {

	public static void main(String args[]) {
		Student student1 = new Student();
		student1.setName("Waqar");

		Student student2 = new Student();
		student2.setName("Naveed");

		int a = 10;
		int b = 20;

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		if (student1.equals(student2)) {
			System.out.println("The students are sames");
		} else
			System.out.println("Student are different");

		if (a == b) {
			System.out.println("variables are same");
		} else
			System.out.println("variables are different");
	}
}
