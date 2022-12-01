package com.java8.practise;

import java.util.*;
import java.util.stream.Collectors;

class Employees{
    String name;
    String dept;
    int salary;
    String gender;
    int age;

    public Employees(String name, String dept, int salary, String gender, int age) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        this.gender = gender;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
public class Problem23 {
    public static void main(String[] args) {
        Employees e1=new Employees("Ram","IT",40000,"male",25);
        Employees e2=new Employees("Rahul","CS",30000,"female",24);
        Employees e3=new Employees("Raja","IT",20000,"male",24);
        Employees e4=new Employees("Ramu","CS",50000,"female",29);
        Employees e5=new Employees("Ragav","CS",60000,"male",21);
        List<Employees> employeeList= Arrays.asList(e1,e2,e3,e4,e5);

        //Find the highest employee of each department
        Map<String,Employees> byDept= employeeList.stream()
                         .collect(Collectors.groupingBy(e -> e.getDept(),Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(e -> e.getSalary())), Optional::get)));

        System.out.println(byDept);

        //Find the count of employee for each department
        Map<String, Long> empCount = employeeList.stream()
                .collect(Collectors.groupingBy(Employees::getDept, Collectors.counting()));
        System.out.println(empCount);

        //Find the average age of gender in employees
        Map<String, Double> empAvg =   employeeList.stream()
                .collect(Collectors.groupingBy(Employees::getGender,Collectors.averagingDouble(Employees::getAge)));
        System.out.println(empAvg);

    }
}
