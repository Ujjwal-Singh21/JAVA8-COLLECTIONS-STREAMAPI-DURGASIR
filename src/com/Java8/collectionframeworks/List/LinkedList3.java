package com.Java8.collectionframeworks.List;

import java.util.LinkedList;

//Generic LinkedList
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        //adding
        linkedList.add(45);
        linkedList.add("Rohit Sharma");
        linkedList.add(16.5);

        System.out.println("Generic LinkedList: " + linkedList);
    }
}
