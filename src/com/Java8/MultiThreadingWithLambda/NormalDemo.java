package com.Java8.MultiThreadingWithLambda;

//without lambda using separate implementation class
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread -1");
        }
    }
}

public class NormalDemo {
    public static void main(String[] args) {

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        //main thread for loop
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread - 1");
        }

    }
}
