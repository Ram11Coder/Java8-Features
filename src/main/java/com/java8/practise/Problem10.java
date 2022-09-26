package com.java8.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of integers, sort all the values present in it in descending order using Stream functions?
 */
public class Problem10 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 1, 12, 23, 15, 144, 34, 16, 34, 25, 22);

        sortDescending(list);
    }

    private static void sortDescending(List<Integer> list) {
        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        Collections.reverse(sortedList);
        System.out.println(sortedList);
    }
}
