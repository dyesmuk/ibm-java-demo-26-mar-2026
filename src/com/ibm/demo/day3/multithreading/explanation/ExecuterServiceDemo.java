package com.ibm.demo.day3.multithreading.explanation;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuterServiceDemo {
	
	public static void main(String[] args) {

        LifeRoutine obj = new LifeRoutine();

        ExecutorService service = Executors.newFixedThreadPool(3);

        service.submit(() -> obj.drinkTea());
        service.submit(() -> obj.watchNews());
        service.submit(() -> obj.checkWhatsApp());

		service.shutdown();
	}

}
