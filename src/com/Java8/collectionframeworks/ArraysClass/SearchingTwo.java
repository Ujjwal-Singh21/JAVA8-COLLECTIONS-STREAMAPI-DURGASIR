package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;

//using 2nd binarySearch() method for object type arrays.
public class SearchingTwo {
    public static void main(String[] args) {

        //creating a primitive type array
        String[] objectArray = {"A", "Z", "B"};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Primitive Array before sorting: ");
        for (String s : objectArray) {
            System.out.print(s + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(objectArray);

        //printing after sort
        System.out.println(" \n Primitive Array after sorting: ");
        for (String s : objectArray) {
            System.out.print(s + " ");
        }

        //searching
        //SUCCESS -> returns index number
        System.out.println("\n" + Arrays.binarySearch(objectArray, "Z"));

        //FAILURE -> returns insertionPoint
        System.out.println(Arrays.binarySearch(objectArray, "S"));
    }
}
