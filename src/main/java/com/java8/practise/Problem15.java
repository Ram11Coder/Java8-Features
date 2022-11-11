package com.java8.practise;

import java.util.Arrays;
import java.util.List;

//Java 8 program to remove the duplicate elements from the list?
public class Problem15 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 1, 3, 2);
//Approach 1
       // list.stream().collect(Collectors.toSet()).forEach(System.out::print);
// Approach 2
        list.stream().distinct().forEach(System.out::print);

    }
}
