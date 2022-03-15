package com.Java8.DefaultAndStaticMethods;

// 1) Interface can have static methods too.
// 2) But like abstract & default methods they are not available to Implementation Classes
//    automatically.
// 3) It should be Called using interfaceName.methodName either in Implementation Classes or
//    any other normal class.
interface MyInterface2 {
    void m1();

    default void m2() {
        System.out.println("Default method of Interface");
    }

    static void display() {
        System.out.println("Hello It is static method from Interface");
    }
}


public class StaticDemo1 implements MyInterface2 {
    @Override
    public void m1() {
        System.out.println("Normal abstract method overridden in ClassOne");
    }

    public static void main(String[] args) {
        StaticDemo1 staticDemo1 = new StaticDemo1();
        staticDemo1.m1();
        staticDemo1.m2();

        //calling static method from Interface
        //called as -> InterfaceName.methodName
        MyInterface2.display();

        //some wrong ways to call static method from Interface
        // display();
        // staticDemo1.display();
        // StaticDemo1.display();

    }
}
