package com.ibm.demo.day3.multithreading.explanation;

public class MultiDemo {
    public static void main(String[] args) {

        DailyRoutine routine = new DailyRoutine();

        Thread t1 = new Thread(() -> routine.drinkTea());
        Thread t2 = new Thread(() -> routine.watchNews());
        Thread t3 = new Thread(() -> routine.checkWhatsApp());

        t1.start();
        t2.start();
        t3.start();
    }
}
