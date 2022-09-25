package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *Given the list of integers, find the first element of the list using Stream functions?
 */
public class Problem4 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(23,1,12,23,15,144,34,16,34,25,22);

        findFirstElement(list);
    }

    private static void findFirstElement(List<Integer> list) {
       //Approach one
        Optional<Integer> first = list.stream().findFirst();
        if(first.isPresent())
        System.out.println(first.get());
        //One liner
        list.stream().findFirst().ifPresent(System.out::println);
    }
}
