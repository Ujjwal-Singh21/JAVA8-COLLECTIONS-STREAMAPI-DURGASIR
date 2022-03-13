package com.Java8.collectionframeworks.Map;

import java.util.HashMap;

class Test {
    int i;

    Test(int i) {
        this.i = i;
    }

    @Override
    public int hashCode() {
        return i;
    }

    @Override
    public String toString() {
        return i + " ";
    }
}

public class HashMapDemo2 {
    public static void main(String[] args) {

        HashMap hashMap = new HashMap<>();

        //adding
        hashMap.put(new Test(11), " Steve");
        hashMap.put(new Test(21), " Diana");
        hashMap.put(new Test(15), " Bruce");
        hashMap.put(new Test(7), " Clarke");
        hashMap.put(new Test(33), " Stark");
        hashMap.put(new Test(45), " Rohit");

        System.out.println(hashMap);
    }
}
