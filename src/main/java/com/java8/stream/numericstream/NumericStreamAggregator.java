package com.java8.stream.numericstream;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregator {
    public static void main(String[] args) {


        OptionalInt min = IntStream.range(1, 50).min();
        System.out.println(min);
        System.out.println("min : " + (min.isPresent()?min.getAsInt():0));
        OptionalInt max = IntStream.range(1, 50).max();

        System.out.println(max);
        System.out.println("max : " + (max.isPresent()?min.getAsInt():0));
        OptionalDouble sum = IntStream.range(1, 50).average();
        System.out.println("Average : "+(sum.isPresent()?sum.getAsDouble():0));

    }
}
