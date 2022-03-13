package com.Java8.collectionframeworks.Comparable;

public class Student implements Comparable<Student> {

    private int id;
    private String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // toSting() method for printing
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }


    // Comparable(I) method
    @Override
    public int compareTo(Student student) {
        if (this.id > student.id) {
            return 1;
        } else {
            return -1;
        }
    }

}
