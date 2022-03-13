package com.Java8.collectionframeworks.Map;

import java.util.*;

// 1) Maintains natural sorting order based on keys
// 2) Duplicate & null keys not allowed, duplicate values allowed
// 3) Child implementation class of SortedMap(I)
// 4) Hence has some extra specific method like,
// 5) firstKey(), lastKey(), headMap(), tailMap(), subMap() -> check TreeMapDemo2
public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        //adding
        treeMap.put(104, "Bruce");
        treeMap.put(101, "Clarke");
        treeMap.put(102, "Diana");
        treeMap.put(103, "Peter");
        treeMap.put(151, "Steve");
        System.out.println("Initially: " + treeMap);

        //accessing
        System.out.println(treeMap.get(101));

        //replacing
        treeMap.replace(103, "Peter", "Peter Parker");
        System.out.println("After replacing Peter: " + treeMap);

        //checking if particular key is available
        System.out.println("Whether key is available: " + treeMap.containsKey(105));

        //checking if particular Value is available
        System.out.println("Whether value is available: " + treeMap.containsValue("Peter"));

        //checking if map object is empty
        System.out.println("Whether empty: " + treeMap.isEmpty());

        //checking size
        System.out.println("Checking size: " + treeMap.size());

        //getting only set of keys -> Set keySet();
        Set<Integer> keySet = treeMap.keySet();
        System.out.println("All keys: " + keySet);

        //getting only list of values -> Collection values();
        Collection<String> valuesList = treeMap.values();
        System.out.println("All values: " + valuesList);

        //getting all available entries -> Set entrySet();
        Set<Map.Entry<Integer, String>> entries = treeMap.entrySet();
        System.out.println("All Entries: " + entries);

        //Map(I) -> internally has Entry(I)
        //methods applicable on each Entry -> getKey(), getValue(), setValue()
        //So get all entries first -> then apply methods on each Entry while iterating
        for (Map.Entry<Integer, String> allEntries : treeMap.entrySet()) {
            if (allEntries.getKey() == 151) {
                allEntries.setValue("Steve Smith");
            }

            System.out.println("Keys: " + allEntries.getKey()
                    + " " + "Values: " + allEntries.getValue());
        }

        //removing with key help
        System.out.println("Deleting: " + treeMap.remove(101));
        System.out.println("After delete: " + treeMap);

        //clearing everything
        treeMap.clear();
        System.out.println("After clear: " + treeMap);


    }
}
