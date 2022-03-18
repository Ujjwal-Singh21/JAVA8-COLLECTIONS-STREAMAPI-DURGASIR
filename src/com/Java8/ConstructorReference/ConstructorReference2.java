package com.Java8.ConstructorReference;

//using -> Lambda Expression.
//Its still bit Complex -> For Comparison with ConstructorReference3

class Student2 {
    int rollNo;
    String name;
    int marks;

    Student2(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

interface MyInterface2 {
    public Student2 get(int rollNo, String name, int marks);
}

public class ConstructorReference2 {
    public static void main(String[] args) {

        MyInterface2 myInterface2 =
                (rollNo, name, marks) -> new Student2(rollNo, name, marks);

        Student2 student2 = myInterface2.get(102, "Clarke", 75);

        //printing Student details
        System.out.println("Student RollNo: " + student2.rollNo);
        System.out.println("Student Name: " + student2.name);
        System.out.println("Student Marks: " + student2.marks);
    }
}
