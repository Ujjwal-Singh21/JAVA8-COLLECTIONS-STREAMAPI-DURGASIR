package com.Java8.collectionframeworks.BlockingQueue;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

//Thread safe and synchronized
public class PriorityBlockingQueue1 {

    public static void main(String[] args) {

        BlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        //adding -> using add()
        priorityBlockingQueue.add(12);
        priorityBlockingQueue.add(7);
        priorityBlockingQueue.add(7);
        System.out.println("Initially: " + priorityBlockingQueue);

        //adding -> using offer()
        priorityBlockingQueue.add(2);
        priorityBlockingQueue.add(32);
        System.out.println("Offer: " + priorityBlockingQueue);

        //finding size
        int size = priorityBlockingQueue.size();
        System.out.println("Size: " + size);

        //checking if empty
        boolean result = priorityBlockingQueue.isEmpty();
        System.out.println("Check if empty: " + result);

        //accessing top element -> peek()
        int topElement1 = priorityBlockingQueue.peek();
        System.out.println("Top element using peek: " + topElement1);

        //accessing top element -> element()
        int topElement2 = priorityBlockingQueue.element();
        System.out.println("Top element using element: " + topElement2);

        //printing using iterator
        Iterator iterator = priorityBlockingQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //deleting -> using poll()
        priorityBlockingQueue.poll();
        System.out.println("After poll: " + priorityBlockingQueue);

        //deleting -> using remove
        priorityBlockingQueue.remove();
        System.out.println("After remove: " + priorityBlockingQueue);

        //clear
        priorityBlockingQueue.clear();
        System.out.println("After clearing Completely: " + priorityBlockingQueue);

    }
}
