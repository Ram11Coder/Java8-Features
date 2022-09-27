package com.java8.parallel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * part 1 : parallel stream not applicable
 * Parallel stream not perform well in boxing and unboxing elements
 */
public class ParallelStreamExample2 {

    public static void sequential(List<Integer> list) {
        long start = System.currentTimeMillis();

        int sum = list.stream().
                reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("Time taken - " + (end - start));

    }

    public static void parallel(List<Integer> list) {
        long start = System.currentTimeMillis();

        int sum = list.parallelStream().
                reduce(0, (x, y) -> x + y);
        long end = System.currentTimeMillis();
        System.out.println("Time taken - " + (end - start));
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());
        sequential(list);
        parallel(list);
    }
}
