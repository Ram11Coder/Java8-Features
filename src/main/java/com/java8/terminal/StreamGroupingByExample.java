package com.java8.terminal;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

/**
 * GroupingBy():
 * groupingBy is work similar as SQL GroupBy
 * <p>
 * it returns Map as output
 * <p>
 * It has 3 different parameter variation
 * <p>
 * minBy()
 * maxBy()
 * collectingAndThen()
 */
public class StreamGroupingByExample {
    /**
     * GroupBy based on gender
     * key as male/female
     * value as List of Students
     */
    public static void studentGroupByGpa() {
        Map<String, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGender));//It will groupby based on gender
        System.out.println(map);
    }

    /**
     * Groupby based on GPA level
     * if GPA is greater than 3.8 then key as OUTSTANDING
     * if GPA is lesser than 3.8 then key as AVERAGE
     */
    public static void customizedstudentGroupBy() {
        Map<String, List<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(map);
    }

    /**
     * Groupby based on gradelevel and also gpa level
     * if GPA is greater than 3.8 then key as OUTSTANDING
     * if GPA is lesser than 3.8 then key as AVERAGE
     */

    public static void secondLevelGroup_1() {
        Map<Integer, Map<String, List<Student>>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(map);
    }

    /**
     * Groupby based on name(many student have same name so groupby naming ) and also noOfBooks
     * <p>
     * example
     * Studentnames and their books
     */
    public static void secondLevelGroup_2() {
        Map<String, Integer> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, summingInt(Student::getNoOfBooks)));
        System.out.println(map);
    }


    /**
     * 1st parameter -> Key
     * 2nd Parameter -> output (what kind of collection going to return)
     * 3rd parameter -> value for the output
     */
    private static void thirdLevelGroup_1() {
        LinkedHashMap<String, Set<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(map);
    }


    /**
     * Going to calculate least gpa student for each grade
     * return value as Optional
     */
    private static void minByExample() {

        Map<Integer, Optional<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));

        System.out.println(map);
    }

    /**
     * Going to calculate top gpa student for each grade
     * return value as Optional
     */
    private static void maxByExample() {

        Map<Integer, Optional<Student>> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(map);

    }


    /**
     *
     * collectAndThen -> will provide the result if the value is available
     * Going to calculate top gpa student for each grade and
     * least gpa student for each grade
     * using collectAndThen
     * It will give result not optional
     */
    private static void collectAndThenExample() {
        Map<Integer, Student> map = StudentDataBase.getAllStudents()
                .stream()
                .collect(groupingBy(Student::getGradeLevel,
                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(map);

    }


    public static void main(String[] args) {

        //1st Level of grouping
        //  studentGroupByGpa();
        // customizedstudentGroupBy();
        //2nd Level of Grouping
        //  secondLevelGroup_1();
        // secondLevelGroup_2();

        //3rd level of Grouping

        // thirdLevelGroup_1();

        //minBy()
        minByExample();
        //maxBy()
        maxByExample();
        //collectingAndThen()
        collectAndThenExample();
    }


}
