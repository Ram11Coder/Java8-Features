package com.java8.practise;

//Print current date and time in Java 8 Date and Time API?
public class Problem16 {
    public static void main(String[] args) {

        System.out.println("Current Date: " + java.time.LocalDate.now());
        System.out.println("Current Time: " + java.time.LocalTime.now());
        System.out.println("Current Date and Time: " + java.time.LocalDateTime.now());
    }

}
