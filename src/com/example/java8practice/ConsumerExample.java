package com.example.java8practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        Consumer<List<Integer>> listOfValues = System.out::println;

        listOfValues.accept(Arrays.asList(1,2,3,4,5));
    }
}
