package com.java8.stream.numericstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamMapExample {
    private static double mapToDouble() {
        return IntStream.rangeClosed(1,5).//intStream
                mapToDouble(i->i)// intStream to DoubleStram
                  .sum();//double
    }

    private static  long mapToLong() {
    return IntStream.rangeClosed(1,5)//intStream
            .mapToLong(i->i)//intStream to LongStream
            .sum();//long
    }

    private static List<Integer> mapToObj() {
        return IntStream.rangeClosed(1,5)//intStream
                .mapToObj(i -> (i))// Stream<Object>
                .collect(Collectors.toList());//List<Integer>
        //return IntStream.rangeClosed(1,5).mapToObj(i -> {return new Integer(i);}).collect(Collectors.toList());
    }
    public static void main(String[] args) {
        System.out.println("mapToObj : "+mapToObj());
        System.out.println("mapToLong : "+mapToLong());
        System.out.println("mapToDouble : "+mapToDouble());
    }


}
