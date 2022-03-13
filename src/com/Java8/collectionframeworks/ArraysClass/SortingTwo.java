package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;

//using 2nd sort method from Arrays(C) class for Object type array sorting
public class SortingTwo {
    public static void main(String[] args) {

        //creating a primitive type array
        Integer[] objectArray = {23, 78, 11, 98, 54};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Object Array before sorting: ");
        for (Integer a : objectArray) {
            System.out.print(a + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(objectArray);

        //printing after sort
        System.out.println("\n Object Array after sorting:");
        for (Integer a : objectArray) {
            System.out.print(a + " ");
        }

    }
}
