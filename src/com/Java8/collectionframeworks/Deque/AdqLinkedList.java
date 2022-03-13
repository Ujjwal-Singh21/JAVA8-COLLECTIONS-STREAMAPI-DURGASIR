package com.Java8.collectionframeworks.Deque;

import java.util.*;

public class AdqLinkedList {

    public static void main(String[] args) {

        Queue<Integer> linkedListQueue1 = new LinkedList<>();

        //false
        //This is LinkedList from Queue(I) and not from List(I)
        //Hence, no random access
        System.out.println(linkedListQueue1 instanceof RandomAccess);

        //adding -> using add()
        linkedListQueue1.add(12);
        linkedListQueue1.add(7);
        linkedListQueue1.add(null);
        System.out.println("Initially: " + linkedListQueue1);

        //adding -> using offer()
        linkedListQueue1.add(2);
        linkedListQueue1.add(32);
        System.out.println("Offer: " + linkedListQueue1);

        //finding size
        int size = linkedListQueue1.size();
        System.out.println("Size: " + size);

        //checking if empty
        boolean result = linkedListQueue1.isEmpty();
        System.out.println("Check if empty: " + result);

        //accessing top element -> peek()
        int topElement1 = linkedListQueue1.peek();
        System.out.println("Top element using peek: " + topElement1);

        //accessing top element -> element()
        int topElement2 = linkedListQueue1.element();
        System.out.println("Top element using element: " + topElement2);

        //deleting -> using poll()
        linkedListQueue1.poll();
        System.out.println("After poll: " + linkedListQueue1);

        //deleting -> using remove
        linkedListQueue1.remove();
        System.out.println("After remove: " + linkedListQueue1);

        //clear
        linkedListQueue1.clear();
        System.out.println("After clearing fully: " + linkedListQueue1);

    }
}
