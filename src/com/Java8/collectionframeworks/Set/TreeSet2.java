package com.Java8.collectionframeworks.Set;

import java.util.TreeSet;

// ClassCastException because, StringBuffer objects are added, and StringBuffer class
// does not implement Comparable interface.
// But is started implementing Comparable interface from Java 11 hence no error here.
public class TreeSet2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        treeSet.add(new StringBuffer("A"));
        treeSet.add(new StringBuffer("Z"));
        treeSet.add(new StringBuffer("L"));
        treeSet.add(new StringBuffer("B"));

        System.out.println(treeSet);

    }
}
