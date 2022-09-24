package com.java8.consumer;

import java.util.function.Function;

public class FunctionalExample {

    static  Function<String,String> function=(s) -> s.toUpperCase();

    static  Function<String,String> addSomeString=(s) -> s.concat("default");
    public static void main(String[] args) {
        System.out.println(  function.apply("java 8"));

        System.out.println(  function.andThen(addSomeString).apply("java 8"));
        //compose apply java 8 with concat default and apply function (function interface)
        System.out.println(  function.compose(addSomeString).apply("java 8"));
    }
}
