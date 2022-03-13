package com.Java8.collectionframeworks.Comparator;

import java.util.Comparator;

public class MyNameComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        String laptop1Name = laptop1.getLaptopName();
        String laptop2Name = laptop2.getLaptopName();

        return laptop1Name.compareTo(laptop2Name);
    }
}
