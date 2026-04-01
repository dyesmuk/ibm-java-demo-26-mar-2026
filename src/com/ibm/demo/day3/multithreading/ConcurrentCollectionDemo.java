package com.ibm.demo.day3.multithreading;

import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurrentCollectionDemo implements Runnable {

	private CopyOnWriteArrayList<Integer> arryList = new CopyOnWriteArrayList<>();
// 	private List<Integer> arryList = new ArrayList<>();

	@Override
	public void run() {
		System.out.println("run");
		for (int i = 0; i <= 10; i++) {
			arryList.add(i);
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Start");
		ConcurrentCollectionDemo ccd = new ConcurrentCollectionDemo();
		Thread thread = new Thread(ccd);
		thread.start();
		for (int i = 11; i <= 20; i++) {
			ccd.arryList.add(i);
			Thread.sleep(10);
		}
		for (Integer i : ccd.arryList) {
			System.out.println(i);
		}
		System.out.println("End");
	}
}
