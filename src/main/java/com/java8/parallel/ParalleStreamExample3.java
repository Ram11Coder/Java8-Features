package com.java8.parallel;

import java.util.stream.IntStream;

/**
 * part 2 : parallel stream not applicable
 * If u have mutal variable then do not use parallel stream
 * it will result unexpected value
 */
public class ParalleStreamExample3 {

    public static void main(String[] args) {
        Sum sum = new Sum();
// sequential
        IntStream.rangeClosed(1,1000)
                .forEach(sum::performValue);
        System.out.println("sequential sum : "+sum.getTotal());
   //parallel
        Sum sum1 = new Sum();
        IntStream.rangeClosed(1,1000)
                .parallel()
                .forEach(sum1::performValue);
        System.out.println("Parallel sum : "+sum1.getTotal());
    }
}
