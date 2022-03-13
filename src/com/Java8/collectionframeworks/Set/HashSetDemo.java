package com.Java8.collectionframeworks.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        //False -> Because elements are stored randomly
        System.out.println(hashSet instanceof RandomAccess);

        //for learning addAll() method
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(45);
        hashSet2.add(55);
        hashSet2.add(65);

        //add elements
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(22);
        hashSet.add(1);
        hashSet.add(null);
        hashSet.add(null); // Even though null value added twice, output will show only 1
        hashSet.add(2); // add method returns false and element won't get added
        System.out.println(hashSet);

        //addAll()
        hashSet.addAll(hashSet2);
        System.out.println("Add all: " + hashSet);

        //removeAll()
        hashSet.removeAll(hashSet2);
        System.out.println("Remove All: " + hashSet);

        //delete an element
        hashSet.remove(4);
        System.out.println("After deleting: " + hashSet);

        //finding size of the arrayList
        int size = hashSet.size();
        System.out.println("Size of arrayList: " + size);

        //printing using Iterator Interface and while loop
        Iterator<Integer> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //printing using enhanced for loop
        for (Integer i : hashSet) {
            System.out.println("Using Enhanced for loop: " + i);
        }

        //printing using advanced for-each loop
        hashSet.forEach(System.out::println);

        //clear()
        hashSet.clear();
        System.out.println("After clear all: " + hashSet);

    }
}
