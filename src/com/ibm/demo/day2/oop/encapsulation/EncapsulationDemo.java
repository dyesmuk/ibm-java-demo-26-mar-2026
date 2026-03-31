package com.ibm.demo.day2.oop.encapsulation;

//encapsulation 
// bind data (== fields) and code (== methods) together 

public class EncapsulationDemo {

	public static void main(String[] args) {

		System.out.println("-- main --");

		Employee emp3 = new Employee(3, "Tonu", 92000);
		System.out.println(emp3.toString());

//		emp3.salary = emp3.salary * 2; // not allowed 
//		System.out.println(emp3.salary);

		System.out.println(emp3.getSalary());
		emp3.setSalary(108000);
		System.out.println(emp3.getSalary());
		System.out.println(emp3.toString());

	}

}
