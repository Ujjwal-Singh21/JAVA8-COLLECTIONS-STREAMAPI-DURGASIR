package com.Java8.collectionframeworks.Map;

import java.util.IdentityHashMap;

//In HashMap -> JVM use .equals() operator to identify duplicate keys.
//In IdentityHashMap -> JVM use == operator to identify duplicate keys.
public class IdentityHashMapDemo {
    public static void main(String[] args) {

//        //With Hashmap first for comparison
//        HashMap hashMap = new HashMap<>();
//
//        Integer I1 = new Integer(10);
//        Integer I2 = new Integer(10);
//
//        hashMap.put(I1, "Ram");
//        hashMap.put(I2, "Shyam");
//
//        // output -> {10=Shyam} => content equal so re-assigned
//        System.out.println("With HashMap: " + hashMap);

        //now With IdentityHashMap
        IdentityHashMap identityHashMap = new IdentityHashMap();

        Integer I1 = new Integer(10);
        Integer I2 = new Integer(10);

        identityHashMap.put(I1, "Ram");
        identityHashMap.put(I2, "Shyam");

        // output -> {10=Ram, 10=Shyam} => memory not equal so not re-assigned
        System.out.println("With Identity HashMap: " + identityHashMap);

    }
}
