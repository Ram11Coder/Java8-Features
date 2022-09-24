package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        Consumer<String> c1=(s) -> System.out.println(s.toUpperCase());
        c1.accept("Java8");

        printNameAndActivities();
    }

    private static void printNameAndActivities() {
        Consumer<Student> c2= s -> System.out.print(s.getName()) ;
        Consumer<Student> c3= s -> System.out.println(s.getActivities());

        List<Student> students =StudentDataBase.getAllStudents();
        students.forEach(c2.andThen(c3));//consumer chaining


        System.out.println("Students with conditions : ");
        students.forEach((student)-> {
            if(student.getGpa()>3.9 ){
                c2.andThen(c3).accept(student);
            }
        });
    }




}
