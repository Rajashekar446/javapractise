package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCreationExample {

    /**
     * Stream represents a sequence of elements supporting various operations to process data in a clear and concise manner
     * Enables functional-style operations such filtering, mapping, and reducing
     * Streams do not store data;they operate on collections/arrays
     *
     * @param args
     */

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Pear", "Strawberry");

        //create stream from list
        Stream<String> stream = list.stream();
        //print each element using forEach
        stream.forEach(System.out::println);

        List<String> filteredFruits = list.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(filteredFruits);

    }
}
