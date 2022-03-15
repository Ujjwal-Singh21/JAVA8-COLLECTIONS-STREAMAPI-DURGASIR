package com.Java8.FunctionalInterfaces;
import java.util.function.Predicate;

//joining 2 predicates
//AND -> predicate1.and(predicate2).test()
//OR -> predicate1.or(predicate2).test()
//NEGATE -> predicate1.negate(predicate2).test()
public class PredicateDemo3 {

    public static void main(String[] args) {
        int[] numbers = {0, 5, 10, 15, 20, 25, 30, 35};

        Predicate<Integer> predicate1 = i -> i % 2 == 0;
        Predicate<Integer> predicate2 = i -> i > 10;

        //combining 2 predicates
        System.out.println("Numbers that are even & greater than 10 are: ");
        //And
        for (int n : numbers) {
            if (predicate1.and(predicate2).test(n)) {
                System.out.println(n);
            }
        }

//        //Or
        for (int n : numbers) {
            if (predicate1.or(predicate2).test(n)) {
                System.out.println(n);
            }
        }
//
//        //Negate
        for (int n : numbers) {
            if (predicate1.negate().test(n)) {
                System.out.println(n);
            }
        }
    }
}
