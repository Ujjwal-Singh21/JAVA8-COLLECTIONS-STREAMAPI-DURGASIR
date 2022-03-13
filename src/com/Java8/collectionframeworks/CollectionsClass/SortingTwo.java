package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1) Second sorting method of Collections class used for customized sorting
// 2) Here we pass Comparator object as 2nd argument to sort() method.
public class SortingTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding
        arrayList.add(234);
        arrayList.add(124);
        arrayList.add(453);
        arrayList.add(943);
        arrayList.add(98);

        System.out.println("Before sorting: " + arrayList);

        //sorting
        Collections.sort(arrayList, new MyComparator());
        System.out.println("After sorting: " + arrayList);
    }
}

class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        Integer integer1 = (Integer) i1;
        Integer integer2 = (Integer) i2;

        return integer2.compareTo(integer1);

//        if (i1 > i2) {
//            return -1;
//        } else if (i1 < i2) {
//            return 1;
//        } else
//            return 0;

    }
}