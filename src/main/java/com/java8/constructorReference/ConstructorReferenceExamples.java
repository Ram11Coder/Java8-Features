package com.java8.constructorReference;

import com.java8.data.Student;

import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferenceExamples {

    //Below code is not valid
   // Student s=Student::new;


    // Constructor Reference only applicable for functional interface
    static Supplier<Student> studentSupplier=Student::new;

// If u want to create constructor with new keyword then equivalent constructor method in target class


  static   Function<String, Student> functionStudent= Student::new;
    public static void main(String[] args) {
        System.out.println(studentSupplier.get());

        System.out.println(functionStudent.apply("Ram"));
    }
}
