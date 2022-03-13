package com.Java8.collectionframeworks.Map;

import java.util.TreeMap;

// 1) NavigableSet(I) was introduced in version 1.6
// 2) It provides few new useful methods helpful in navigation purposes
public class NavigableMapMethods {
    public static void main(String[] args) {

        TreeMap<String, String> treeMap = new TreeMap<>();

        //adding
        treeMap.put("b", "banana");
        treeMap.put("c", "cat");
        treeMap.put("a", "apple");
        treeMap.put("d", "dog");
        treeMap.put("g", "gun");
        System.out.println("Initially: " + treeMap);

        // method1 -> ceilingKey()
        System.out.println("ceilingKey: " + treeMap.ceilingKey("c"));

        //method2 -> higherKey()
        System.out.println("higherKey: " + treeMap.higherKey("e"));

        //method3 -> floorKey()
        System.out.println("floorKey: " + treeMap.floorKey("e"));

        //method4 -> lowerKey()
        System.out.println("lowerKey: " + treeMap.lowerKey("e"));

        //method5 -> descendingMap()
        System.out.println("descendingMap: " + treeMap.descendingMap());

        //method6 -> firstEntry()
        System.out.println("First Entry: " + treeMap.firstEntry());

        //method6 -> lastEntry()
        System.out.println("Last Entry: " + treeMap.lastEntry());

        //method7 -> removing firstEntry -> pollFirstEntry()
        System.out.println("pollFirstEntry: " + treeMap.pollFirstEntry());
        System.out.println("After removing first Entry: " + treeMap);

        //method8 -> removing lastEntry -> pollLastEntry()
        System.out.println("pollLastEntry: " + treeMap.pollLastEntry());
        System.out.println("After removing last Entry: " + treeMap);

    }
}
