package com.ibm.demo.day1.oop;

public class Employee {

	static int officePhone;
	int id;
	String name;
	double salary;

	void work() {
		System.out.println("Employee " + name + " is working.");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

//package com.ibm.demo.day1.oop;
//
////import com.ibm.demo.day1.fundas.*;
////import java.util.Scanner;
//
//public class Employee {
//
//	// static fields - belong to class - common to all objects
//	// == free access - access as ClassName.fieldName
//	static int officePhone;
//
//	// instance fields - belong to objects - unique to each object
//	// == restricted access - access as objectName.fieldName
//	int id;
//	String name;
//	double salary;
//
//	void work() {
//		System.out.println("Employee " + name + " is working.");
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//
//}
