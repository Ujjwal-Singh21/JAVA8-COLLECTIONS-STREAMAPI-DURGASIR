package com.Java8.MethodReference;

//using method reference
//run() method will now refer to our existing m1() method
public class WithMethodReference {

    //our already existing method -> referred internally by run() method
    public void m1() {

        //code executed by Child thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {

        //Since m1() is an instance method , creating object to access it
        WithMethodReference withMethodReference = new WithMethodReference();
        Runnable runnable = withMethodReference::m1;

        //creating Thread Object
        Thread thread = new Thread(runnable);
        thread.start();

        //code executed by main thread
        for (int i = 1; i <= 10; i++) {
            System.out.println("Main Thread");
        }
    }
}
