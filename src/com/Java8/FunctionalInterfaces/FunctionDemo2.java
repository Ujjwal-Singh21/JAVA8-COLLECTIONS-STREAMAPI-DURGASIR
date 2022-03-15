package com.Java8.FunctionalInterfaces;
import java.util.function.Function;

//finding grade of a student by passing its name and marks to Function.
//Printing all students details at the end
class Student {
    String studentName;
    int studentMarks;

    Student(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

}

public class FunctionDemo2 {
    public static void main(String[] args) {

        //creating Function interface logic
        Function<Student, String> function = s -> {
            int marks = s.studentMarks;
            String Grade = " ";

            if (marks >= 80) {
                Grade = "A[Distinction]";
            } else if (marks >= 60) {
                Grade = "B[First Class]";
            } else if (marks >= 50) {
                Grade = "C[Second Class]";
            } else if (marks >= 35) {
                Grade = "D[Third Class]";
            } else {
                Grade = "E[Fail]";
            }

            return Grade;
        };

        //creating custom array of Student Objects that will contain student object
        Student[] students = {new Student("Durga", 100),
                new Student("Steve", 65),
                new Student("Clarke", 55),
                new Student("Bruce", 45),
                new Student("Diana", 25),
        };

        //passing Each student one by one to our Function
        for (Student s : students) {
            System.out.println("Student Name: " + s.studentName);
            System.out.println("Student Marks: " + s.studentMarks);
            System.out.println("Student Grade: " + function.apply(s));
            System.out.println(); // -> for an empty line
        }
    }
}
