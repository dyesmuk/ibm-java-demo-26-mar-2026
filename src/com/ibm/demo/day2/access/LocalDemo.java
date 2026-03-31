package com.ibm.demo.day2.access;

public class LocalDemo {

	static int staticField = 10;
	int instanceField = 20;

	public static void main(String[] args) {
		LocalDemo.staticMethod();
		LocalDemo obj = new LocalDemo();
		obj.instanceMethod();
		System.out.println(staticField);
		System.out.println(instanceField);
	}

	static void staticMethod() {
		System.out.println("this is from a static method");
		System.out.println(staticField);
		System.out.println(instanceField);
	}

	void instanceMethod() {
		System.out.println("this is from an instance method");
		System.out.println(staticField);
		System.out.println(instanceField);
	}

}
