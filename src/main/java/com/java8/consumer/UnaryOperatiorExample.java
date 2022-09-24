package com.java8.consumer;

import java.util.function.UnaryOperator;

public class UnaryOperatiorExample {

    public static void main(String[] args) {
        UnaryOperator<String> unary=(s) -> s.concat("default");
        System.out.println(unary.apply("java 8"));
    }
}
