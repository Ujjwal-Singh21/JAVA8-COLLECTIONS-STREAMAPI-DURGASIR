package com.Java8.collectionframeworks.Map;

import java.util.TreeMap;

// Some specific methods
// firstKey(), lastKey(), headMap(), tailMap(), subMap() etc...
public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        //adding
        treeMap.put(104, "Bruce");
        treeMap.put(101, "Clarke");
        treeMap.put(102, "Diana");
        treeMap.put(103, "Peter");
        treeMap.put(123, "Rogers");
        treeMap.put(145, "Loki");
        System.out.println("Initially: " + treeMap);

        //getting firstKey
        System.out.println("First Key: " + treeMap.firstKey());

        //getting lastKey
        System.out.println("Last Key: " + treeMap.lastKey());

        //headMap() -> < passed value
        System.out.println("headMap: " + treeMap.headMap(103));

        //tailMap() -> >= passed value
        System.out.println("tailMap: " + treeMap.tailMap(104));

        //subMap() -> <= startElement, > endElement
        System.out.println("subMap: " + treeMap.subMap(102, 145));

    }
}
