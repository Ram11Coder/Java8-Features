package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamIntro {

    public static void main(String[] args) {

        Predicate<Student> p1=student -> student.getGradeLevel()>2;
        Predicate<Student> p2=student -> student.getGpa()>3.9;
        //Map<String, List<String>> studentList = StudentDataBase.getAllStudents().stream().filter(student -> student.getGradeLevel() > 2).collect(Collectors.toMap(Student::getName, Student::getActivities));
        Map<String, List<String>> studentList = StudentDataBase.getAllStudents().stream().filter(p1).filter(p2).collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentList);
    }

}
