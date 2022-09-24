package com.java8.methodreference;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReference {
    //Cosnumer Lambda expression
    static Consumer<Student> consumer=student -> System.out.println(student) ;

    //Cosnumer method reference expression
    // 1. ClassName::MethodName
    static  Consumer<Student> consumer1=System.out::println;

    //2. ClassName :: instanceMethodName

    static  Consumer<Student> consumerActivities=Student::printActivities;

    public static void main(String[] args) {

        System.out.println("Lamda example :");

        StudentDataBase.getAllStudents().forEach(consumer);
        System.out.println("Method reference with methodName example :");

        StudentDataBase.getAllStudents().forEach( consumer1);
        System.out.println("Method reference with instance methodName example :");
        StudentDataBase.getAllStudents().forEach( consumerActivities);
    }
}
