package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *  Given a list of integers, find out all the even numbers exist in the list using Stream functions?
 */
public class Problem1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        checkEvenNumber(list);

    }

    private static void checkEvenNumber(List<Integer> list) {
       List<Integer> evenList =list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(evenList);
//one liner
        System.out.println("One liner");
        list.stream().filter(i->i%2==0).forEach(System.out::println);
    }
}
