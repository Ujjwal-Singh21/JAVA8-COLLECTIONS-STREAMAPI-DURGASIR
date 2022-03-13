package com.Java8.collectionframeworks.CollectionsClass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

//using reverse() method of Collections class
//it reverses the order of given elements.
public class ReverseOne {
    public static void main(String[] args) {

        // 1) reversing an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding
        arrayList.add(234);
        arrayList.add(124);
        arrayList.add(453);
        arrayList.add(943);
        arrayList.add(98);
        System.out.println("Initial ArrayList " + arrayList);

        //reversing -> reverse()
        Collections.reverse(arrayList);
        System.out.println("ArrayList After reverse: " + arrayList);

        // 2) reversing an LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        //adding
        linkedList.add("Steve");
        linkedList.add("Bruce");
        linkedList.add("Clarke");
        linkedList.add("Diana");
        linkedList.add("Rogers");
        System.out.println("Initial LinkedList " + linkedList);

        //reversing -> reverse()
        Collections.reverse(linkedList);
        System.out.println("LinkedList After reverse: " + linkedList);

        // 3) Reversing an array: Arrays class in Java does not have a reverse method.
        //    We can use Collections class reverse method() to reverse it.
        Integer[] array = {32, 43, 55, 61, 87};
        System.out.println("Initial Array: " + Arrays.toString(array));

        //changing normal array to a List using Arrays class asList() method, then reversing.
        //because collections class reverse() method takes only list as argument.
        Collections.reverse(Arrays.asList(array));
        System.out.println("Array after reverse: " + Arrays.toString(array));


    }
}
