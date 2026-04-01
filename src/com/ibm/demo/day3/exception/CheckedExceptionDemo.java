package com.ibm.demo.day3.exception;

//FileNotFoundException
//InterruptedException
//SQLException
//IOException
//ClassNotFoundException

public class CheckedExceptionDemo {

	static void printNums() throws InterruptedException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(250);
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			CheckedExceptionDemo.printNums();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");

	}
}

//package com.ibm.demo.day3.exception;
//
//public class CheckedExceptionDemo {
//
//	static void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		CheckedExceptionDemo.printNums();
//		System.out.println("End");
//
//	}
//}
