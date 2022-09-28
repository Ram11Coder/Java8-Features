package com.java8.optional;

import com.java8.data.Bike;
import com.java8.data.Student;

import java.util.Optional;

public class OPtionalMapFlatmapExample {
    /**
     * filter
     */
    public static void filter() {
        Optional<Student> studentOptional = Optional.ofNullable(Student.studentConsumer.get());

        studentOptional.filter(student -> student.getGpa() >= 3.5)
                .ifPresent(student -> System.out.println(student));
    }

    /**
     * map
     */
    public static void map() {
        Optional<Student> studentOptional = Optional.ofNullable(Student.studentConsumer.get());

        if (studentOptional.isPresent()) {
            Optional<String> studentName = studentOptional.filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(studentName.get());
        }
    }


    /**
     * flatmap
     * In  this example added new attribute in Student class
     * Optional
     * flatmap is used to get the optional object from another Optional object
     */
    public static void flatMap() {
        Optional<Student> studentOptional = Optional.ofNullable(Student.getStudent());


        Optional<String> studentName = studentOptional
                .filter(student -> student.getGpa() >= 3.5)//Optional<Student Optional<Bike>>
                .flatMap(Student::getBike)//Optional<Bike>
                .map(Bike::getName);//OPtional<String>
        studentName.ifPresent(s -> System.out.println("Bike name : " + s));
    }

    public static void main(String[] args) {
        filter();//Apply filter on optional object
        map(); // Map values of Optional object
        flatMap();//Map OPtional Object inside Optional Object
    }
}
