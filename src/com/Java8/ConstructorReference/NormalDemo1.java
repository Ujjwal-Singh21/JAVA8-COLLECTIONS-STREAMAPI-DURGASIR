package com.Java8.ConstructorReference;

//Interface method --> refers to its returning Class Constructor
//get()  --> refers to Sample Class Constructor
//Example without args
class Sample {
    Sample() {
        System.out.println("Sample class Constructor Executed");
    }
}

@FunctionalInterface
interface Interf {
    public Sample get();
}

public class NormalDemo1 {
    public static void main(String[] args) {

        Interf interf = Sample::new;
        Sample sample = interf.get();
    }
}
