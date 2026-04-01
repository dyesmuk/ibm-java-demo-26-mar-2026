package com.ibm.demo.day3.multithreading;

public class MultiThreadingDemo {
	
	public static void main(String[] args) {
		System.out.println("Start");
		Thread obj1 = new Thread(new ThreadsDemo());
		obj1.start();
		Thread obj2 = new Thread(new ThreadsDemo());
		obj2.start();
		Thread obj3 = new Thread(new ThreadsDemo());
		obj3.start();
		System.out.println("End");
	}
}


//package com.ibm.demo.day3.multithreading;
//
//public class MultiThreadingDemo {
//	
//	public static void main(String[] args) {
//		System.out.println("Start");
//		ThreadsDemo obj1 = new ThreadsDemo();
//		obj1.printNums();
//		ThreadsDemo obj2 = new ThreadsDemo();
//		obj2.printNums();
//		ThreadsDemo obj3 = new ThreadsDemo();
//		obj3.printNums();
//		System.out.println("End");
//	}
//}

//package com.ibm.demo.day3.multithreading;
//
//import java.util.concurrent.Callable;
//
//public class MultiThreadingDemo {
//	
//	public static void main(String[] args) {
//		
////		Thread
////		Runnable
////		Callable<V>
//		
//		
//	}
//
//}
