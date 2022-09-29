package com.java8.interfacemethods;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {
    public static void main(String[] args) {
        Multplier mul = new MultiplierImpl();
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        System.out.println("Multiplied value : " + mul.multiply(list));

        System.out.println("Size : " + mul.size(list));
        System.out.println("Isempty : " + Multplier.isEmpty(list));
    }
}
