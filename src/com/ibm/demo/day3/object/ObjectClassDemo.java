package com.ibm.demo.day3.object;

public class ObjectClassDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(1, "Sonu", 90000);
		Employee emp2 = new Employee(1, "Sonu", 90000);
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp1.equals(emp2)); // true / false 
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
	}
}
