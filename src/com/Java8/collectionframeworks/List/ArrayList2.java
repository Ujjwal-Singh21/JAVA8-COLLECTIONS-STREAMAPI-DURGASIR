package com.Java8.collectionframeworks.List;

import java.util.ArrayList;

//Without generics
public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        //adding
        arrayList.add(45);
        arrayList.add("Rohit Sharma");
        arrayList.add(16.5);

        System.out.println("Generic ArrayList: " + arrayList);
    }
}
