package com.java8.methodreference;

import com.java8.data.Student;

import java.util.function.Predicate;

public class RefractorMethodReferenceExamaple {
//Here we cannot apply method reference directly so we need to refractor it
    static Predicate<Student> p1=(s) ->s.getGradeLevel()>2;

    // refactor th lambda using method

    static Predicate<Student> p2=RefractorMethodReferenceExamaple::greaterThanGradeLevel;
    public static boolean greaterThanGradeLevel(Student s){
        return  s.getGradeLevel()>2;
    }

    public static void main(String[] args) {
        //System.out.println(p1.test(Student.studentConsumer.get()));
        System.out.println(p2.test(Student.studentConsumer.get()));
    }
}
