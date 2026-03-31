package com.ibm.demo.day2.access;

public class AccessSpecifiersDemo {
	
//	final keyword - 
	// final field - can not reassign a value 
	// final method - can not be overridden 
	// final class - can be inherited  
	
// what is the difference bw final finally and finalize ?
	
	
//	static final int finalField = 10; // use SNAKE_CASE 
	static final int FINAL_FIELD = 10;
	
	
	public static void main(String[] args) {
		
		System.out.println(AccessSpecifiersDemo.FINAL_FIELD);
		
		System.out.println(Integer.MAX_VALUE);		
		
	}

}
