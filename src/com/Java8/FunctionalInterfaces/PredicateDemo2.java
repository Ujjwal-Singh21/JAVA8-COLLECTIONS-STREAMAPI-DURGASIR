package com.Java8.FunctionalInterfaces;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {
    String employeeName;
    int employeeSalary;

    public Employee(String employeeName, int employeeSalary) {
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
}

public class PredicateDemo2 {
    public static void main(String[] args) {

        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        employeeArrayList.add(new Employee("Durga", 1000));
        employeeArrayList.add(new Employee("Ravi", 2000));
        employeeArrayList.add(new Employee("Shiva", 3000));
        employeeArrayList.add(new Employee("Mahesh", 4000));
        employeeArrayList.add(new Employee("Adarsh", 5000));
        employeeArrayList.add(new Employee("Sagar", 6000));

        //printing only those employees whose salary > 3000
        Predicate<Employee> predicate = e -> e.employeeSalary > 3000;

        for (Employee e : employeeArrayList) {

            if (predicate.test(e)) {
                System.out.println(e);
            }
        }

    }
}
