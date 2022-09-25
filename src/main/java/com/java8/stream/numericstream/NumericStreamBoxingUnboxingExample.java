package com.java8.stream.numericstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

    // converting primitive to Wrapper class
    public static List<Integer> boxing(){

        return IntStream.rangeClosed(1,10).boxed().collect(Collectors.toList());
    }

    //Converting Wrapper class to primitive
    public  static int[] unBoxing(List<Integer> list){
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
    public static int unBoxingAggregate(List<Integer> list) {
        return list.stream().mapToInt(Integer::intValue).sum();
    }
    public static void main(String[] args) {

        System.out.println("Boxed : "+boxing());
        List<Integer> list=boxing();
        System.out.println("Unboxing : "+ Arrays.toString(unBoxing(list)));
        System.out.println("Unboxing sum is : "+ unBoxingAggregate(list));
    }


}
