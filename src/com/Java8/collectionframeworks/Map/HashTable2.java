package com.Java8.collectionframeworks.Map;

import java.util.Hashtable;

// 1) Since HashTable insertions happens based on HashCode of keys,
// 2) We can't exactly predict the output.
// 3) Lets re-define hashCode() and toString() method to give our own HashCode,
//    So that we can predict the output, and also prove line no 1.
class TempClass {
    //global variable
    int i;

    //Constructor
    TempClass(int i) {
        this.i = i;
    }

    //tells bucket position
    @Override
    public int hashCode() {
        return i;
    }

    //returns whatever passed in Constructor while creating object
    @Override
    public String toString() {
        return i + " ";
    }

}

public class HashTable2 {
    public static void main(String[] args) {

        // by default gets created with 11 buckets since initialCapacity = 11
        Hashtable hashtable = new Hashtable<>();

        hashtable.put(new TempClass(5), " A");
        hashtable.put(new TempClass(2), " B");
        hashtable.put(new TempClass(6), " C");
        hashtable.put(new TempClass(15), " D");
        hashtable.put(new TempClass(23), " E");
        hashtable.put(new TempClass(16), " F");

        System.out.println(hashtable);


    }
}
