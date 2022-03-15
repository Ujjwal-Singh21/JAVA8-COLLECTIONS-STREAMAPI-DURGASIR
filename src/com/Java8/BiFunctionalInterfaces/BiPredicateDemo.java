package com.Java8.BiFunctionalInterfaces;
import java.util.function.BiPredicate;

//Same as Predicate, Just takes 2 args instead of 1
public class BiPredicateDemo {
    public static void main(String[] args) {

        //creating a Bi-Predicate
        BiPredicate<Integer, Integer> biPredicate = (a, b) -> (a + b) % 2 == 0;

        //calling BipPredicate
        System.out.println(biPredicate.test(10, 20));
        System.out.println(biPredicate.test(15, 20));
    }
}
