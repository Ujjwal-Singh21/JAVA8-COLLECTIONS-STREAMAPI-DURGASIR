package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;

// 1) Using 1st binarySearch() method of Collections(C) class.
// 2) returns index no if search is success,  else returns insertionPoint.
// 3) Make sure to sort the List using 1st sort() method before passing it to binary search.
public class SearchingOne {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        //adding
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("M");
        arrayList.add("K");
        arrayList.add("a");

        System.out.println("Before sorting: " + arrayList);

        //First sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);

        //Then passing to the 1st binarySearch() method
        //Success -> returns index number
        System.out.println( Collections.binarySearch(arrayList, "Z"));

        //Failure -> returns insertionPoint.
        System.out.println( Collections.binarySearch(arrayList, "J"));


    }
}
