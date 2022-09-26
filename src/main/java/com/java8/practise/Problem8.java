package com.java8.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a String, find the first repeated character in it using Stream functions?
 */
public class Problem8 {
    public static void main(String[] args) {
        String input="Java is best programming language";

        findFirstRepeatedCharacter(input);
    }

    private static void findFirstRepeatedCharacter(String input) {
    input.chars().mapToObj(c -> Character.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(val -> val.getValue() > 1)
                .map(entry -> entry.getKey())
                .findFirst()
                .ifPresent(System.out::println);
    }
}
