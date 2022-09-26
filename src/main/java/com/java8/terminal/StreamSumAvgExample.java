package com.java8.terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamSumAvgExample {
    public static int sum(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoOfBooks));
    }
    public static double average(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoOfBooks));
    }

    public static void main(String[] args) {
        System.out.println("Sum of books : "+sum());
        System.out.println("Average of books : "+average());
    }
}
