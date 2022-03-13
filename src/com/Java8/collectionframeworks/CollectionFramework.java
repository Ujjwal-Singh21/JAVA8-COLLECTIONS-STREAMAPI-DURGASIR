package com.Java8.collectionframeworks;
import java.io.Serializable;
import java.util.*;

// Every Collection Class -> by default implements serializable & Cloneable Interface.
// ArrayList & Vector Class -> by default implements RandomAccess Interface.
public class CollectionFramework {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        LinkedList linkedList = new LinkedList<>();
        Vector vector = new Vector<>();

        //All True
        System.out.println(arrayList instanceof Serializable);
        System.out.println(linkedList instanceof Serializable);
        System.out.println(vector instanceof Serializable);

        //All True
        System.out.println(arrayList instanceof Cloneable);
        System.out.println(linkedList instanceof Cloneable);
        System.out.println(vector instanceof Cloneable);

        //Similary all both will be True for Hashset, LinkedHashSet, Treeset
        //HashMap, LinkedHashMap, HashTable, TreeMap.

        System.out.println(arrayList instanceof RandomAccess); //True
        System.out.println(vector instanceof RandomAccess);  //False
        System.out.println(linkedList instanceof RandomAccess); //True


    }
}
