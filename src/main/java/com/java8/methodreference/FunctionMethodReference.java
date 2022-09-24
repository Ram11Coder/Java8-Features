package com.java8.methodreference;

import java.util.function.Function;

public class FunctionMethodReference {
   static Function<String ,String> functionLambda=(a) -> a.toUpperCase();
    static Function<String ,String> functionMethodReference=String::toUpperCase;
    public static void main(String[] args) {
        System.out.println("lamda with out method reference : "+functionLambda.apply("java 8"));
        System.out.println("lamda with method reference : "+functionMethodReference.apply("java 8"));

    }
}
