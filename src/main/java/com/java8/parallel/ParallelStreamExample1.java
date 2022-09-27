package com.java8.parallel;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {
    public static void sequential() {
        long start = System.currentTimeMillis();

        StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println("Time taken - " + (end - start));
    }

    public static void parallel() {
        long start = System.currentTimeMillis();

        StudentDataBase.getAllStudents()
                .stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();

        System.out.println("Time taken - " + (end - start));
    }

    public static void main(String[] args) {
        sequential();
        parallel();
    }

}
