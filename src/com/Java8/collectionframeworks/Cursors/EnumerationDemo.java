package com.Java8.collectionframeworks.Cursors;
import java.util.Enumeration;
import java.util.Vector;

// 1) Introduced in Version-1.0.
// 2) Not universal -> applicable only to Legacy Classes -> (Vector).
// 3) Can perform "read" operation only.
// 4) We can get it with help of Vector Object.
// 5) UniDirectional.
public class EnumerationDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();

        //adding Objects
        for (int i = 0; i <= 10; i++) {
            vector.addElement(i);
        }

        System.out.println("Initially: " + vector);

        //getting Enumeration
        Enumeration<Integer> enumeration = vector.elements();

        while (enumeration.hasMoreElements()) {
            Integer i = enumeration.nextElement();

            //getting only even numbers
            if (i % 2 == 0) {
                System.out.println("Only even numbers: " + i);
            }
        }
    }
}
