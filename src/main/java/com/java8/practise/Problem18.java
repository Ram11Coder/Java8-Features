package com.java8.practise;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Find the number of occurrence of given word
public class Problem18 {
    public static void main(String[] args) {
        String words = "welcomes to you all and always welcomes you";


        Map<String, Long> map = Stream.of(words.split(" ")).
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(map);

/*Returns a function that always returns its input argument.
       Function<Integer,Integer> fn=   Function.identity();
        System.out.println(fn.apply(12));
        System.out.println(fn.apply(14));
        */
    }
}
