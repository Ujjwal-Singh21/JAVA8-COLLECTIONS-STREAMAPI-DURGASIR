package com.Java8.collectionframeworks.Cursors;
import java.util.ArrayList;
import java.util.ListIterator;

// 1) Introduced in Version-1.2 & Child Interface of ListIteratorDemo(I)
// 2) Applicable only for any Child classes of List(I).
// 3) Can perform many operations now -> read, add, update, remove.
// 4) To get it -> List(I) -> has ListIterator() method.
// 5) We can get it with help of List Object.
// 6) Bi-Directional.
public class ListIteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        //adding
        arrayList.add("Steve");
        arrayList.add("Bruce");
        arrayList.add("Clarke");
        arrayList.add("Diana");

        System.out.println("Initially: " + arrayList);

        //getting ListIterator
        ListIterator<String> listIterator = arrayList.listIterator();

        //operations -> delete/remove, add, update respectively
        //forward
        while (listIterator.hasNext()) {
            String s = listIterator.next();

            if (s.equals("Steve")) {
                listIterator.remove();
            } else if (s.equals("Diana")) {
                listIterator.add("Stark");
            } else if (s.equals("Bruce")) {
                listIterator.set("Bruce Wayne");
            }
        }

        //backward
        while (listIterator.hasPrevious()) {
            String s = listIterator.previous();
            System.out.println("Previous: " + s);
        }

        //finally, printing after all operations
        System.out.println("Finally: " + arrayList);
    }
}
