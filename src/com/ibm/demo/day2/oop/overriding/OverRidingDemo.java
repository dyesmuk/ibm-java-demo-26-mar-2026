package com.ibm.demo.day2.oop.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {

		Calc.addNums(10, 20);
		Calc.addNums(10, 20, 30);
		Calc.addNums(10, 20, 30, 40);
		Calc.addNums(10, 20.0);
		Calc.addNums(10.0, 20);
		Calc.addNums(10.0, 20.0);


	}

}
