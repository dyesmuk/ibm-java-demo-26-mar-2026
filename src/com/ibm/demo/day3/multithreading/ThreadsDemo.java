package com.ibm.demo.day3.multithreading;

public class ThreadsDemo extends Thread {

	void printNums() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	@Override
	public void run() {
		this.printNums();
	}
}


//package com.ibm.demo.day3.multithreading;
//
//public class ThreadsDemo {
//
//	void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
//}
//
//
//
