package com.Java8.MultiThreadingWithLambda;

//without a separate implementation class for Runnable(I)
//since it has only 1 abstract method , it is considered as Functional Interface.
//hence, we can write using lambda expression and anonymous class
// 1) without lambda just with anonymous implementation.
public class WithAnonymousClass {
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Child Thread - 2");
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();

        //main thread for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread - 2");
        }

    }
}
