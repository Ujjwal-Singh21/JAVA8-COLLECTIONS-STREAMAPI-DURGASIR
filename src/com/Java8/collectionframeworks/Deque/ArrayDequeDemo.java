package com.Java8.collectionframeworks.Deque;

import java.util.ArrayDeque;
import java.util.Iterator;

//Insertion/deletion possible from both ends, so
//Some extra methods like pollFirst(), pollLast(), peekFirst(), peekLast().
//Also known as array deck
public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        //adding
        arrayDeque.add(33);
        arrayDeque.addFirst(5);
        arrayDeque.addLast(100);
        arrayDeque.offer(61);
        arrayDeque.offerFirst(55);
        arrayDeque.offerLast(555);
        System.out.println("Initially: " + arrayDeque);

        //accessing
        int getFirst = arrayDeque.getFirst();
        System.out.println("After getfirst: " + getFirst);
        int getLast = arrayDeque.getLast();
        System.out.println("After getLast: " + getLast);

        //checking top element
        int peek = arrayDeque.peek();
        System.out.println("Peek Element: " + peek);
        int peekFirst = arrayDeque.peekFirst();
        System.out.println("Peek First Element: " + peekFirst);
        int peekLast = arrayDeque.peekLast();
        System.out.println("Peek Last Element: " + peekLast);

        //finding size
        int size = arrayDeque.size();
        System.out.println("Size: " + size);

        //checking if empty
        boolean result = arrayDeque.isEmpty();
        System.out.println("Check if empty: " + result);

        //printing using iterator
        Iterator iterator = arrayDeque.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //removing
        arrayDeque.poll();
        System.out.println("After poll: " + arrayDeque);
        arrayDeque.pollFirst();
        System.out.println("After pollFirst : " + arrayDeque);
        arrayDeque.pollLast();
        System.out.println("After pollLast : " + arrayDeque);
        arrayDeque.removeFirst();
        System.out.println("After removeFirst: " + arrayDeque);
        arrayDeque.removeLast();
        System.out.println("After removeLast: " + arrayDeque);

        //clear
        arrayDeque.clear();
        System.out.println("After clearing Completely: " + arrayDeque);


    }

}
