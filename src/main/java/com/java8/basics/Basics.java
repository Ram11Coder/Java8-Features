package com.java8.basics;

import java.util.stream.IntStream;

/**
 * In Imperative approach multi thread environment would give wrong result so need to use threads
 *
 * Declarative Approach will give correct result in multithreaded env as well
 */
public class Basics {
    public static void main(String[] args) {
        //Imperative Approach
    int sum=0;

    for (int i=0;i<=100;i++){
        sum+=i;
    }
        System.out.println("Imperative Approach : "+sum);

        //Declarative Approach

        int result = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Declarative Approach : "+result);

    }
}
