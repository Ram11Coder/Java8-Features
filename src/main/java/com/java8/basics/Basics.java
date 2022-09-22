package com.java8.basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * In Imperative approach multi thread environment would give wrong result so need to use threads
 *
 * Declarative Approach will give correct result in multithreaded env as well
 */
public class Basics {
    public static void main(String[] args) {

        calculateSum();
        uniqueList();

    }

    private static void uniqueList() {

        //Removing duplicate values

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10);

        //Imperative
        List<Integer> unique=new ArrayList<>();
        for (Integer integer: list){
            if(!unique.contains(integer))
                unique.add(integer);
        }
        System.out.println("Unique List : "+unique);
        //Declarative
        List<Integer> unique1 = list.stream()
                .distinct().collect(Collectors.toList());

        System.out.println("Unique List : "+unique1);
    }

    private static void calculateSum() {
        //Imperative Approach
        int sum=0;

        for (int i=0;i<=100;i++){
            sum+=i;
        }
        System.out.println("Imperative Approach : "+sum);

        //Declarative Approach

        int result = IntStream.rangeClosed(0, 100).sum();
        System.out.println("Declarative Approach : "+result);



    }
}
