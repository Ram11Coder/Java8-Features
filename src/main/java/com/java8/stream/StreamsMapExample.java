package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;
//map -> converts one type into another
public class StreamsMapExample {
    //Get the list of student names from student list
    public static List<String> studentNamesList(){

        List<String> studentNames= StudentDataBase.getAllStudents().stream() //Stream<Student>
        .map(Student::getName) //Stream<String>
        .map(String::toUpperCase)//Stream<String> apply Uppercase for each stream of string
        .collect(toList());// List<String>
        return studentNames;
    }


    public static Set<String> nameSet(){

        Set<String> studentNames= StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase)//Stream<String> apply Uppercase for each stream of string
                .collect(toSet());// List<String>
        return studentNames;
    }



    public static void main(String[] args) {
        System.out.println(studentNamesList());
        System.out.println(nameSet());
    }
}
