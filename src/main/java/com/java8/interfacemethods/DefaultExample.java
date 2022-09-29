package com.java8.interfacemethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultExample {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Adam", "Raj", "Ram", "Babu", "zendaya");
        //Prior to java8
        Collections.sort(names);
        System.out.println("Sort  names ascending order : " + names);

        Collections.reverse(names);
        System.out.println("Sort  names reverse order : " + names);

        //Java 8
        System.out.println("\nUsing Java 8");
        names.sort(Comparator.naturalOrder());
        System.out.println("Sort  names ascending order : " + names);
        names.sort(Comparator.reverseOrder());
        System.out.println("Sort  names ascending order : " + names);
    }
}
