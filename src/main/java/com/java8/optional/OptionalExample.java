package com.java8.optional;

import com.java8.data.Student;

import java.util.Optional;

/**
 * Diff between null and optional?
 *
 */
public class OptionalExample {
    //Usual null check way
    public static String getStudent() {
        Student student = Student.studentConsumer.get();
        if (student != null)
            return student.getName();
        return null;
    }

    //Optional
    public static Optional<String> getStudentOptional() {
        //Optional<Student> student = Optional.ofNullable(Student.studentConsumer.get());
        Optional<Student> student = Optional.ofNullable(null);//Optional.empty
        if (student.isPresent())
            return student.map(Student::getName);//Optional<String>
        return Optional.empty();//Represent Object with no value
    }

    public static void main(String[] args) {
        String name = getStudent();
        if (name != null)
            System.out.println("Student name length is " + name.length());
        Optional<String> optionalStudent = getStudentOptional();
        if (optionalStudent.isPresent())
            System.out.println("Student name length is " + optionalStudent.get().length());
        else
            System.out.println("No student name length found!!");
    }
}
