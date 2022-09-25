package com.java8.practise;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, find the total number of elements present in the list using Stream functions?
 */
public class Problem5 {
    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(23,1,12,23,15,144,34,16,34,25,22);

        findCount(list);
    }

    private static void findCount(List<Integer> list) {
        System.out.println(list.stream().count());
    }
}
