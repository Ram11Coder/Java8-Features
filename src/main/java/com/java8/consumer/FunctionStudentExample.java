package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {
    static Function<List<Student>, Map<String,Double>> studentFunction = (students) -> {

        Map<String,Double> map=new HashMap<>();
      students.forEach( student -> {
          if(PredicateExample.p1.test(student.getGradeLevel()))
          map.put(student.getName(),student.getGpa());
      });
      return  map;
    };

    public static void main(String[] args) {


        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
