package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biconsumer =(a,b) -> {
            System.out.println("a  : "+a +" b : "+b);
        };
        biconsumer.accept(3,4);

        BiConsumer<Integer , Integer> multiply=(a,b) -> System.out.println("multiply : "+a*b);

        BiConsumer<Integer , Integer> division=(a,b) -> System.out.println("division : "+a/b);
multiply.accept(2,3);
division.accept(4,2);
multiply.andThen(division).accept(14,2);


// use student class with biconsumer interface

    BiConsumer<String, List<String>> biConsumerStudent=(stud, list) -> System.out.println(stud+" , "+list );

    List<Student> students= StudentDataBase.getAllStudents();
    students.forEach(s -> biConsumerStudent.accept( s.getName(), s.getActivities()));
    }
}
