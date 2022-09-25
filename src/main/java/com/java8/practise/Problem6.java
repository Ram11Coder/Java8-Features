package com.java8.practise;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the maximum value element present in it using Stream functions?
 */
public class Problem6 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,1,12,15,144,16,34,25,22);
        findMax(list);
    }

    private static void findMax(List<Integer> list) {
        System.out.println(list.stream().max(Integer::compare).get());
    }

}
