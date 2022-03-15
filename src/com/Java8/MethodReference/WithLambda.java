package com.Java8.MethodReference;

//using lambda, that implements Runnable class run() method.
public class WithLambda {
    public static void main(String[] args) {

        Runnable runnable = () -> {
            //code executed by Child thread
            for (int i = 1; i <= 10; i++) {
                System.out.println("Child Thread");
            }
        };

        //creating Thread Object
        Thread thread = new Thread(runnable);
        thread.start();

        //code executed by main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }

}

