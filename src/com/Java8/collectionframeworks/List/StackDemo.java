package com.Java8.collectionframeworks.List;

import java.util.Stack;

//Stack class is child class of Vector class and follows LIFO.
public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        //pushing (or) adding an element at top
        stack.push(5);
        stack.push(10);
        stack.push(15);
        System.out.println("Pushing elements: " + stack);

        //checking which element is at the top of stack
        int topElement = stack.peek();
        System.out.println("Element at top: " + topElement);

        //checking whether stack is empty
        boolean result = stack.empty();
        System.out.println("Checking if stack is empty: " + result);

        //searching a particular element in stack whose position is returned
        //if available
        //returns -1 if element is not available in stack
        //If available :-
        int position1 = stack.search(15);
        System.out.println("Position of element: " + position1);
        //If not available :-
        int position2 = stack.search(55);
        System.out.println("Position of element: " + position2);

        //pop (or) deleting an element from top
        stack.pop();
        System.out.println("After delete: " + stack);


    }
}
