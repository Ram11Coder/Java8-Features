package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

public class StreamMapReduceExample {

    //find the sum of noOfBooks of list of Students which gradlevel >2 and gender as female

    public static int getNoOfBooks(){
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGradeLevel()>2)
                .filter(s-> s.getGender().equals("female"))
                .map(Student::getNoOfBooks)
                //.peek(System.out::println)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(getNoOfBooks());
    }
}
