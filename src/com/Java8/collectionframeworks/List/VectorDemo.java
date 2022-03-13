package com.Java8.collectionframeworks.List;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        int initialCapacity = vector.capacity();
        System.out.println("Initial vector capacity: " + initialCapacity);

        for (int i = 1; i <= 10; i++) {
            vector.add(i);
            //vector.addElement(i);
        }

        //finding size of vector
        int size = vector.size();
        System.out.println("Vector size is: " + size);

        //find capacity
        int capacity = vector.capacity();
        System.out.println("Vector Capacity: " + capacity);

        //adding 11th element
        vector.addElement(11);

        //finding new capacity now which will be double(20) than initial(10)
        int newCapacity = vector.capacity();
        System.out.println("Vector Capacity: " + newCapacity);

        //get elements
        int element = vector.get(3);
        int element2 = vector.elementAt(4);
        System.out.println(element + " " + element2);


        //can use both methods to delete
        vector.remove(3);
        vector.removeElementAt(4);
        System.out.println(vector);

        //both can be used to clear all elements
        vector.clear();
        vector.removeAllElements();
        System.out.println("After deleting all: " +vector);

    }
}
