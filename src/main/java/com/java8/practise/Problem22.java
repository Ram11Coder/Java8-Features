package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;
    int age;
    Double salary;

    public Employee(String name, int age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}

/**
 * There is a list of employees and the candidate need to increase the salary of the
 * employees by 10% whose age is greater than 25 years
 */
public class Problem22 {
    public static void main(String[] args) {
        Employee e1=new Employee("Ram",26,40000.0);
        Employee e2=new Employee("Rahul",25,30000.0);
        Employee e3=new Employee("Raja",23,20000.0);
        Employee e4=new Employee("Ramu",27,50000.0);
        Employee e5=new Employee("Ragav",28,60000.0);
        List<Employee > employeeList= Arrays.asList(e1,e2,e3,e4,e5);

       List<Employee> modifiedEmplList= employeeList.stream()
               .filter(e -> e.getAge()>25)
               .map(e -> { e.setSalary( e.salary*1.10); return e;})
               .collect(Collectors.toList());
        System.out.println(modifiedEmplList);
    }
}
