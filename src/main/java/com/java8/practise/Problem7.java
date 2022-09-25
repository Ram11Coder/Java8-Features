package com.java8.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a String, find the first non-repeated character in it using Stream functions?
 */
public class Problem7 {
    public static void main(String[] args) {
        String input = "Java is best programming language";
        findFirstNonRepeatingCharacter(input);
    }

    private static void findFirstNonRepeatingCharacter(String input) {

     Character res=   input.chars()
                .mapToObj(s -> Character.valueOf((char) s))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue()==1L)
        .map(entry -> entry.getKey())
        .findFirst()
        .get();
        System.out.println(res);
    }
}
