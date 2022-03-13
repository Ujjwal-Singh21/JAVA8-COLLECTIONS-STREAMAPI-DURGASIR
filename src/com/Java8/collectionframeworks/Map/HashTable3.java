package com.Java8.collectionframeworks.Map;
import java.util.Hashtable;

//Changing HashCode return type -> return i % 9
class Tempp {
    //global variable
    int i;

    //Constructor
    Tempp(int i) {
        this.i = i;
    }

    //tells bucket position
    @Override
    public int hashCode() {
        return i % 9;
    }

    //returns whatever passed in Constructor while creating object
    @Override
    public String toString() {
        return i + " ";
    }

}

public class HashTable3 {
    public static void main(String[] args) {

        // by default gets created with 11 buckets since initialCapacity = 11
        Hashtable hashtable = new Hashtable<>();

        hashtable.put(new Tempp(5), " A");
        hashtable.put(new Tempp(2), " B");
        hashtable.put(new Tempp(6), " C");
        hashtable.put(new Tempp(15), " D");
        hashtable.put(new Tempp(23), " E");
        hashtable.put(new Tempp(16), " F");

        System.out.println(hashtable);
    }
}
