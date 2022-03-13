package com.Java8.collectionframeworks.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentRunnerClass {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(9, "Raju"));
        studentList.add(new Student(1, "Shyam"));
        studentList.add(new Student(5, "Steve"));
        studentList.add(new Student(2, "Vicky"));

        Collections.sort(studentList);

        System.out.println(studentList);
    }
}
