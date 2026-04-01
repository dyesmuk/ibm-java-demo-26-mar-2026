package com.ibm.demo.day3.wrapper;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
//		Object obj = new Object();

		int num = 10;
		System.out.println(num);
//		num. // no methods 
		Integer num2 = 20;
//		num2. // instance methods 
		
		// boxing - conversion from primitive to wrapper object 
		Integer num3 = num; // auto-boxing 
		Integer num4 = Integer.valueOf(num); // manual boxing == valueOf()
		
		// un-boxing - conversion from wrapper object to primitive 
		int num5 = num3; // auto-un-boxing 
		int num6 = num3.intValue(); // manual un-boxing == intValue()
		// Byte, Short, Integer, Long, Float, Double, Character, Boolean
		

		
		
		
		
	}

}
