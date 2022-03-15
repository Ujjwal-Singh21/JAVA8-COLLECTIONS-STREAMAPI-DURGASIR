package com.Java8.DefaultAndStaticMethods;

// 1) default methods dummy implementation is already given in Interface.
// 2) It is not mandatory to override default methods like abstract methods.
// 3) Only Override default methods from interface and use it only if required.
// 4) Can override and use it or provide your own implementation and use as u needed.
// 5) If not needed, then no need to override, just ignore it.

interface MyInterface {
    void m1();

    default void m2() {
        System.out.println("Default method of Interface");
    }
}

class ClassOne implements MyInterface {

    @Override
    public void m1() {
        System.out.println("Normal abstract method overridden in ClassOne");
    }

    //overriding default method is optional
    //can use now also without overriding because already available through Inheritance
}

class ClassTwo implements MyInterface {

    @Override
    public void m1() {
        System.out.println("Normal abstract method overridden in ClassTwo");
    }

    //overriding default method also and providing our own implementation to it.
    public void m2() {
        System.out.println("Overridden default method in ClassTwo");
    }
}

public class DefaultDemo1 {
    public static void main(String[] args) {

        ClassOne classOne = new ClassOne();
        //accessing override abstract method
        classOne.m1();
        //accessing default method without overriding
        classOne.m2();

        ClassTwo classTwo = new ClassTwo();
        //accessing override abstract method & default method
        classTwo.m1();
        classTwo.m2();
    }
}
