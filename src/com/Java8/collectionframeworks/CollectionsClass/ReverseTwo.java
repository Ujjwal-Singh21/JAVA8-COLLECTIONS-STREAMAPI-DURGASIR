package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//reverseOrder() method of Collections class.
//It takes a Comparator object as argument and reverses the functionality of that Comparator
//then it returns a new Comparator with reversed functionality.
//Here in this example, we have defined a Comparator for descending order functionality,
//we pass that Comparator to Collections.reverseOrder() as arg and that method will return
//a new Comparator which will now be of opposite or reversed functionality(ascending order).
public class ReverseTwo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding
        arrayList.add(234);
        arrayList.add(124);
        arrayList.add(453);
        arrayList.add(943);
        arrayList.add(98);

        System.out.println("Before sorting: " + arrayList);

        //reverseOrder() method
        Comparator<Integer> reversedComparator = Collections.reverseOrder(new MyComparator2());

        //sorting
        Collections.sort(arrayList, reversedComparator);
        System.out.println("After sorting: " + arrayList);
    }
}

class MyComparator2 implements Comparator<Integer> {

    @Override
    public int compare(Integer i1, Integer i2) {
        Integer integer1 = (Integer) i1;
        Integer integer2 = (Integer) i2;
        return integer2.compareTo(integer1);
    }
}