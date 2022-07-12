package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;

//Natural sorting using Collections class first sort method
//Objects should be homogeneous and comparable, null values also not allowed.
//Used to sort List(I) implementation classes.
//-------------------------------------------------------------------------------
public class SortingOne {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding
        arrayList.add(234);
        arrayList.add(124);
        arrayList.add(453);
        arrayList.add(943);
        arrayList.add(98);
//        arrayList.add("Steve"); -> R.E -> ClassCastException
//        arrayList.add(null); -> R.E -> NullPointerException

        System.out.println("Before sorting: " + arrayList);

        //sorting
        Collections.sort(arrayList);
        System.out.println("After sorting: " + arrayList);
    }
}
