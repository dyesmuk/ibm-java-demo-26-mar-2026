package com.ibm.demo.day3.multithreading.explanation;

public class LifeRoutine {

	void drinkTea() {
		System.out.println("Drinking Tea by " + Thread.currentThread().getName());
	}

	void watchNews() {
		System.out.println("Watching News by " + Thread.currentThread().getName());
	}

	void checkWhatsApp() {
		System.out.println("Checking WhatsApp by " + Thread.currentThread().getName());
	}

}