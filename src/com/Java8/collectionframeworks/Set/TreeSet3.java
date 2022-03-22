package com.Java8.collectionframeworks.Set;

import java.util.Iterator;
import java.util.RandomAccess;
import java.util.TreeSet;

// With generics -> Integer
public class TreeSet3 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        //False -> Though Natural order is preserved,
        //But, There is no index numbers available.
        System.out.println(treeSet instanceof RandomAccess);

        //for learning addAll() method
        TreeSet<Integer> treeSet2 = new TreeSet<>();
        treeSet2.add(45);
        treeSet2.add(55);
        treeSet2.add(65);

        //add elements
        treeSet.add(2);
        treeSet.add(4);
        treeSet.add(22);
        treeSet.add(1);
        // add method returns false and element won't get added because duplicate
        treeSet.add(2);
        System.out.println(treeSet);

        //addAll()
        treeSet.addAll(treeSet2);
        System.out.println("Add all: " + treeSet);

        //removeAll()
        treeSet.removeAll(treeSet2);
        System.out.println("Remove All: " + treeSet);

        //delete an element
        treeSet.remove(4);
        System.out.println("After deleting: " + treeSet);

        //finding size of the arrayList
        int size = treeSet.size();
        System.out.println("Size of arrayList: " + size);

        //printing using Iterator Interface and while loop
        Iterator<Integer> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //printing using enhanced for loop
        for (Integer i : treeSet) {
            System.out.println("Using Enhanced for loop: " + i);
        }

        //printing using advanced for-each loop
        treeSet.forEach(System.out::println);

        //clear()
        treeSet.clear();
        System.out.println("After clear all: " + treeSet);
    }
}
