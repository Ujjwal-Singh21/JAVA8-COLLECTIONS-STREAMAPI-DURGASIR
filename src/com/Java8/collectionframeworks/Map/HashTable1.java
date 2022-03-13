package com.Java8.collectionframeworks.Map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

//All same as HastMap, except
// 1) It is Synchronized and Thread Safe
// 2) No null keys or values allowed
// 3) duplicate keys -> if used twice then value gets re-assigned
// 4) duplicate values allowed
public class HashTable1 {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //adding -> put() method here
        hashtable.put(151, "Steve");
        hashtable.put(105, "Diana");
        hashtable.put(103, "Bruce");
        hashtable.put(102, "Clarke");
        hashtable.put(101, "Stark");
//        hashtable.put(null, "One"); -> NPE

        System.out.println("Initially: " + hashtable);

        //accessing with key help
        System.out.println("Accessing: " + hashtable.get(105));

        //removing with key help
        System.out.println("Deleting: " + hashtable.remove(101));
        System.out.println("After delete: " + hashtable);

        //checking if particular key is available
        System.out.println("Whether key is available: " + hashtable.containsKey(105));

        //checking if particular Value is available
        System.out.println("Whether value is available: " + hashtable.containsValue("Steve"));

        //checking if map object is empty
        System.out.println("Whether empty: " + hashtable.isEmpty());

        //checking size
        System.out.println("Checking size: " + hashtable.size());

        //getting only set of keys -> Set keySet();
        Set<Integer> keySet = hashtable.keySet();
        System.out.println("All keys: " + keySet);

        //getting only list of values -> Collection values();
        Collection<String> valuesList = hashtable.values();
        System.out.println("All values: " + valuesList);

        //getting all available entries -> Set entrySet();
        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet();
        System.out.println("All Entries: " + entries);

        //Map(I) -> internally has Entry(I)
        //methods applicable on each Entry -> getKey(), getValue(), setValue()
        //So get all entries first -> then apply methods on each Entry while iterating
        for (Map.Entry<Integer, String> allEntries : hashtable.entrySet()) {
            if (allEntries.getKey() == 151) {
                allEntries.setValue("Steve Smith");
            }

            System.out.println("Keys: " + allEntries.getKey()
                    + " " + "Values: " + allEntries.getValue());
        }

        //clearing everything
        hashtable.clear();
        System.out.println("After clear: " + hashtable);

    }
}
