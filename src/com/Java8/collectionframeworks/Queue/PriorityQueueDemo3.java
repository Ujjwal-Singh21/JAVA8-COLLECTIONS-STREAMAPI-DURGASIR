package com.Java8.collectionframeworks.Queue;
import java.util.Comparator;
import java.util.PriorityQueue;

//Using 3rd constructor for customized sorting -> takes (initialCapacity, Comparator)
class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        //Parsing String object types elements to primitive type first
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        return s2.compareTo(s1);
    }
}

public class PriorityQueueDemo3 {
    public static void main(String[] args) {

        PriorityQueue<String> priorityQueue =
                new PriorityQueue<String>(15, new MyComparator());

        //adding String Objects
        priorityQueue.offer("A");
        priorityQueue.offer("Z");
        priorityQueue.offer("L");
        priorityQueue.offer("B");
        priorityQueue.offer("C");

        System.out.println("Customized Sorting: " + priorityQueue);

    }
}
