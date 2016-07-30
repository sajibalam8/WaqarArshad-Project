package com.java.may.util;


import java.util.ArrayList;

import com.java.may.domain.Student;
public class MyArrayList extends ArrayList{
	
	public void add(){
		MyArrayList myList = new MyArrayList();
		System.out.println("Child add function");
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("String");
		String st = list.get(0);
		//String.form
		
	}
	
	@Override
	public boolean add(Object object){
		boolean isAdded = false;
		
		return isAdded;
		
		
	}

}
