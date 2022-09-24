package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {
    public static List<Student> studentsFilter(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGender().equals("female"))
                .filter(student -> student.getGpa()>3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        studentsFilter().forEach(System.out::println);
    }
}
