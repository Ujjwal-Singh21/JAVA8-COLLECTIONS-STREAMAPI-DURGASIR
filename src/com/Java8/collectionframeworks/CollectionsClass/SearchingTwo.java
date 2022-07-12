package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// 1) Using 2nd binarySearch() method of Collections(C) class.
// 2) returns index no if search is success,  else returns insertionPoint.
// 3) Make sure to sort the List using 2nd sort() method before passing it to binary search.
//----------------------------------------------------------------------------------------------
public class SearchingTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);

        System.out.println("Before sorting: " + arrayList);

        //First sorting
        Collections.sort(arrayList, new MyComparator1());
        System.out.println("After sorting: " + arrayList);

        //using 2nd binarySearch() method because 2nd sort() method was used
        //if 1st binarySearch() method is used, we may get unpredictable results
        //Success -> returns index number
        System.out.println(Collections.binarySearch(arrayList, 10, new MyComparator1()));

        //Failure -> returns insertionPoint
        System.out.println(Collections.binarySearch(arrayList, 13, new MyComparator1()));

        //1st binarySearch() method is used, we may get unpredictable results
        System.out.println(Collections.binarySearch(arrayList, 17));


    }
}

class MyComparator1 implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        if (i1 > i2) {
            return -1;
        } else if (i1 < i2) {
            return 1;
        } else
            return 0;
    }
}