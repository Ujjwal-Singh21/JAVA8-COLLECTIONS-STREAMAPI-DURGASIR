package com.Java8.collectionframeworks.Set;

import java.util.TreeSet;

//Heterogeneous objects/elements not allowed, if inserted -> ClassCastException
//null allowed but only in an empty TreeSet Object, otherwise -> NullPointerException
public class TreeSet1 {
    public static void main(String[] args) {

        //Without generic
        TreeSet treeSet = new TreeSet<>();

        //adding only strings
        treeSet.add("A");
        treeSet.add("D");
        treeSet.add("d");
        treeSet.add("F");
        treeSet.add("a");
        System.out.println("TreeSet: " + treeSet);

        //adding heterogeneous -> ClassCastException
//        treeSet.add(5);

        //adding null in a non-empty TreeSet -> NullPointerException
//        treeSet.add(null);


    }
}
