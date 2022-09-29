package com.java8.interfacemethods;

import java.util.List;

public interface Multplier {
    int multiply(List<Integer> list);

    default int size(List<Integer> list) {
        System.out.println("Inside Multiplier default method");
        return list.size();
    }

    public static boolean isEmpty(List<Integer> list) {
        return (list != null && list.size() > 0);
    }
}
