package com.Java8.BiFunctionalInterfaces;
import java.util.ArrayList;
import java.util.function.BiConsumer;

//BiConsumer -> Takes 2 arguments and consume it, returns nothing.
//Here we created a BiConsumer that takes 2 args, Employee Object and a double value.
//Using that double value it will simply increase all Employees salary.
// (step - 1)
//-------------
class Employee1 {
    String eName;
    double eSalary;

    Employee1(String eName, double eSalary) {
        this.eName = eName;
        this.eSalary = eSalary;
    }
}

public class BiConsumerDemo {
    public static void main(String[] args) {

        //creating an Employee ArrayList and adding few Employees to it using populate method
        // (step - 2)
        //------------
        ArrayList<Employee1> employeeArrayList = new ArrayList<>();
        populate(employeeArrayList);

        //creating a BiConsumer
        // (step - 4)
        //------------
        BiConsumer<Employee1, Double> biConsumer = (e, d) -> e.eSalary = e.eSalary + d;

        //now, we have few Employees in our ArrayList, we pass each employee 1 by 1 to biConsumer.
        //invoking BiConsumer and passing Employee object as 1st arg & a double value as 2nd arg.
        //it increases all Employee salary by 500 rs
        //so now, employeeArrayList is updated
        // (step - 5)
        //------------
        for (Employee1 e : employeeArrayList) {
            biConsumer.accept(e, 500.0);
        }

        //Since now, employeeArrayList is updated,
        //finally, printing Employees with updated salaries.
        // (step - 6)
        //------------
        for (Employee1 e : employeeArrayList) {
            System.out.println("Employee Name: " + e.eName);
            System.out.println("Employee Salary: " + e.eSalary);
            System.out.println(); // -> for 1 line gap
        }
    }

    //defining static populate method
    // (step - 3)
    //------------
    public static void populate(ArrayList<Employee1> employeeArrayList) {
        employeeArrayList.add(new Employee1("Steve", 1000));
        employeeArrayList.add(new Employee1("Bruce", 2000));
        employeeArrayList.add(new Employee1("Clarke", 3000));
        employeeArrayList.add(new Employee1("Diana", 4000));
    }
}
