package com.Java8.MultiThreadingWithLambda;

public class WithLambda {
    // 1) with lambda & with anonymous implementation.
    public static void main(String[] args) {
        Runnable runnable = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread - 3");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //main thread for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread - 3");
        }

    }
}

