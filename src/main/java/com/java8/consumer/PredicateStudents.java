package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudents {
    static Predicate<Student> s1=(s) -> s.getGradeLevel()>=3;
    static Predicate<Student> s2=(s) -> s.getGpa()>=3.9;

    public static void main(String[] args) {
        List<Student> list= StudentDataBase.getAllStudents();
        predicateFilterByGrade(list);
        predicateFilterByGpa(list);
        predicateFilterByGradeAndGpa(list);
        predicateFilterByGradeOrGpa(list);
    }

    private static void predicateFilterByGradeAndGpa(List<Student> list) {
        System.out.println(" predicateFilterByGradeAndGpa ");
        list.forEach(student -> {
            if(s1.and(s2).test(student))
                System.out.println(student);
        });
    }

    private static void predicateFilterByGradeOrGpa(List<Student> list) {
        System.out.println("predicateFilterByGradeOrGpa");
        list.forEach(student -> {
            if(s1.or(s2).test(student))
                System.out.println(student);
        });
    }

    private static void predicateFilterByGpa(List<Student> list) {
        System.out.println("predicateFilterByGpa");
        list.forEach(student -> {
            if(s1.test(student))
                System.out.println(student);
        });
    }

    private static void predicateFilterByGrade(List<Student> list) {
        System.out.println("predicateFilterByGrade");
        list.forEach(student -> {
            if(s1.test(student))
                System.out.println(student);
        });
    }

}
