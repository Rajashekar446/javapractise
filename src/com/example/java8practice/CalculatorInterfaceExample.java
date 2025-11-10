package com.example.java8practice;

public class CalculatorInterfaceExample {
    public static void main(String[] args) {

        Calculator sum = (a,b)-> System.out.println(a+b);

        Calculator sub = (a,b) -> System.out.println(a-b);

        sum.getNumbers(1,2);
        sub.getNumbers(10,6);

    }
}
