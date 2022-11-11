package com.java8.practise;

import java.util.StringJoiner;

//Java 8 Program to add prefix and suffix to the String?
public class Problem11 {
    public static void main(String[] args) {

        StringJoiner sj=new StringJoiner(",", "#","#");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);
    }
}
