package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumer {
    //Biconsumer to print the student name and student activities
    BiConsumer<String, List<String>> biConsumerStudent= (studentName ,activities )-> System.out.println(studentName+" , "+activities);

//Predicate for some conditional check - > it takes one parameter as input and perform boolean operation
    Predicate<Student> p1=(s) -> s.getGradeLevel()>=3;
    Predicate<Student> p2=(s) -> s.getGpa()>=3.9;

    //BiPredicate -> It takes  2 parameter as input and perform boolean operations

    BiPredicate<Integer,Double> biPredicate=(gradeLevel,gpa) -> gradeLevel>=3  && gpa >=3.9;

    //consumer to accept the student with Predicate
    Consumer<Student> consumer=student -> {
        if(p1.and(p2).test(student)){
            biConsumerStudent.accept(student.getName(),student.getActivities());
        }
    };

    //consumer to accept the student with Bipredicate
    Consumer<Student> consumer1=student -> {
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            biConsumerStudent.accept(student.getName(),student.getActivities());
        }
    };


    public static void main(String[] args) {
        List<Student> students= StudentDataBase.getAllStudents();
    new PredicateAndConsumer().printStudentNameAndActivities(students);
    }

    private void printStudentNameAndActivities( List<Student> students) {
        System.out.println("predicate example");
        students.forEach(consumer);
        System.out.println("BiPredicate example");
        students.forEach(consumer1);
    }
}
