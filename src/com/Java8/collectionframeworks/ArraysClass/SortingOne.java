package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;

// 1) Arrays class hs 3 methods for sorting.
// 2) 1st for sorting primitive type arrays in natural order,
// 3) 2nd for sorting Object type arrays in natural order,
// 4) 3rd for sorting Object type arrays in customized order using Comparator.
//Here, we are sorting primitive type array in natural order...
public class SortingOne {
    public static void main(String[] args) {

        //creating a primitive type array
        int[] primitiveArray = {23, 78, 11, 98, 54};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Primitive Array before sorting: ");
        for (int a : primitiveArray) {
            System.out.print(a + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(primitiveArray);

        //printing after sort
        System.out.println("\n Primitive Array after sorting:");
        for (int a : primitiveArray) {
            System.out.print(a + " ");
        }

    }

}
