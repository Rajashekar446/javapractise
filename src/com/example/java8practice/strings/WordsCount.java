package com.example.java8practice.strings;

import java.util.Arrays;

public class WordsCount {

    public static void main(String[] args) {
        String str = " Hello world  !";

        System.out.println(wordCount(str)); //output 3
        System.out.println(wordCountUsingStreams(str));
    }

    public static int wordCount(String str) {
        if (str == null) return 0;
        String cleanedStr = str.trim();  //"Hello world !"
        if (cleanedStr.isEmpty()) return 0;
        String[] words = cleanedStr.split("\\s+");
        int count = 0;
        for (String word : words) {
            count++;
        }
        return count;
    }

    public static int wordCountUsingStreams(String str) {

        if (str == null || str.isEmpty()) return 0;

        return Math.toIntExact(Arrays.stream(str.split("\\s+")).count());
    }
}
