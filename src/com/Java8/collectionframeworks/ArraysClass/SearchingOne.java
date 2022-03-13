package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;

//using 1st binarySearch() method for primitive type arrays.
public class SearchingOne {
    public static void main(String[] args) {

        //creating a primitive type array
        int[] primitiveArray = {10, 5, 20, 11, 6};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Primitive Array before sorting: ");
        for (int a : primitiveArray) {
            System.out.print(a + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(primitiveArray);

        //printing after sort
        System.out.println(" \n Primitive Array after sorting: ");
        for (int a : primitiveArray) {
            System.out.print(a + " ");
        }

        //searching
        //SUCCESS -> returns index number
        System.out.println("\n" + Arrays.binarySearch(primitiveArray, 6));

        //FAILURE -> returns insertionPoint
        System.out.println(Arrays.binarySearch(primitiveArray, 14));
    }
}
