package com.Java8.collectionframeworks.List;

import java.util.LinkedList;

// Usually we can use LinkedList to implement stack(LIFO) and queue(FIFO).
// To provide support for these requirements,
// Only LinkedList class has these extra 6 specific methods
public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //add elements
        linkedList.addFirst(1);
        linkedList.addLast(100);
        System.out.println(linkedList);

        //get elements
        int firstElement = linkedList.getFirst();
        int lastElement = linkedList.getLast();
        System.out.println("GetFirst: " + firstElement + " GetLast: " + lastElement);

        //remove elements
        linkedList.removeFirst();
        System.out.println("After removeFirst: " + linkedList);
        linkedList.removeLast();
        System.out.println("After removeLast: " + linkedList);
    }
}
