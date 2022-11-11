package com.java8.practise;

import java.util.Random;

//Java 8 Program to Print ten random numbers using forEach?
public class Problem12 {
    public static void main(String[] args) {
        int n=10;
        Random rand=new Random();
        // Below code will run infinitely
        //rand.ints().forEach(System.out::println);

        // Use limit function to produce random numbers
        rand.ints().limit(n).forEach(System.out::println);
    }
}
