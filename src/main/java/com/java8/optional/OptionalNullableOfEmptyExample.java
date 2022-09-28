package com.java8.optional;

import java.util.Optional;

public class OptionalNullableOfEmptyExample {

    /**
     * If the input is either null or valid input we can use ofNullable method
     *
     * @return optional<T>
     * T -> Type of input, optional return type
     */
    public static Optional<String> ofNullable() {
        Optional<String> input = Optional.ofNullable("Hello");
        return input;
    }

    /**
     * If the input is  valid input we can use of method other throw exception
     *
     * @return optional<T>
     * T -> Type of input, optional return type
     */
    public static Optional<String> of() {
        Optional<String> input = Optional.of("Hello world");// Here expecting valid input
        return input;
    }

    /**
     * you have method that return this in that scenerios we can use
     * optional.empty
     * those scenerios we can have empty in exceptional block
     *
     * @return
     */
    public static Optional<String> optionalEmpty() {
        return Optional.empty();
    }

    public static void main(String[] args) {
        System.out.println("ofNullable() : " + ofNullable());
        System.out.println("of() : " + of());
        System.out.println("optional.Empty() : " + optionalEmpty());
    }

}
