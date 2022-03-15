package com.Java8.FunctionalInterfaces;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

//Using Consumer with Predicate & Function both at a time.
//Predicate  -> for getting marks > 60.
//Function -> For getting grades.
//Consumer -> to take Student object & just print all student information.

class Student2 {
    String studentName;
    int studentMarks;

    Student2(String studentName, int studentMarks) {
        this.studentName = studentName;
        this.studentMarks = studentMarks;
    }

}

public class ConsumerDemo2 {
    public static void main(String[] args) {

        //creating Function interface logic
        Function<Student2, String> function = s -> (s.studentMarks >= 80) ? "A[Distinction]" :
                (s.studentMarks >= 60) ? "B[First Class]" :
                        (s.studentMarks >= 50) ? "C[Second Class]" :
                                (s.studentMarks >= 35) ? "D[Third Class]" :
                                        "E[Failed]";

        // 1) creating Predicate interface logic for marks > 60
        Predicate<Student2> predicate = s -> s.studentMarks > 60;

        // 2) creating custom array of Student Objects that will contain student object
        Student2[] students = {new Student2("Durga", 100),
                new Student2("Steve", 65),
                new Student2("Clarke", 55),
                new Student2("Bruce", 45),
                new Student2("Diana", 25),
        };

        // 3) creating Consumer interface to simply accept and print Student object
        Consumer<Student2> consumer = s -> {
            System.out.println("Student Name: " + s.studentName);
            System.out.println("Student Marks: " + s.studentMarks);
            System.out.println("Student Grade: " + function.apply(s));
            System.out.println(); // -> for an empty line
        };

        //passing Each student one by one to our Function
        for (Student2 s : students) {
            //predicate logic for printing marks > 60 only
            if (predicate.test(s)) {
                consumer.accept(s);
            }
        }

    }
}


