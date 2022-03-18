package com.Java8.collectionframeworks.Map;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

//No Insertion order maintained -> Insertion happens based on HashCode of keys
//1 null key allowed
//multiple null values allowed
//duplicate keys -> if given twice, NullPointerException
//duplicate values -> allowed
//JVM use .equals() operator to identify duplicate keys
public class HashMapDemo1 {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();

        //adding -> put() method here
        hashMap.put(151, "Steve");
        hashMap.put(105, "Diana");
        hashMap.put(103, "Bruce");
        hashMap.put(102, "Clarke");
        hashMap.put(101, "Stark");
//      hashMap.put(null, "One"); -> 1 null key allowed

        System.out.println("Initially: " + hashMap);

        //accessing with key help
        System.out.println("Accessing: " + hashMap.get(105));

        //removing with key help
        System.out.println("Deleting: " + hashMap.remove(101));
        System.out.println("After delete: " + hashMap);

        //checking if particular key is available
        System.out.println("Whether key is available: " + hashMap.containsKey(105));

        //checking if particular Value is available
        System.out.println("Whether value is available: " + hashMap.containsValue("Steve"));

        //checking if map object is empty
        System.out.println("Whether empty: " + hashMap.isEmpty());

        //checking size
        System.out.println("Checking size: " + hashMap.size());

        //getting only set of keys -> Set keySet();
        Set<Integer> keySet = hashMap.keySet();
        System.out.println("All keys: " + keySet);

        //getting only list of values -> Collection values();
        Collection<String> valuesList = hashMap.values();
        System.out.println("All values: " + valuesList);

        //getting all available entries -> Set entrySet();
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        System.out.println("All Entries: " + entries);

        //Map(I) -> internally has Entry(I)
        //methods applicable on each Entry -> getKey(), getValue(), setValue()
        //So get all entries first -> then apply methods on each Entry while iterating
        for (Map.Entry<Integer, String> allEntries : hashMap.entrySet()) {
            if (allEntries.getKey() == 151) {
                allEntries.setValue("Steve Smith");
            }

            System.out.println("Keys: " + allEntries.getKey()
                    + " " + "Values: " + allEntries.getValue());
        }

        //clearing everything
        hashMap.clear();
        System.out.println("After clear: " + hashMap);

    }
}
