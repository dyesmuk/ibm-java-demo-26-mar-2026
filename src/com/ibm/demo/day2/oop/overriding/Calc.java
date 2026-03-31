package com.ibm.demo.day2.oop.overriding;

public class Calc {

	void addNums(int i, int j) {
		System.out.println(i + j);
	}
}

class AdvanceCalc extends Calc {

	@Override
	void addNums(int i, int j) {
		System.out.println(i + j + 0.5);
	}

}