package com.Java8.ConstructorReference;

//Using Constructor reference -> simple and reusable

class Student {
    int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

interface MyInterface {
    public Student get(int rollNo, String name, int marks);
}

public class ConstructorReference3 {
    public static void main(String[] args) {

        //Constructor reference
        MyInterface myInterface = Student::new;
        Student student = myInterface.get(103, "Steve", 97);

        //printing Student details
        System.out.println("Student RollNo: " + student.rollNo);
        System.out.println("Student Name: " + student.name);
        System.out.println("Student Marks: " + student.marks);
    }
}
