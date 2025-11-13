package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Given a list of names, find the first name starting with “P” using findFirst.
 *
 * Find any name starting with “S” using findAny.
 *
 * Print both results.
 */
public class FindAnyFindFirst {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Pear", "Banana", "Rodriguez", "Anas", "Pineapple", "Peach");

        Optional<String> findFirst = strings.stream()
                .filter(s->s.startsWith("P"))
                .findFirst();

        System.out.println(findFirst.orElse("not found"));

        Optional<String> findAnyWithS = strings.stream()
                .filter(s->s.startsWith("P"))
                .findAny();
        System.out.println(findAnyWithS.orElse("not found"));

    }
}
