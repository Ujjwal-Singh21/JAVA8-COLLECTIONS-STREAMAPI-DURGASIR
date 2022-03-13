package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;
import java.util.Comparator;

//using 3rd sort() method from Arrays(C) class for Object type array custom sorting
//using Comparator
public class SortingThree {
    public static void main(String[] args) {

        //creating a primitive type array
        Integer[] objectArray = {23, 78, 11, 98, 54};

        //printing before sort
        //(always use enhanced for-loop for printing arrays)
        System.out.println("Object Array before custom sorting: ");
        for (Integer a : objectArray) {
            System.out.print(a + " ");
        }

        //sorting using 1st sort() method
        Arrays.sort(objectArray, new MyComparator());

        //printing after sort
        System.out.println("\n Object Array after custom sorting:");
        for (Integer a : objectArray) {
            System.out.print(a + " ");
        }

    }
}

class MyComparator implements Comparator {

    @Override
    public int compare(Object obj1, Object obj2) {
        //parsing
        Integer i1 = (Integer) obj1;
        Integer i2 = (Integer) obj2;
        return i2.compareTo(i1);
    }
}
