package com.java.may.util;

public class CollectionExample {
	
	//Class variables
	// methods or functions
	// method variables
	
	int grade = 0;
	
	String name = "Waqar";
	
	public void test2 (){
		String grade = "10"; 
		int f = 0;
		 this.grade = 100;
	}
	
	public void test (){
		grade = 300;
	}
		
	public void test3 (){
		grade = 700;
	}
	
	public static void main (String args[]){
		CollectionExample ce = new CollectionExample();
		ce.test2();
		System.out.println(ce.grade);
	}
	
}
