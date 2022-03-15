package com.Java8.DefaultAndStaticMethods;

//providing static methods name similar to Object class methods name is not allowed
//error -> default method hashCode overrides member of Java.lang.object
interface MyInterface1 {
    void m1();

    default void m2() {
        System.out.println("Default method of Interface");
    }

    //method name similar to Object class method name
//    default int hashCode() {
//        return 10;
//    }
}

public class DefaultDemo2 implements MyInterface1 {
    @Override
    public void m1() {
        System.out.println("m1 method implementation");
    }

    public static void main(String[] args) {
        DefaultDemo2 defaultDemo2 = new DefaultDemo2();
        defaultDemo2.m1();
    }
}
