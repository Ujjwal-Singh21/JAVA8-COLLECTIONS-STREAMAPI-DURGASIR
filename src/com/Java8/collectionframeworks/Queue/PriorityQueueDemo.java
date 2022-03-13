package com.Java8.collectionframeworks.Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//Null values not allowed
//Maintains natural sorting by default
public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        System.out.println(priorityQueue.peek()); //null
//        priorityQueue.element(); //R.E -> NoSuchElementException

        //adding -> using add()
        priorityQueue.add(12);
        priorityQueue.add(7);
        priorityQueue.add(7);
        System.out.println("Initially: " + priorityQueue);

        //adding -> using offer()
        priorityQueue.offer(2);
        priorityQueue.offer(32);
        System.out.println("Offer: " + priorityQueue);

        //finding size
        int size = priorityQueue.size();
        System.out.println("Size: " + size);

        //checking if empty
        boolean result = priorityQueue.isEmpty();
        System.out.println("Check if empty: " + result);

        //accessing top element -> peek()
        Integer topElement1 = priorityQueue.peek();
        System.out.println("Top element using peek: " + topElement1);

        //accessing top element -> element()
        int topElement2 = priorityQueue.element();
        System.out.println("Top element using element: " + topElement2);

        //printing using iterator
        Iterator<Integer> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //deleting -> using poll()
        priorityQueue.poll();
        System.out.println("After poll: " + priorityQueue);

        //deleting -> using remove()
        priorityQueue.remove();
        System.out.println("After remove: " + priorityQueue);

        //clear
        priorityQueue.clear();
        System.out.println("After clearing Completely: " + priorityQueue);

    }
}
