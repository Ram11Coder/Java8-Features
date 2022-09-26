package com.java8.terminal;

import com.java8.data.StudentDataBase;

import static java.util.stream.Collectors.counting;

/**
 * Count the no of students with some filter condition
 *
 * Need to explore diff bw count() and Collectors.counting()
 */
public class StreamCountingExample {

    private static long countingStudents() {
return StudentDataBase.getAllStudents().stream()
        .filter(student -> student.getGpa()>=3.9)
        .collect(counting());
    }


    public static void main(String[] args) {
        System.out.println("Count : "+countingStudents());
    }


}
