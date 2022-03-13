package com.Java8.collectionframeworks.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

// All same as Parent HashMap(C), Except
// Insertion order maintained
public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        //adding -> put() method here
        linkedHashMap.put(151, "Steve");
        linkedHashMap.put(105, "Diana");
        linkedHashMap.put(103, "Bruce");
        linkedHashMap.put(102, "Clarke");
        linkedHashMap.put(101, "Stark");
//        hashMap.put(null, "One");

        System.out.println("Initially: " + linkedHashMap);

        //accessing with key help
        System.out.println("Accessing: " + linkedHashMap.get(105));

        //removing with key help
        System.out.println("Deleting: " + linkedHashMap.remove(101));
        System.out.println("After delete: " + linkedHashMap);

        //checking if particular key is available
        System.out.println("Whether key is available: " + linkedHashMap.containsKey(105));

        //checking if particular Value is available
        System.out.println("Whether value is available: " + linkedHashMap.containsValue("Steve"));

        //checking if map object is empty
        System.out.println("Whether empty: " + linkedHashMap.isEmpty());

        //checking size
        System.out.println("Checking size: " + linkedHashMap.size());

        //getting only set of keys -> Set keySet();
        Set<Integer> keySet = linkedHashMap.keySet();
        System.out.println("All keys: " + keySet);

        //getting only list of values -> Collection values();
        Collection<String> valuesList = linkedHashMap.values();
        System.out.println("All values: " + valuesList);

        //getting all available entries -> Set entrySet();
        Set<Map.Entry<Integer, String>> entries = linkedHashMap.entrySet();
        System.out.println("All Entries: " + entries);

        //Map(I) -> internally has Entry(I)
        //methods applicable on each Entry -> getKey(), getValue(), setValue()
        //So get all entries first -> then apply methods on each Entry while iterating
        for (Map.Entry<Integer, String> allEntries : linkedHashMap.entrySet()) {
            if (allEntries.getKey() == 151) {
                allEntries.setValue("Steve Smith");
            }

            System.out.println("Keys: " + allEntries.getKey()
                    + " " + "Values: " + allEntries.getValue());
        }

    }
}
