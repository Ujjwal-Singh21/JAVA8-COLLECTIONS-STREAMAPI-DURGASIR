package com.Java8.collectionframeworks.List;

import java.util.ArrayList;
import java.util.Iterator;

//With generics(eg->Integer)
public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        //for learning addAll() method
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(45);
        arrayList2.add(55);
        arrayList2.add(65);

        //add elements
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(22);
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(2);
        System.out.println(arrayList);

        //add an element in the middle
        arrayList.add(3, 33);
        System.out.println("After inserting: " + arrayList);

        //get elements using index number
        int element = arrayList.get(2);
        System.out.println("Element at index no 2: " + element);

        //addAll()
        arrayList.addAll(arrayList2);
        System.out.println("Add all: " + arrayList);

        //removeAll()
        arrayList.removeAll(arrayList2);
        System.out.println("Remove All: " + arrayList);

        //set(or)update an element
        arrayList.set(3, 333);
        System.out.println("After updating: " + arrayList);

        //delete an element
        arrayList.remove(4);
        System.out.println("After deleting: " + arrayList);

        //finding size of the arrayList
        int size = arrayList.size();
        System.out.println("Size of arrayList: " + size);

        //printing using for loop
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("Using for loop: " + arrayList.get(i));
        }

        //printing using Iterator Interface and while loop
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Using iterator: " + iterator.next());
        }

        //printing using enhaced for loop
        for (Integer i : arrayList) {
            System.out.println("Using Enhanced for loop: " + i);
        }

        //clear()
        arrayList.clear();
        System.out.println("After clear all: " + arrayList);


    }
}
