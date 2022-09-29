package com.java8.interfacemethods;

import java.util.List;

public class MultiplierImpl implements Multplier {
    @Override
    public int multiply(List<Integer> list) {
        return list.stream().reduce(1, (a, b) -> a * b);
    }

    @Override
    public int size(List<Integer> list) {
        System.out.println("Inside MultiplierImpl method");
        return (list != null) ? list.size() : 0;
    }
}
