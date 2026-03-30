package com.ibm.demo.day1.oop;

//import com.ibm.demo.day1.fundas.*;
//import java.util.Scanner;

public class Employee {

	int id;
	String name;
	double salary;
//	long[] phones;
//	Address address;

	void work() {
		System.out.println("Employee " + name + " is working.");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
