package com.java8.practise;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, sort all the values present in it using Stream functions?
 */
public class Problem9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,1,12,23,15,144,34,16,34,25,22);

        sortList(list);
    }

    private static void sortList(List<Integer> list) {
        list.stream().sorted().forEach(System.out::println);
    }
}
