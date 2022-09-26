package com.java8.terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;

import static java.util.stream.Collectors.*;

/**
 * Use of mapping with collect method will reduce the intermediate map method
 */
public class StreamMappingExample {
//we used to do in map to collect to specific data like below
public static void mapData_Past() {

    List<String> studentNameList = StudentDataBase.getAllStudents().stream()
            .map(Student::getName)
            .collect(toList());

    System.out.println(studentNameList);
}

//In the below approach removing intermediate map operation
    public static void mapData() {

        List<String> studentNameList = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toList()));

        System.out.println(studentNameList);

        Set<String> studentNamesSet = StudentDataBase.getAllStudents().stream()
                .collect(mapping(Student::getName, toSet()));
        System.out.println(studentNamesSet);
    }


    public static void main(String[] args) {
        mapData();

    }
}
