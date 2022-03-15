package com.Java8.MethodReference;

//Here, Interface MyInterface's add() method -> refers to sum() method
@FunctionalInterface
interface MyInterface {
    public void add(int a, int b);
}

public class MethodReferenceDemo2 {

    //our own existing static method
    public static void sum(int x, int y) {
        System.out.println("Using Method reference: " + (x + y));
    }

    public static void main(String[] args) {

        //using lambda
        MyInterface myInterface1 = (a, b) -> System.out.println("Using lambda: " + (a + b));
        myInterface1.add(10, 20);

        //using method reference
        MyInterface myInterface2 = MethodReferenceDemo2::sum;
        myInterface2.add(20, 20);
    }
}
