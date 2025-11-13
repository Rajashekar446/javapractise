package com.example.java8practice.week2streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of strings, group them based on their first character using Collectors.groupingBy.
 *
 * Print the resulting map.
 */
public class GroupingByExample {

    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Apple", "Pear", "Banana", "Rodriguez", "Anas", "Pineapple", "Peach");

        Map<Character, List<String>> groupingByFirstCharacter = strings.stream()
                .collect(Collectors.groupingBy(word->word.charAt(0)));

        System.out.println(groupingByFirstCharacter);
        groupingByFirstCharacter.forEach((word,list)->{
            System.out.println(word + " : " + list);
        });

    }
}
