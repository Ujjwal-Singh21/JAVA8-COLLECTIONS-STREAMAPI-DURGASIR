package com.Java8.ConstructorReference;

//Without -> Lambda and Constructor reference.
//using -> separate implementation class.
//Its too Complex -> For Comparison with ConstructorReference3

class Student1 {
    int rollNo;
    String name;
    int marks;

    Student1(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
}

interface MyInterface1 {
    public Student2 get(int rollNo, String name, int marks);
}

//separate implementation class
class Demo implements MyInterface1 {

    @Override
    public Student2 get(int rollNo, String name, int marks) {
        Student2 student1 = new Student2(rollNo, name, marks);
        return student1;
    }
}

public class ConstructorReference1 {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Student2 student1 = demo.get(101, "Bruce", 88);

        //printing Student details
        System.out.println("Student RollNo: " + student1.rollNo);
        System.out.println("Student Name: " + student1.name);
        System.out.println("Student Marks: " + student1.marks);

    }
}
