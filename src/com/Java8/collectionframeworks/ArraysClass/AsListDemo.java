package com.Java8.collectionframeworks.ArraysClass;
import java.util.Arrays;
import java.util.List;

//creating a List reference for an existing Array.
//updates performed from list reference and from array reference will get reflected respectively.
//we should not perform addition, deletion operations using List reference because array size is
//fixed, if we try to do, we will get UnsupportedOperation exception.
//Similarly, we should not add heterogeneous objects using List reference, because array supports
// only homogeneous, if we try we will get ArrayStoreException.
public class AsListDemo {
    public static void main(String[] args) {

        //creating an array
        String[] stringArray = {"A", "Z", "B"};

        //converting/creating a new list reference to the existing array
        List stringArrayList = Arrays.asList(stringArray);
        System.out.println("Initial Print: " + stringArrayList);

        //updating using array reference
        stringArray[0] = "K";
        System.out.println(stringArrayList);

        //updating using List reference
       stringArrayList.set(1, "L");
       for(String s : stringArray){
           System.out.print(s + " ");
       }

       //performing these contradictions operations will result in Exceptions
        // adding/removing and trying to increase array size which is fixed and static
        //if tried we get -> UnsupportedOperationException
//        stringArrayList.add("Durga");
//        stringArrayList.remove(2);

        //trying to add heterogeneous to Array, which supports only homogeneous
        // if tried we get -> ArrayStoreException
//        stringArrayList.set(1, new Integer(10));



    }
}
