package com.java8.practise;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

// Find the duplicate  with their count in the list
public class Problem21 {
    public static void main(String[] args) {


        List<String> fruits = Arrays.asList("Apple", "Orange", "Mango", "Banana", "Pineapple", "Muskmelon", "Papaya", "Apple", "CustardApple", "Fig", "Apple", "Orange", "Mango");

        /**
         *  Approach 1
         *  Create a set and pass the value which is repeating more than once collect it into map
         *
         */


// Get the duplicate fruits
        Set<String> uniqueFruits = new HashSet<>();
        Set<String> fruitsList = fruits.stream().filter(e -> !uniqueFruits.add(e)).collect(Collectors.toSet());

         System.out.println(fruitsList);
// Approach 2 : Using Collections.groupingBy()
        Map<String, Long> fruitMap = fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        fruitMap.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(System.out::println);

// Approach 3 : using collection.frequency

        Set<String> names = fruits.stream().filter(name -> Collections.frequency(fruits, name) > 1).collect(Collectors.toSet());
        System.out.println(names);
    }
}
