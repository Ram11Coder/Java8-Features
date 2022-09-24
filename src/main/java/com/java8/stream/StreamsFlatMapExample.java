package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * • flatMap : Converts(Transforms) one type to another as like
 * map() method
 * • Used in the context of Stream where each element in the
 * stream represents multiple elements.
 * Example:
 * • Each Stream element represents multiple elements.
 * • Stream<List>
 * • Steam<Arrays>
 */
public class StreamsFlatMapExample {
    public static List<String> printStudentActivities(){

        return StudentDataBase.getAllStudents().stream()//Stream<Student>
        .map(Student::getActivities)//Stream<List<String>>
        .flatMap(List::stream) //Stream<String>
        .collect(Collectors.toList());
    }

    public static Set<String> setStudentActivities(){

        return StudentDataBase.getAllStudents().stream()//Stream<Student>
                .map(Student::getActivities)//Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        System.out.println(  printStudentActivities());
        System.out.println(setStudentActivities());
    }
}
