package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student> , Predicate<Student>, Map<String,Double>> biFunction=
        (studentList,studentPredicate) -> {
        Map<String,Double> map=new HashMap<>();
        studentList.forEach( student -> {
            if(studentPredicate.test(student)) {
map.put(student.getName(),student.getGpa());
            } });
        return map;
        };
    public static void main(String[] args) {

        System.out.println(  biFunction.apply(StudentDataBase.getAllStudents(),new PredicateAndConsumer().p1));
    }
}
