package com.Java8.ComparatorWithLambda;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        return (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;
    }
}

public class NormalDemo {
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
        Collections.sort(arrayList, new MyComparator());
        System.out.println("After sort: " + arrayList);

    }
}
