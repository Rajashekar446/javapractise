package com.example.java8practice.strings;


import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {

    public static void main(String[] args) {

        String str = "Hello world!";

        System.out.println(characterCount(str));
        System.out.println(charFrequency(str));
    }

    static Map<Character, Integer> characterCount(String str) {
        Map<Character, Integer> mapCount = new HashMap<>();

        if (str == null) return mapCount;

        char[] characters = str.toCharArray();
        for (char c : characters) {
            mapCount.put(c, mapCount.getOrDefault(c, 0) + 1);
        }
        return mapCount;
    }

    static Map<Character, Integer> charFrequency(String str) {
        Map<Character, Integer> mapCount = new HashMap<>();

        return str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.collectingAndThen(Collectors.counting(), Long::intValue))
                );

    }
}
