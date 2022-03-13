package com.Java8.collectionframeworks.Map;
// 1) WeakHashMap is an implementation of the Map interface that stores only weak
//    references to its keys.

// 2) Storing only weak references allows a key-value pair to be garbage-collected
//    when its key is no longer referenced outside of the WeakHashMap.
//--------------------------------------------------------------------------------------------
// 1) A WeakHashMap has key-value pairs i.e. it is quite similar to a HashMap in Java.

// 2) A difference is that the WeakHashMap object that is specified as a key is still
//   eligible for garbage collection.

// 3) This means that the garbage collector has dominance over the WeakHashMap.

// 4) Whereas, with just HashMap -> HashMap has dominance over the garbage collector.
import java.util.WeakHashMap;

class Temp {
    @Override
    public String toString() {

        return "temp";
    }

    @Override
    public void finalize() {
        System.out.println("Finalize method called");
    }
}

public class WeakHashMapDemo {
    public static void main(String[] args) throws Exception {

        //Scenario - One :-
        //--------------------

//        //first with HashMap -> HashMap dominates over GC here.
//        HashMap hashMap = new HashMap();
//
//        //creating Temp object which will return "temp" string from toString()
//        //now t reference holds that String value being returned from toString()
//        Temp t = new Temp();
//
//        //adding
//        hashMap.put(t, "Akshay");
//        System.out.println("Initial HashMap: " + hashMap);
//
//        //Assigning temp = null then calling Garbage collector
//        t = null;
//        System.gc();
//
//        //making main thread sleep for 5 seconds
//        Thread.sleep(5000);
//
//        //finally, printing again
//        System.out.println("Final HashMap: " + hashMap);

        //output
        //Initial WeakHashMap: {temp=Akshay}
        //Final WeakHashMap: {temp=Akshay}
//
//
// ------------------------------------------------------------------------------

        //Scenario - Two :-
        //--------------------

        //Second with WeakHashMap -> Gc dominates over WeakHashMap here.
        WeakHashMap weakHashMap = new WeakHashMap();

        //creating Temp object which will return "temp" string from toString()
        //now t reference holds that String value being returned from toString()
        Temp t = new Temp();

        //adding
        weakHashMap.put(t, "Akshay");
        System.out.println("Initial WeakHashMap: " + weakHashMap);

        //Assigning temp = null then calling Garbage collector
        t = null;
        System.gc();

        //making main thread sleep for 5 seconds
        Thread.sleep(5000);

        //finally, printing again
        System.out.println("Final WeakHashMap: " + weakHashMap);

        //output
        //Initial WeakHashMap: {temp=Akshay}
        //Finalize method called
        //Final WeakHashMap: {}
    }
}
