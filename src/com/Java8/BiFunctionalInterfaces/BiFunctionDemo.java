package com.Java8.BiFunctionalInterfaces;
import java.util.ArrayList;
import java.util.function.BiFunction;

//BiFunction -> Takes 2 arguments and returns a result
// (step - 1)
//-------------
class Employee {

    int eId;
    String eName;

    Employee(int eId, String eName) {
        this.eId = eId;
        this.eName = eName;
    }
}

public class BiFunctionDemo {
    public static void main(String[] args) {

        //Creating a Bi-Function that takes id and name as input
        //And then it returns an Employee object as result
        // (step - 3)
        //------------
        BiFunction<Integer, String, Employee> biFunction = (id, name) -> new Employee(id, name);

        // Creating an ArrayList that stores all returned Employee Objects
        // (step - 2)
        //------------
        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(biFunction.apply(101, "Steve"));
        employeeArrayList.add(biFunction.apply(102, "Bruce"));
        employeeArrayList.add(biFunction.apply(103, "Clarke"));
        employeeArrayList.add(biFunction.apply(104, "Diana"));

        //finally, printing Employee Details
        // (step-4)
        //-----------
        for (Employee e : employeeArrayList) {

            System.out.println("Employee Id: " + e.eId);
            System.out.println("Employee Name: " + e.eName);
            System.out.println(); // -> for a new line gap
        }

    }
}
