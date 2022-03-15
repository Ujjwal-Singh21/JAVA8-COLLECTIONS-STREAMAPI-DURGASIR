package com.Java8.ConstructorReference;

//Interface method --> refers to its returning Class Constructor
//get()  --> refers to Sample Class Constructor
//Interface method always searches for same args Constructor
//Example with args
class Sample1 {
    Sample1(String s) {
        System.out.println("Sample class Constructor Executed with name: " + s);
    }
}

@FunctionalInterface
interface Interf1 {
    public Sample1 get(String s);
}

public class NormalDemo2 {
    public static void main(String[] args) {

        Interf1 interf = Sample1::new;
        Sample1 sample = interf.get("Ujjwal");
    }
}
