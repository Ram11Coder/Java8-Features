package com.java8.interfacemethods;

interface Interface1 {
    //Last prioritty
    default void defaultM1() {
        System.out.println("Inside default method - " + Interface1.class);
    }
}

interface Interface2 extends Interface1 {
    default void defaultM2() {
        System.out.println("Inside default defaultM2()- " + Interface2.class);
    }
//2nd priority
    @Override
    public default void defaultM1() {
        System.out.println("Inside default defaultM1() - " + Interface2.class);
    }
}

interface Interface3 extends Interface2 {
    default void defaultM3() {
        System.out.println("Inside default method - " + Interface3.class);
    }
}

public class InterfaceDefaultMethodCallExample implements Interface1, Interface2, Interface3 {
    /* 1.First Priority
    public void defaultM1() {
        System.out.println("Inside default method - " + Interface3.class);
    }*/

    /**
     * default method call priority
     * 1. Method implement interface have first priority
     * 2. Interface that extending other interface
     * extending interface have priority
     */
    public static void main(String[] args) {
        InterfaceDefaultMethodCallExample example = new InterfaceDefaultMethodCallExample();
        example.defaultM1();

    }
}
