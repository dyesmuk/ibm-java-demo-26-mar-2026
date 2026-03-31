package com.ibm.demo.labs.lab1.ex1;

//Exercise 1: Create a method to 
// find the sum of the cubes of 
// the digits of an n-digit number.

public class Lab1Ex1Demo {

	public static int sumOfCubesOfDigits(int n) {
		n = Math.abs(n);
		int sum = 0;
		while (n != 0) {
			int digit = n % 10;
			sum += digit * digit * digit;
			n /= 10;
		}

		return sum;
	}

	public static void main(String[] args) {

		int output = Lab1Ex1Demo.sumOfCubesOfDigits(123);
		System.out.println(output);
	}

}
