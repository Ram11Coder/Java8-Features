package com.java8.practise;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * If the key or value is primitive then use Map.Entry.ComparingByKey()
 * If the key or value is object then use Map.Entry.ComparingByKey(comparator)
 */
class Emp {
    private String name;
    private int id;
    private double salary;

    public Emp(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }
}

/**
 * Sort the map based on key and value
 */
public class Problem26 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Ten", 10);
        map.put("Eight", 8);
        map.put("Four", 4);
        map.put("Two", 2);

        //Sort by key
        System.out.println("\nSort by key");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        //Sort by Value
        System.out.println("\nSort by Value");
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).forEach(System.out::println);


        //Map contains key as object
        Map<Emp, Integer> mapObj = new HashMap<>();
        mapObj.put(new Emp("Ram", 32, 100000), 4);
        mapObj.put(new Emp("Raj", 22, 10000), 5);
        mapObj.put(new Emp("Rahul", 42, 300000), 6);
        mapObj.put(new Emp("Ravi", 45, 550000), 7);
        // Sort by emp salary
        System.out.println("\n******Sort the map, key as object ********");
        mapObj.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Emp::getSalary))).forEach(System.out::println);

    }
}
