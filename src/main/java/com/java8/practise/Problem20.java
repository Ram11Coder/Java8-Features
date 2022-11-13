package com.java8.practise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// First n prime number of square root
public class Problem20 {
    public static void main(String[] args) {
//
        List<Double> primeSquares= Stream.iterate(1,i->i+1)
                .filter(Problem20::isPrime)
                .map(Math::sqrt)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(primeSquares);
    }
    public static boolean isPrime(int n){
       return n>1 && IntStream.range(2, n).noneMatch(i -> n % i == 0);
    }
}
