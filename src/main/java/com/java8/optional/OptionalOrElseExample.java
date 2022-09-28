package com.java8.optional;

import com.java8.data.Student;

import java.util.Optional;

public class OptionalOrElseExample {
    /**
     * orElse -> expecting argument as Optional parameter type
     *
     * @return
     */
    public static String orElse() {
        // Optional<Student> studentOptional = Optional.of(Student.studentConsumer.get());
        Optional<Student> studentOptional = Optional.of(null);

        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    /**
     * orElseGet -> expecting argument as supplier
     *
     * @return
     */
    public static String orElseGet() {
        //  Optional<Student> studentOptional = Optional.of(Student.studentConsumer.get());
        Optional<Student> studentOptional = Optional.of(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    /**
     * orElseThrow -> throws runtime exception if cond not satisfies
     *
     * @return
     */
   /* public static String orElseThrow() {
        // Optional<Student> studentOptional = Optional.of(Student.studentConsumer.get());
        Optional<Student> studentOptional = Optional.of(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No student name found"));
        return name;
    }*/

    public static void main(String[] args) {
        System.out.println("orElse : " + orElse());
        System.out.println("orElseGet :  " + orElseGet());
      //  System.out.println("orElseThrow : " + orElseThrow());
    }
}
