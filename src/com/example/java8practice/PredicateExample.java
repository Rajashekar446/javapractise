package com.example.java8practice;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> checkEvenNumber = value -> value%2==0;

        System.out.println(checkEvenNumber.test(4));
        System.out.println(checkEvenNumber.test(5));

    }
}
