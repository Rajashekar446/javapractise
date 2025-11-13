package com.example.java8practice.week2streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Use a parallel stream on a large list of random integers to find the maximum value in the list.
 *
 * Compare performance with a sequential stream by measuring execution time.
 */
public class ParallelStreams {

    public static void main(String[] args) {
       // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,  6, 7, 8, 9,23, 56,3, 5 ,77, 89,33,55,78,897,234,90);

        final int size = 10000000;
        Random random = new Random();

        //generate  a large number of random variables
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(random.nextInt(size));
        }

        //Sequential stream
        long startTimeSeq = System.currentTimeMillis();
        Integer maxValue = numbers.stream().max(Integer::compareTo).get();
        long endTimeSeq = System.currentTimeMillis();
        long duration = endTimeSeq - startTimeSeq;
        System.out.println(maxValue);
        System.out.println(duration);

        //Parallel stream
        long startTimePar =  System.currentTimeMillis();
        Integer maxValuePar = numbers.parallelStream().max(Integer::compareTo).get();
        long endTimePar = System.currentTimeMillis();
        long durationPar = endTimePar - startTimePar;
        System.out.println(maxValuePar);
        System.out.println(durationPar);
    }
}
