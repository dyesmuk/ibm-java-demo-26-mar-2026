package com.ibm.demo.day2.access;

public class FieldsDemo {

	static int staticField = 10;

	public static void main(String[] args) {
		int staticField = 20;

		System.out.println(FieldsDemo.staticField);
		System.out.println(staticField);
	}
}

//package com.ibm.demo.day2.access;
//
//public class FieldsDemo {
//
//	static int staticField = 10;
//	int instanceField = 20;
//
//	public static void main(String[] args) {
//		System.out.println("-- main method --");
//		int localField = 30;
//		System.out.println(FieldsDemo.staticField);
//		FieldsDemo obj = new FieldsDemo();
//		System.out.println(obj.instanceField);
//		System.out.println(localField);
//	}
//}
