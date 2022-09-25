package com.java8.stream;

import com.java8.data.StudentDataBase;

import java.util.List;

/**
 * anyMatch -> if any one record in the stream matches the cond then return true otherwise false
 * noneMatch -> if none of records in the stream matches the cond then returns true otherwise false
 * allMatch -> if all records in the stream matches the cond then returns true otherwise false
 */
public class StreamMatchExamples {

    public  static boolean anyMatch(){

        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa()>3.5);
    }

    public  static boolean allMatch(){

        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa()>3.5);
    }

    public  static boolean noneMatch(){

        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa()>3.5);
    }

    public static void main(String[] args) {
        System.out.println("anyMatch :"+anyMatch());
        System.out.println("allMatch :"+allMatch());
        System.out.println("noneMatch :"+noneMatch());
    }
}
