package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeStreamExample {

    static List<Employee> getEmployees() {
        List<Employee> employees = Arrays.asList(
                new Employee("Raj", 12000.00),
                new Employee("shekar", 50000.00),
                new Employee("span", 25000.00),
                new Employee("priya", 33000.00)
        );
        return employees;
    }

    public static void main(String[] args) {

        double threshold = 20000.00;
        List<Employee> employees = getEmployees();
        List<Employee> salariesAboveThreshold = employees.stream()
                .filter(salary -> salary.getSalary() >= threshold)
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .toList();
        salariesAboveThreshold.forEach(emp -> System.out.println("Name:" + emp.getName() + ", Salary:" + emp.getSalary()));


        // 1. Group Employees by Salary Range
        //low, medium and high ranges
        Map<String, List<Employee>> groupByRange = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> {
                            if (emp.getSalary() < 20000.00) return "low";
                            else if (emp.getSalary() < 40000) return "medium";
                            else return "high";
                        }
                ));
        System.out.println("group employees by salary range");
        groupByRange.forEach((range, emps) -> {
            System.out.println(range + " " + "earners");
            emps.forEach(e -> System.out.println("Name:" + e.getName() + ", Salary:" + e.getSalary()));
        });


        // 3. Calculate Total and Average Salary

        double sum = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.println(sum);

        double averageSalary = employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
        System.out.println(averageSalary);
    }



}
