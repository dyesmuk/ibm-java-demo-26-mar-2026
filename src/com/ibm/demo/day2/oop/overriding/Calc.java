package com.ibm.demo.day2.oop.overriding;

public class Calc {
	
	static void addNums(int i, int j) {
		System.out.println(i + j);
	}

	static void addNums(int i, int j, int l) {
		System.out.println(i + j + l);
	}

	static void addNums(int i, int j, int l, int k) {
		System.out.println(i + j + l + k);
	}
	
	static void addNums(int i, double j) {
		System.out.println(i + j);
	}

	static void addNums(double i, int j) {
		System.out.println(i + j);
	}

	static void addNums(double i, double j) {
		System.out.println(i + j);
	}
}
