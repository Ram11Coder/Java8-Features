package com.java8.practise;

import java.util.stream.IntStream;

public class Problem19 {
    public static void main(String[] args) {
        // Convert conventional prime number method into java 8
        int n = 6;
        System.out.println(isPrime(n));

        // Jave 8
        System.out.println(IntStream.range(2, n).noneMatch(i -> n % i == 0));
    }

    private static boolean isPrime(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
