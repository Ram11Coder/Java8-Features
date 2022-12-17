package com.java8.practise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Find the second min and max element in the given list
 */
public class Problem25 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 23, 45, 67, 89, 1, 2, 123, 321, 333, 333);
        //Second min
        int min = list.stream().sorted().distinct().limit(2).skip(1).findFirst().get();
        System.out.println(min);
        //Second max
        int max = list.stream().sorted(Collections.reverseOrder()).distinct().limit(2).skip(1).findFirst().get();
        System.out.println(max);
    }
}
