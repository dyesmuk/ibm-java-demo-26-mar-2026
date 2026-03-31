package com.ibm.demo.day2.oop.overriding;

public class OverRidingDemo {

	public static void main(String[] args) {

		Calc calc1 = new Calc();
		calc1.addNums(10, 20);
		
		AdvanceCalc calc2 = new AdvanceCalc();
		calc2.addNums(10, 20);

	}

}
