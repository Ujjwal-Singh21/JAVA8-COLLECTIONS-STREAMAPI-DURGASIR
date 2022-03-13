package com.Java8.collectionframeworks.Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Laptop {
    private int laptopRam;
    private String laptopName;
    private double laptopPrice;

    Laptop(int laptopRam, String laptopName, double laptopPrice) {
        this.laptopRam = laptopRam;
        this.laptopName = laptopName;
        this.laptopPrice = laptopPrice;
    }

    public int getLaptopRam() {
        return laptopRam;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopRam=" + laptopRam +
                ", laptopName='" + laptopName + '\'' +
                ", laptopPrice=" + laptopPrice +
                '}';
    }

    public static void main(String[] args) {

        List<Laptop> laptopList = new LinkedList<>();

        laptopList.add(new Laptop(8, "Dell", 8500));
        laptopList.add(new Laptop(2, "Asus", 2900));
        laptopList.add(new Laptop(16, "Lenovo", 16000));
        laptopList.add(new Laptop(12, "Hp", 12000));

        //Sorting based on Price
//        Collections.sort(laptopList, new MyPriceComparator());

        //Sorting based on Ram
//        Collections.sort(laptopList, new MyRamComparator());

        //Sorting based on Name
        Collections.sort(laptopList, new MyNameComparator());

        //finally printing
        System.out.println(laptopList);
    }
}
