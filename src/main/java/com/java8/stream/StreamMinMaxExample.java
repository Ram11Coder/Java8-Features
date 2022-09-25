package com.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Whenever working with min and max better use without default identity or Optional
 *
 */
public class StreamMinMaxExample {

    public  static int findMax(List<Integer> list){
       return list.stream()
                .reduce(0,(a,b) -> (a>b)?a:b);
    }


    public  static Optional<Integer> findMaxOptional(List<Integer> list){
        return list.stream()
                .reduce((a,b) -> (a>b)?a:b);
    }


    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,15,6,8,7);
        List<Integer> list1= new ArrayList<>();

        System.out.println("Valid list : "+findMax(list));
        System.out.println(findMax(list1));
        Optional<Integer> maxOptional = findMaxOptional(list);
        System.out.println("Optional result : "+maxOptional);
        optionalCheck(maxOptional);
        Optional<Integer> maxOptional1 =findMaxOptional(list1);
        System.out.println("Optional result : "+maxOptional1);
        optionalCheck(maxOptional1);

    }

    private static void optionalCheck(Optional<Integer> maxOptional) {
        if(maxOptional.isPresent())
            System.out.println(maxOptional.get());
        else
            System.out.println("Input list is empty");
    }
}
