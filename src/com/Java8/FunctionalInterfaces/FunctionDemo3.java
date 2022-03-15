package com.Java8.FunctionalInterfaces;

import java.util.function.Function;
import java.util.function.Predicate;

//Printing only those students details whose marks are > 60.
//So we can use Predicate FI for this along with Function FI.
class Student1 {
    String studentName;
    int studentMarks;

    Student1(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

}

public class FunctionDemo3 {
    public static void main(String[] args) {

        //creating Function interface logic
        Function<Student2, String> function = s -> {
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

        //creating Predicate interface logic for marks > 60
        Predicate<Student2> predicate = s -> s.studentMarks > 60;

        //creating custom array of Student Objects that will contain student object
        Student2[] students = {new Student2("Durga", 100),
                new Student2("Steve", 65),
                new Student2("Clarke", 55),
                new Student2("Bruce", 45),
                new Student2("Diana", 25),
        };

        //passing Each student one by one to our Function
        for (Student2 s : students) {

            //adding predicate logic here to get only > 60
            if (predicate.test(s)) {
                System.out.println("Student Name: " + s.studentName);
                System.out.println("Student Marks: " + s.studentMarks);
                System.out.println("Student Grade: " + function.apply(s));
                System.out.println(); // -> for an empty line
            }
        }
    }
}

