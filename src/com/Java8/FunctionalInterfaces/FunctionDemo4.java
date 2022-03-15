package com.Java8.FunctionalInterfaces;
import java.util.function.Function;

// 1) Function Chaining -> function1.andThen(function2).apply();
//    Here, andThen() -> function1 is followed by function2.
// 2) Function Chaining -> function1.compose(function2).apply();
//    Here, compose() -> function2 is followed by function1.

public class FunctionDemo4 {
    public static void main(String[] args) {

        //creating 2 functions
        Function<Integer, Integer> function1 = i -> i * 2;
        Function<Integer, Integer> function2 = i -> i * i * i;

        //combining both functions
        System.out.println("Using andThen: " + function1.andThen(function2).apply(2));
        System.out.println("Using compose: " + function1.compose(function2).apply(2));
    }
}
