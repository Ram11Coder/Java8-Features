package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIUtilFunctionsExample {


    public static List<String> printActivityUniqueAndSorted(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static Long printActivityUniqueAndSortedCount(){

        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }
    public static void main(String[] args) {
        System.out.println( printActivityUniqueAndSorted());
        System.out.println(printActivityUniqueAndSortedCount());
    }
}
