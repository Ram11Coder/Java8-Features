package com.java8.optional;

import com.java8.data.Student;

import java.util.Optional;

public class OptionalPresentExample {
    public static void main(String[] args) {

        //isPresent
        //It will check whether value is present or not in optional
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent());
        //ifPresent
        //It also check value and additional provide consumer method
        // Consumer - doesn't take input but return value
        optional.ifPresent(s -> System.out.println(s));
    }
}
