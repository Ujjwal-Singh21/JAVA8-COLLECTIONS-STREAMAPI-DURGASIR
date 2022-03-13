package com.Java8.collectionframeworks.Set;

import java.util.SortedSet;
import java.util.TreeSet;

//Special methods of parent SortedSet(I)
public class TreeSet4 {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        //adding elements
        treeSet.add(101);
        treeSet.add(102);
        treeSet.add(105);
        treeSet.add(108);
        treeSet.add(110);
        treeSet.add(115);

        System.out.println("Initially: " + treeSet);

        //to return first element
        int firstElement = treeSet.first();
        System.out.println("First Element: " + firstElement);

        //to return last element
        int lastElement = treeSet.last();
        System.out.println("Last Element: " + lastElement);

        //returns all elements that are lesser than passed element
        SortedSet<Integer> headSet = treeSet.headSet(105);
        System.out.println("Head set: " + headSet);

        //returns all elements that are greater than passed element including passed element
        SortedSet<Integer> tailSet = treeSet.tailSet(105);
        System.out.println("Tail set: " + tailSet);

        //returns a particular SubSet using given range
        SortedSet<Integer> subset = treeSet.subSet(102, 110);
        System.out.println("Subset: " + subset);


    }
}
