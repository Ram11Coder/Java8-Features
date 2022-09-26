package com.java8.terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toSet;

/**
 * PartitioningBy similar to GroupingBy but it return map key as Boolean
 */
public class StreamPartitioningByExample {
    /**
     * PartitioningBy with one param
     */
    public static void partitioningBy_1() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> result = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate));
        System.out.println(result);
    }

    /**
     * PartitioningBy with two param
     */
    public static void partitioningBy_2() {
        Predicate<Student> predicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> result = StudentDataBase.getAllStudents()
                .stream()
                .collect(partitioningBy(predicate, toSet()));
        System.out.println(result);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        partitioningBy_2();
    }
}
