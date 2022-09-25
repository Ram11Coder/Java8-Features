package com.java8.stream;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Reduce -> get the stream to reduce the one single input
 */
public class StreamReduceExample {

    public static int printMultiplicationOfList(List<Integer> list){

        return  list.stream() //Stream<Integer>
                .reduce(1,(a,b) -> a*b);// identity 1
        // a-> 1 , b-> 1 result =1
        // a-> 1 , b-> 3 result =3
        // a-> 3 , b-> 5 result =15
        // a-> 15 , b-> 7 result =105

    }

    public static Optional<Integer> printMultiplicationOfListWithoutIdentiy(List<Integer> list){

        return  list.stream() //Stream<Integer>
                .reduce((a,b) -> a*b);

    }


    public static Optional<Student> getHighestStudentGpa(){
        return StudentDataBase.getAllStudents().stream()
                .reduce((s1,s2) -> (s1.getGpa()>s2.getGpa())?s1:s2);
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,3,5,7);
       int mult= printMultiplicationOfList(list);
        System.out.println(mult);

        Optional<Integer> optionalMult = printMultiplicationOfListWithoutIdentiy(list);
    if(optionalMult.isPresent())
        System.out.println(optionalMult.get());

   Optional<Student> students= getHighestStudentGpa();
    if(students.isPresent())
        System.out.println(students.get());
    }
}
