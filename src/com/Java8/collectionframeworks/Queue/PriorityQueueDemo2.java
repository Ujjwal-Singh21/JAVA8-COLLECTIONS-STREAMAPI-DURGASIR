package com.Java8.collectionframeworks.Queue;

import java.util.PriorityQueue;

// using 1st constructor -> follows Default natural sorting order
// sometime may not show default natural sorted order in output, because of improper
// support from OS of machine.
public class PriorityQueueDemo2 {
    public static void main(String[] args) {

        //initialCapacity = 11;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        System.out.println(priorityQueue.peek()); // null
//        System.out.println(priorityQueue.element()); // R.E => NoSuchElementException

        //adding using for loop
        for (int i = 0; i <= 10; i++) {
            priorityQueue.offer(i);
        }

        System.out.println("Initial: " + priorityQueue);
        //Initial: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10] -> default natural sorting

        //deleting
        priorityQueue.poll();
        System.out.println("After Poll: " + priorityQueue);
        //  After Poll: [1, 3, 2, 7, 4, 5, 6, 10, 8, 9] -> Not sorted because of OS issue


    }
}
