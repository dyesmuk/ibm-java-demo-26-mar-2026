package com.ibm.demo.day2.oop;
/**
 * 
 * constructor - 
 * is needed to create an object 
 * is a type of method 
 * does not have return type 
 * name is same as class name 
 * java provides a default constructor 
 * we can create our own constructors 
 * if we create, then java will not provide 
 * one class can contain many constructors 
 * 
 */


public class ConstructorDemo {

	public static void main(String[] args) {
		
		System.out.println("-- main --");

		Employee emp1 = new Employee();
		emp1.id = 1;
		emp1.name = "Sonu";
		emp1.salary = 90000;
		System.out.println(emp1.toString());

		Employee emp2 = new Employee();
		emp2.id = 2;
		emp2.name = "Monu";
		emp2.salary = 95000;
		System.out.println(emp2.toString());
		
		Employee emp3 = new Employee(3, "Tonu", 92000);
		System.out.println(emp3.toString());
		
		Employee emp4 = new Employee(4, "Ponu");
		System.out.println(emp4.toString());
	}

}
