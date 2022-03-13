package com.Java8.collectionframeworks.Comparator;

import java.util.Comparator;

public class MyRamComparator implements Comparator<Laptop> {

    @Override
    public int compare(Laptop laptop1, Laptop laptop2) {
        if (laptop1.getLaptopRam() < laptop2.getLaptopRam()) {
            return -1;
        } else if (laptop1.getLaptopRam() > laptop2.getLaptopRam()) {
            return 1;
        } else {
            return 0;
        }
    }
}
