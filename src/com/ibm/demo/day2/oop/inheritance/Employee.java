package com.ibm.demo.day2.oop.inheritance;

public class Employee {

	public int id;
	public String name;
	private double salary;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

class ContractualEmployee extends Employee {

}


class Phone {
	void call() {
		System.out.println("Make call.");
	}

	void sms() {
		System.out.println("Send SMS");
	}
}

class FeaturePhone extends Phone { // single inheritance

	private void mms() {
		System.out.println("Send MMS");
	}

	void music() {
		System.out.println("Play music");
	}
}

class SmartPhone extends FeaturePhone { // multilevel inheritance

	void camera() {
		System.out.println("Snap a pic");
	}

	@Override
	void music() {
		System.out.println("Play music with Dolby");
	}
}
