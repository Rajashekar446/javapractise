package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings representing names, convert all names to lowercase using map and collect into a new list.
 * <p>
 * Print the new list.
 */
public class MapAndCollect {

    public static void main(String[] args) {
        List<String> listofNames = Arrays.asList("Ram", "Hari", "Shiva", "Narayan");
        List<String> toLowerCase = listofNames.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        System.out.println(toLowerCase);

    }
}
