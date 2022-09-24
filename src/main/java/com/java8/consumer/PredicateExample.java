package com.java8.consumer;

import java.util.function.Predicate;

public class PredicateExample {

    static  Predicate<Integer> p1=p ->  p%2==0;
static Predicate<Integer> p2=p-> p%5==0;
    public static void main(String[] args) {
        System.out.println(p1.test(12));
        System.out.println(" And operation :" + p1.and(p2).test(12));
        System.out.println("Or Operation : "+p1.or(p2).test(12));
        System.out.println("Negate operation : "+ p1.or(p2).negate().test(12));
    }

}
