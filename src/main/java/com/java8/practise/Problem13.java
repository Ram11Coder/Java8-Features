package com.java8.practise;

import java.util.Comparator;
import java.util.stream.Stream;

//Java 8 program to find the Minimum number of a Stream?
public class Problem13 {
    public static void main(String[] args) {

        int min = Stream.of(1, 2, 3, 4, 5, 6, 7, 8).min(Comparator.comparing(Integer::valueOf)).get();
        System.out.println("Minimum value is : " + min);
    }
}
