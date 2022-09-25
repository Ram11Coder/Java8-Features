package com.java8.stream.numericstream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * intStream
 * LongStream
 * DoubleStream
 * <p>
 * methods:
 * <p>
 * range() -> exclude the last value
 * rangeClosed() -> There is no exclusion concept
 */

public class NumericStreamRangeExample {
    public static void main(String[] args) {

        System.out.println("Instream example");
        IntStream intStream = IntStream.range(1, 50);
        System.out.println("intStream Range() count : " + intStream.count());
        IntStream.range(1, 50).forEach(vlaue -> System.out.print(vlaue + ","));
        System.out.println();
        System.out.println("intStream RangeClosed() count : " + IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Longstream example");
        System.out.println("LongStream range() count " + LongStream.range(1, 50).count());
        LongStream.range(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("LongStream rangeclosed() count " + LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
        //There is no direct method for range in DoubleStream
        System.out.println();
        System.out.println("DoubleStream example");
        System.out.println("Double Stream rang() count : " + IntStream.range(1, 50).asDoubleStream().count());
        System.out.println();
        IntStream.range(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Double Stream range Closed()count : " + IntStream.rangeClosed(1, 50).asDoubleStream().count());
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(value -> System.out.print(value + ","));
        System.out.println();
    }
}
