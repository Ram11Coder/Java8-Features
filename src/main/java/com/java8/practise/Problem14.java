package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Java 8 program to perform concatenation on two Streams?
public class Problem14 {
    public static void main(String[] args) {
        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        List<Integer> list2= Arrays.asList(6,7,8);
        Stream<Integer> integerStream = Stream.concat(list1.stream(), list2.stream());
        integerStream.forEach(System.out::print);
    }
}
