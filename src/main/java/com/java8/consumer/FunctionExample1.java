package com.java8.consumer;

public class FunctionExample1 {
    public static  String append(String str){


        return FunctionalExample.function.apply(str);
    }
    public static void main(String[] args) {
        System.out.println(append("java 8"));//it will capitalise the input
    }
}
