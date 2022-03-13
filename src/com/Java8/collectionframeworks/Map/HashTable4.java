package com.Java8.collectionframeworks.Map;
import java.util.Hashtable;

class Temppp {
    //global variable
    int i;

    //Constructor
    Temppp(int i) {
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

public class HashTable4 {
    public static void main(String[] args) {

        //gets created with 35 buckets since initialCapacity = 25 is passed
        Hashtable hashtable = new Hashtable<>(25);

        hashtable.put(new Temppp(5), " A");
        hashtable.put(new Temppp(2), " B");
        hashtable.put(new Temppp(6), " C");
        hashtable.put(new Temppp(15), " D");
        hashtable.put(new Temppp(23), " E");
        hashtable.put(new Temppp(16), " F");

        System.out.println(hashtable);
    }
}
