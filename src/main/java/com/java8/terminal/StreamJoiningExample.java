package com.java8.terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import static java.util.stream.Collectors.joining;


/**
 * Join the names of students in the database
 */
public class StreamJoiningExample {

    public static String joining_m1(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining());

    }

    public static String joining_m2(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining(","));

    }


    public static String joining_m3(){
        return StudentDataBase.getAllStudents()
                .stream()
                .map(Student::getName)
                .collect(joining("-","(",")"));

    }


    public static void main(String[] args) {
        System.out.println("Joining 1 "+joining_m1());
        System.out.println("Joining 2 "+joining_m2());
        System.out.println("Joining 3 "+joining_m3());
    }
}
