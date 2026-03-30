package com.ibm.demo.day1.fundas;

public class IfElseDemo {

	public static void main(String[] args) {

		int marks = 98; // >100, <1

		if (marks > 90)
			System.out.println("A grade");
		else if (marks > 80)
			System.out.println("B grade");
		else if (marks > 70)
			System.out.println("C grade");
		else if (marks > 60)
			System.out.println("D grade");
		else
			System.out.println("Pass");

	}

}
