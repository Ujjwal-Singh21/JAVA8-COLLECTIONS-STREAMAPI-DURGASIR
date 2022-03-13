package com.Java8.collectionframeworks.Set;

import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        //False -> Though insertion order is preserved,
        //But, There is no index numbers available.
        System.out.println(linkedHashSet instanceof RandomAccess);

        //for learning addAll() method
        LinkedHashSet<Integer> linkedHashSet2 = new LinkedHashSet<>();
        linkedHashSet2.add(45);
        linkedHashSet2.add(55);
        linkedHashSet2.add(65);

        //add elements
        linkedHashSet.add(2);
        linkedHashSet.add(4);
        linkedHashSet.add(22);
        linkedHashSet.add(1);
        linkedHashSet.add(null);
        // Even though null value added twice, output will show only 1
        linkedHashSet.add(null);
        // add method returns false and element won't get added because duplicate
        linkedHashSet.add(2);
        System.out.println(linkedHashSet);

        //addAll()
        linkedHashSet.addAll(linkedHashSet2);
        System.out.println("Add all: " + linkedHashSet);

        //removeAll()
        linkedHashSet.removeAll(linkedHashSet2);
        System.out.println("Remove All: " + linkedHashSet);

        //delete an element
        linkedHashSet.remove(4);
        System.out.println("After deleting: " + linkedHashSet);

        //finding size of the arrayList
        int size = linkedHashSet.size();
        System.out.println("Size of arrayList: " + size);

        //printing using Iterator Interface and while loop
        Iterator<Integer> iterator = linkedHashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //printing using enhanced for loop
        for (Integer i : linkedHashSet) {
            System.out.println("Using Enhanced for loop: " + i);
        }

        //printing using advanced for-each loop
        linkedHashSet.forEach(System.out::println);

        //clear()
        linkedHashSet.clear();
        System.out.println("After clear all: " + linkedHashSet);
    }
}
