package com.Java8.collectionframeworks.ArraysClass;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//using 3rd binarySearch() method for object type customized sorted arrays.
public class SearchingThree {
    public static void main(String[] args) {

        //creating a primitive type array
        String[] objectArray = {"A", "Z", "B"};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Object Array before custom sorting: ");
        for (String s : objectArray) {
            System.out.print(s + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(objectArray, new MyComparator1());

        //printing after sort
        System.out.println("\n Object Array after custom sorting:");
        for (String s : objectArray) {
            System.out.print(s + " ");
        }

        //searching
        //SUCCESS -> returns index number
        System.out.println("\n" + Arrays.binarySearch(objectArray, "Z", new MyComparator1()));

        //FAILURE -> returns insertionPoint
        System.out.println(Arrays.binarySearch(objectArray, "S", new MyComparator1()));

        //without passing comparator -> returns unpredictable result
        System.out.println(Arrays.binarySearch(objectArray, "N"));
    }
}

class MyComparator1 implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        //parsing
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return s2.compareTo(s1);
    }
}

