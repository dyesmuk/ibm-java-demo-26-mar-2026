package com.ibm.demo.day3.strings;

public class StringDemo {
	
	public static void main(String[] args) {
		
		System.out.println("-- String demo --");
		
		String str = "abcdefghij";		

		System.out.println(str);		
		System.out.println(str.toUpperCase());
		System.out.println(str.toUpperCase().toLowerCase());
		System.out.println(str.charAt(9)); // java.lang.StringIndexOutOfBoundsException
		System.out.println(str.contains("k"));
		char[] strArr = str.toCharArray();
		for (char ch : strArr) {
			System.out.println(ch);
		}
//		str. calls instance methods 
//		String. calls static methods 
	}
}



