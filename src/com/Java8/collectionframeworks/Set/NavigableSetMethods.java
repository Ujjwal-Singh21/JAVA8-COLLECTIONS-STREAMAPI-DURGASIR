package com.Java8.collectionframeworks.Set;
import java.util.TreeSet;

// 1) NavigableSet(I) was introduced in version 1.6
// 2) It provides few new useful methods helpful in navigation purposes
public class NavigableSetMethods {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        //adding some Integer objects
        treeSet.add(1000);
        treeSet.add(3000);
        treeSet.add(4000);
        treeSet.add(2000);
        treeSet.add(5000);

        System.out.println("Initially: " + treeSet);

        // method1 -> ceiling() -> >=
        System.out.println("Ceiling 1: " + treeSet.ceiling(1900));
        System.out.println("Ceiling 2: " + treeSet.ceiling(2000));

        //method2 -> higher() -> >
        System.out.println("Higher: " + treeSet.higher(2000));

        //method3 -> floor() -> <=
        System.out.println("Floor 1: " + treeSet.floor(2900));
        System.out.println("Floor 2: " + treeSet.floor(3000));

        //method4 -> lower() -> <
        System.out.println("Lower: " + treeSet.lower(3000));

        //method5 -> descendingSet()
        System.out.println("DescendingSet: " + treeSet.descendingSet());
    }

}
