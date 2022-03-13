package com.Java8.collectionframeworks.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
    int employeeId;
    String employeeName;

    Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<Employee>();

        employeeList.add(new Employee(110, "Bruce"));
        employeeList.add(new Employee(101, "Clarke"));
        employeeList.add(new Employee(120, "Diana"));
        employeeList.add(new Employee(111, "Tony"));

        Collections.sort(employeeList);

        System.out.println(employeeList);

    }


    @Override
    public int compareTo(Employee employee) {
        if (this.employeeId > employee.employeeId) {
            return 1;
        } else {
            return -1;
        }
    }
}
