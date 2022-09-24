package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDebug {

    public static void main(String[] args) {


        Map<String, List<String>> map = StudentDataBase.getAllStudents().stream()
                .peek(System.out::println)
                .filter(student -> student.getGradeLevel() > 2)
                .peek(student -> System.out.println("After 1st filter"))
                .filter(student ->student.getGpa()>3.9)
                .peek(student -> System.out.println("After 2nd filter"))
                .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(map);
    }

}
