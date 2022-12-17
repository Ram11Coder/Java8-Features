package com.java8.practise;

import java.util.*;
import java.util.stream.Collectors;

/**
 * How to find duplicate elements in a given integers list in java using Stream functions?
 */
public class Problem3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(23, 1, 12, 23, 15, 144, 34, 16, 34, 25, 22);

        findDuplicateElements1(list);
        findDuplicateElements2(list);
    }

    private static void findDuplicateElements2(List<Integer> list) {
        list.stream()
                .filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet()).forEach(System.out::println);
    }

    private static void findDuplicateElements1(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        list.stream()
                .filter(i -> !set.add(i)).forEach(System.out::println);
    }
}
