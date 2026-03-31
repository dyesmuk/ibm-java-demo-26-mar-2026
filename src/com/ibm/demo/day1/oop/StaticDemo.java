package com.ibm.demo.day1.oop;

public class StaticDemo {

	// static fields - belong to class - common to all objects
	static int num1 = 10;
	// instance fields - belong to objects - unique to each object
	int num2 = 20;

	public static void main(String[] args) {

		// static field - access as ClassName.fieldName
		System.out.println(StaticDemo.num1);
		// instance field - access as objectName.fieldName
		StaticDemo obj = new StaticDemo();
		System.out.println(obj.num2);
		System.out.println(obj.num1);

	}

}
