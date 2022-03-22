package com.Java8.collectionframeworks.List;

import java.util.Iterator;
import java.util.LinkedList;

//With generics(eg->Integer)
public class LinkedList1 {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        //for learning addAll() method
        LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(45);
        linkedList2.add(55);
        linkedList2.add(65);

        //add elements
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(22);
        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(2);
        System.out.println(linkedList);

        //add an element in the middle -> good choice in LL
        linkedList.add(3, 33);
        System.out.println("After inserting: " + linkedList);

        //get elements using index number -> Bad choice in LL
        int element = linkedList.get(2);
        System.out.println("Element at index no 2: " + element);

        //addAll()
        linkedList.addAll(linkedList2);
        System.out.println("Add all: " + linkedList);

        //removeAll()
        linkedList.removeAll(linkedList2);
        System.out.println("Remove All: " + linkedList);

        //set(or)update an element
        linkedList.set(3, 333);
        System.out.println("After updating: " + linkedList);

        //delete an element
        linkedList.remove(4);
        System.out.println("After deleting: " + linkedList);

        //finding size of the arrayList
        int size = linkedList.size();
        System.out.println("Size of arrayList: " + size);

        //printing using for loop
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println("Using for loop: " + linkedList.get(i));
        }

        //printing using Iterator Interface and while loop
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //printing using enhanced for loop
        for (Integer i : linkedList) {
            System.out.println("Using Enhanced for loop: " + i);
        }

        //clear()
        linkedList.clear();
        System.out.println("After clear all: " + linkedList);

    }
}
