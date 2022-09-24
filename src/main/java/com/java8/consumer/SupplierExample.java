package com.java8.consumer;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> supplierStudent=()-> new Student("Adam",2,3.6, "male", Arrays.asList("swimming", "basketball","volleyball"));

        System.out.println("Student is : "+supplierStudent.get());


        Supplier<List<Student>> studentsSupplier =() -> StudentDataBase.getAllStudents();
        System.out.println("Students are : "+studentsSupplier.get());
    }
}
