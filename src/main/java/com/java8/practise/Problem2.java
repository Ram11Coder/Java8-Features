package com.java8.practise;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find out all the numbers starting with 1 using Stream functions?
 */
public class Problem2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,1,12,15,144,16,34,25,22);

        findNumberStartAt1(list);
    }

    private static void findNumberStartAt1(List<Integer> list) {
    list.stream() //Stream<Integer>
            .map(s-> String.valueOf(s))//Stream<String>
            .filter(s -> s.startsWith("1"))//Stream<String>
            .forEach(System.out::println);
    }
}
