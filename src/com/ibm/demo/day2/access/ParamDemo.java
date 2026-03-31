package com.ibm.demo.day2.access;

public class ParamDemo {

	public static void main(String[] args) {
		System.out.println("-- main method -- ");
		// call all the methods here 
	}
}

class Methods {

	static void withArgsNoReturn(int i, int j) {
		System.out.println(i + j);
//		return i + j; // CE 
	}

	static void noArgsNoReturn() {
		System.out.println(0);
	}

	static int withReturnWithArgs(int i, int j) {
		return i + j;
	}

	static int withReturnNoArgs() {
		return 100;
	}

}
