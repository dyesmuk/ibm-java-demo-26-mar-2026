package com.ibm.demo.day3.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorPatternDemo implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("run " + Thread.currentThread().getName() + " " + i);
		}
	}

	public static void main(String[] args) {

		ExecutorPatternDemo exp = new ExecutorPatternDemo();

//        	 1. Using newSingleThreadExecutor
		ExecutorService exService = Executors.newSingleThreadExecutor();

//        	2. Using newCachedThreadPool
//        	ExecutorService exService = Executors.newCachedThreadPool();

//        	3. Using newFixedThreadPool
//        	ExecutorService exService = Executors.newFixedThreadPool(3);

//        	4. Using newScheduledThreadPool
//        	ExecutorService exService = Executors.newScheduledThreadPool(2);
//        	ScheduledExecutorService exService = Executors.newScheduledThreadPool(2);

		for (int i = 1; i <= 10; i++) {
			exService.execute(exp);
		}

		/**
		 * An ExecutorService should be shut down once it is no longer needed to free up
		 * system resources and to allow graceful application shutdown. Because the
		 * threads in an ExecutorService may be nondaemon threads, they may prevent
		 * normal application termination. In other words, your application stays
		 * running after completing its main method.
		 *
		 * source:
		 * https://stackoverflow.com/questions/16122987/reason-for-calling-shutdown-on-executorservice
		 */

		exService.shutdown();
	}
}
