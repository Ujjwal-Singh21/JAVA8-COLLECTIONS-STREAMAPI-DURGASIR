package com.Java8.FunctionalInterfaces;

import java.util.function.Predicate;

//predicate -> boolean -> has a method called test()
public class PredicateDemo1 {
    public static void main(String[] args) {

        String[] names = {"Fury", "Chiranjeevi", "Venkatesh", "Sunny", "Balaiah", "Katrina"};

        Predicate<String> predicate = n -> n.length() > 5;
        // Predicate<String> predicate = n -> n.length() % 2 == 0;

        //passing all names from array to Predicate
        for (String s : names) {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        }
    }

}
