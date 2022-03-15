package com.Java8.ComparatorWithLambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WithAnonymousClass {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(23);
        arrayList.add(1);
        arrayList.add(32);
        arrayList.add(55);
        arrayList.add(0);
        System.out.println("Before sort: " + arrayList);

        //sorting using 2nd sort method of Collections class
        //by passing Comparator object
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;
            }
        };

        Collections.sort(arrayList, comparator);
        System.out.println("After sort: " + arrayList);

    }
}
