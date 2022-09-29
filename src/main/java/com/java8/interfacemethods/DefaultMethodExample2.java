package com.java8.interfacemethods;

import com.java8.data.Student;
import com.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodExample2 {

    public static Consumer<Student> studentConsumer = student -> System.out.println(student);
    public static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);
    public static Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);
    public static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);


    public static void sortByStudentName(List<Student> studentsList) {
        studentsList.sort(Comparator.comparing(Student::getName));
        studentsList.forEach(studentConsumer);
    }

    public static void sortByStudentGpa(List<Student> studentsList) {
        // studentsList.sort(Comparator.comparing(Student::getGpa));
        studentsList.sort(Comparator.comparingDouble(Student::getGpa));
        studentsList.forEach(studentConsumer);
    }

    //Comparator chaining
    public static void sortByStudentGradeAndGpa(List<Student> studentsList) {
        studentsList.sort(Comparator.comparing(Student::getGradeLevel).thenComparing(Student::getName));
        //use consumer as well
        studentsList.sort(gradeComparator.thenComparing(gpaComparator));
        studentsList.forEach(studentConsumer);
    }


    //null check
    public static void nullAsFirstCheck(List<Student> studentsList) {
        System.out.println("null as a first comparator");
        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentsList.sort(studentComparator);
        studentsList.forEach(studentConsumer);
    }

    public static void main(String[] args) {

        System.out.println("Before Sort...");

        List<Student> studentsList = StudentDataBase.getAllStudents();
        studentsList.forEach(studentConsumer);

/*        System.out.println("SortBy name...");
        sortByStudentName(studentsList);
        System.out.println("SortBy Gpa...");
        sortByStudentGpa(studentsList);
        System.out.println("SortBy GradeLevel and Student name...");
        sortByStudentGradeAndGpa(studentsList);*/
//How to handle if the list have null values ,when do comparator method throw NPE

        nullAsFirstCheck(studentsList);
    }
}
