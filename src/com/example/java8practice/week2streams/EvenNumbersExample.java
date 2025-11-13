package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumbersExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 8, 9, 10, 2, 3, 4, 5, 6, 7);

        List<Integer> evenNumbers = list.stream()
                .filter(num -> num % 2 != 0)
                .sorted().collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
