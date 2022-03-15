package com.Java8.FunctionalInterfaces;

import java.util.function.Consumer;

//Consumer -> has a method accept()
public class ConsumerDemo1 {
    public static void main(String[] args) {

        //creating an array of names
        String[] names = {"Bruce", "Clarke", "Diana", "Steve"};

        //creating Consumer logic
        Consumer<String> consumer = n -> System.out.println(n);

        //calling consumer and passing the array to proint it
        for (String s : names) {
            consumer.accept(s);
        }

    }
}
