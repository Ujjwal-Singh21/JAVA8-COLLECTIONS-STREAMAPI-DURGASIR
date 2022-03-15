package com.Java8.FunctionalInterfaces;
import java.util.Date;
import java.util.function.Supplier;

//Supplier -> has a method get()
public class SupplierDemo1 {
    public static void main(String[] args) {

        //supplier that returns -> current date
        Supplier<Date> dateSupplier = () -> new Date();

        //calling supplier
        System.out.println(dateSupplier.get());
    }
}
