package com.ibm.demo.day1.fundas;

public class NestedLoopDemo {

	public static void main(String[] args) {

////		System.out.println("One");
////		System.out.println("Two");
//		System.out.print("One");
//		System.out.print("Two");

// 		for (int i = 1; i <= 5; i++) {
//			System.out.println(i);
//		}

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
