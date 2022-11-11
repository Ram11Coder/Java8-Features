package com.java8.practise;

import java.util.Arrays;
import java.util.List;

public class Problem17 {
    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);
        integerList.stream().sorted().forEach(System.out::println);


    }
}
