package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithCustomSortExample {
public static List<Student> sortByName(){
    System.out.println("Sort by name");
    return StudentDataBase.getAllStudents().stream()
            .sorted(Comparator.comparing(Student::getName))
            .collect(Collectors.toList());
}


    public static List<Student> sortByGpa(){
        System.out.println("Sort by GPA");
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }


    public static List<Student> sortByGpaDesc(){
        System.out.println("Sort by GPA desc");
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {
    sortByName().forEach(System.out::println);
    sortByGpa().forEach(System.out::println);
    sortByGpaDesc().forEach(System.out::println);
       /* System.out.println(sortByName());
        System.out.println(sortByGpa());
        System.out.println(sortByGpaDesc());*/
    }
}
