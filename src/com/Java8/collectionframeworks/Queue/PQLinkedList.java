package com.Java8.collectionframeworks.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.RandomAccess;

// 1) LinkedList(C) along with implmenting List(I)
// 2) It also implements Queue(I) also from Java 1.5 version onwards.
public class PQLinkedList {
    public static void main(String[] args) {

        Queue<Integer> linkedListQueue = new LinkedList<>();

        //false
        //This is LinkedList from Queue(I) and not from List(I)
        //Hence, no random access
        System.out.println(linkedListQueue instanceof RandomAccess);

        //adding -> using add()
        linkedListQueue.add(12);
        linkedListQueue.add(7);
        linkedListQueue.add(22);
        System.out.println("Initially: " + linkedListQueue);

        //adding -> using offer()
        linkedListQueue.offer(2);
        linkedListQueue.offer(32);
        System.out.println("Offer: " + linkedListQueue);

        //finding size
        int size = linkedListQueue.size();
        System.out.println("Size: " + size);

        //checking if empty
        boolean result = linkedListQueue.isEmpty();
        System.out.println("Check if empty: " + result);

        //accessing top element -> peek()
        int topElement1 = linkedListQueue.peek();
        System.out.println("Top element using peek: " + topElement1);

        //accessing top element -> element()
        int topElement2 = linkedListQueue.element();
        System.out.println("Top element using element: " + topElement2);

        //deleting -> using poll()
        linkedListQueue.poll();
        System.out.println("After poll: " + linkedListQueue);

        //deleting -> using remove
        linkedListQueue.remove();
        System.out.println("After remove: " + linkedListQueue);


        //clear
        linkedListQueue.clear();
        System.out.println("After clearing Completely: " + linkedListQueue);

    }
}
