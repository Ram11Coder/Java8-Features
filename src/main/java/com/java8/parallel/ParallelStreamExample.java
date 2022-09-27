package com.java8.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * How Parallel Stream works ?
 * • Parallel Stream uses the Fork/Join framework that got
 * introduced in Java 7.
 * How many Threads are created ?
 * • Number of threads created == number of processors available in the
 * machine.
 */
public class ParallelStreamExample {


    public static long performanceTest(Supplier<Integer> supplier, int noOfRecords) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < noOfRecords; i++) {
            supplier.get();
        }
        return System.currentTimeMillis() - start;
    }

    //This is looks like supplier functional interface, so using get() to invoke this method
    public static int sequential() {
        return IntStream.rangeClosed(1, 100000).sum();
    }

    public static int parallel() {
        return IntStream.rangeClosed(1, 100000)
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
       /* System.out.println("sequential : " + sequential());
        System.out.println("parallel : " + parallel());*/
        System.out.println("No of processors : "+ Runtime.getRuntime().availableProcessors());
        System.out.println("sequencial time taken : " + performanceTest(ParallelStreamExample::sequential, 100));
        System.out.println("paralle time taken : " + performanceTest(ParallelStreamExample::parallel, 100));


    }
}
