package com.java8.interfacemethods;

interface If1 {
    default void method1() {
        System.out.println("Inside the method1 : " + If1.class);
    }
}

interface If2 {
    default void method1() {
        System.out.println("Inside the method1 : " + If2.class);

    }
}

/**
 * If both inteface class have same default method then only way to
 * resolve the issues is implementing class need to override the method
 */

public class MultipleInheritanceIssue implements If1, If2 {
    @Override
    public void method1() {
        System.out.println("Inside method 1 - " + MultipleInheritanceIssue.class);
    }

    public static void main(String[] args) {
        MultipleInheritanceIssue mis = new MultipleInheritanceIssue();
        mis.method1();
    }
}
