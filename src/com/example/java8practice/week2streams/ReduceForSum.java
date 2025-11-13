package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;

/**
 * Given a list of integers, use reduce to calculate the sum of all elements.
 *
 * Print the sum
 */
public class ReduceForSum {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = integers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }
}
