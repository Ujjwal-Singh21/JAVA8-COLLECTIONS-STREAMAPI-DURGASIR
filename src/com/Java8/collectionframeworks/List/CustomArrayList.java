package com.Java8.collectionframeworks.List;

import java.util.ArrayList;

// LIST -> ARRAYLIST, ALLOWS DUPLICATES,
// BUT HERE CREATING A CUSTOM ARRAYLIST WHERE DUPLICATES ARE NOT ALLOWED
public class CustomArrayList extends ArrayList {

    //Add method of Parent Class ArrayList.
    //Inherited to the child class CustomArrayList through Inheritance.
    //We are re-defining that inherited method based on our above requirement.
    public boolean add(Object e) {
        if (this.contains(e)) {
            System.out.println("Element " + e + " already available");
            return false;
        } else {
            System.out.println("Element " + e + " added Successfully");
            return super.add(e);
        }
    }

    public static void main(String[] args) {
        CustomArrayList customArrayList = new CustomArrayList();
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(1);
        customArrayList.add(2);
        customArrayList.add("Steve");


        System.out.println(customArrayList);
    }
}
