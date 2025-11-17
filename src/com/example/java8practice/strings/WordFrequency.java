package com.example.java8practice.strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "Java is a fun and Java is fantastic";

        System.out.println(countWordsFrequency(str)); //{java-2, is-2, a-1, and-1, fun-1, fantastic-1}
        System.out.println(countWordsFrequencyStream(str));
    }

    private static Map<String, Integer> countWordsFrequencyStream(String str) {
        Map<String, Integer> map = new HashMap<>();
        if(str==null || str.isEmpty()) return map;

        return Arrays.stream(str.toLowerCase().split("\\s+"))
                .collect(Collectors.groupingBy((word)-> word, Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
    }

    public static Map<String, Integer> countWordsFrequency(String str){

        Map<String, Integer> map = new HashMap<>();
        if(str == null || str.isEmpty()){
            return map;
        }
        if(str.trim().toLowerCase().isBlank()) return map;
        String[] words = str.split("\\s+");
        for(String word : words){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        return map;
    }


}
