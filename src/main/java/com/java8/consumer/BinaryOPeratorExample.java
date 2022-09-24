package com.java8.consumer;

import jdk.internal.dynalink.beans.StaticClass;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOPeratorExample {

    static Comparator<Integer> comp=(o1, o2) -> o1.compareTo(o2);
    public static void main(String[] args) {
        BinaryOperator<Integer> binary=(a,b) -> a*b;

        System.out.println(binary.apply(2,3));

        BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comp);
        System.out.println("Max by : "+maxBy.apply(3,4));

        BinaryOperator<Integer> minBy=BinaryOperator.minBy(comp);
        System.out.println("Min by : "+minBy.apply(3,4));
    }
}
