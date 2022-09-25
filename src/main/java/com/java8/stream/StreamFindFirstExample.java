package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Optional;

/**
 * findFirst() - works in parallel stream to find the matched first element
 */
public class StreamFindFirstExample {

    public static Optional<Student> findByFirst(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findFirst();
    }

    public static Optional<Student> findAny(){

        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa()>=3.9)
                .findAny();
    }

    public static void main(String[] args) {
Optional<Student> findByFirst=findByFirst();
if(findByFirst.isPresent())
    System.out.println(findByFirst.get());

    Optional<Student> findAny=findAny();
if(findAny.isPresent())
        System.out.println(findAny.get());
}
}
