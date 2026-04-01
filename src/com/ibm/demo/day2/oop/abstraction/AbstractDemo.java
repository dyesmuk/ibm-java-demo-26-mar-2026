package com.ibm.demo.day2.oop.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {

		HdfcBank bank1 = new HdfcBank();
		bank1.doKyc();
		bank1.payInterest();

		IciciBank bank2 = new IciciBank();
		bank2.doKyc();

	}

}
