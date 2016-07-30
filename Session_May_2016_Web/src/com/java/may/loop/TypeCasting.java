package com.java.may.loop;

public class TypeCasting {

	public void typeCastToString(){
		
		 
		
	}

	public static void main(String[] args)  {
		//TypeCasting typeCast = new TypeCasting();		
		int i = 10;
		double a = i ; 
		byte b = (byte)i;  
		double c = 0;
		//System.out.println("i "+i);
		//System.out.println("a "+a);
		//System.out.println("byte "+b);
		String doubleStr = "10c" ; //45 56 gh // user input;
		String intStr = "11m" ; 
		try{
			c = Double.parseDouble(doubleStr);
			
			//a = c + i;
			System.out.println(" After the try block");
		}catch(Exception e){
			System.out.println(e);
		}
		try {
			i = Integer.parseInt(intStr);
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(" After the catch block");
		c = c  + 1 ;
		//System.out.println(" str adding"+intStr     +"        "+    1);
		//System.out.println("parse double "+c);
		//System.out.println("parse int "+i);
		
	}
}
