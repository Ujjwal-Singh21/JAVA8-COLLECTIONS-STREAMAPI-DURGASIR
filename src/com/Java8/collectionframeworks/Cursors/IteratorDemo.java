package com.Java8.collectionframeworks.Cursors;
import java.util.ArrayList;
import java.util.Iterator;

// 1) Introduced in Version-1.2.
// 2) Applicable universally for any Child classes of Collection(I).
// 3) Can perform both "read" & "remove" operations now.
// 4) To get it -> Collection(I) -> has iterator() method.
// 5) We can get it with help of Collection Object.
// 6) UniDirectional.
public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        //adding Objects
        for (int i = 0; i <= 10; i++) {
            arrayList.add(i);
        }

        System.out.println("Initially: " + arrayList);

        //getting Iterator
        Iterator<Integer> iterator = arrayList.iterator();

        //performing read and remove operations
        while (iterator.hasNext()) {

            Integer i = iterator.next();

            //getting only even numbers & removing odd numbers
            if (i % 2 == 0) {
                System.out.println("Using iterator: " + i);
            } else {
                iterator.remove();
            }

        }

        System.out.println("Final Print: " + arrayList);

    }
}
