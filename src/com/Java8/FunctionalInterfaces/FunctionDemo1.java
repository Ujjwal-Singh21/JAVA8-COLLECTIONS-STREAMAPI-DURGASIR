package com.Java8.FunctionalInterfaces;

import java.util.function.Function;

//Function -> has a method called apply()
//takes an object -> returns a new object based on logic inside it.
public class FunctionDemo1 {
    public static void main(String[] args) {
        String[] names = {"Fury", "Chiranjeevi", "Venkatesh", "Sunny", "Balaiah", "Katrina"};

        Function<String, Integer> function = n -> n.length();

        //passing names to Function's apply method
        for (String s : names) {
            System.out.print(function.apply(s) + " ");
        }
    }
}
