package com.example.java8practice.strings;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to check palindrome");
        String input = scanner.nextLine();
        System.out.println("Entered value:" + input);
        boolean check = checkPalindrome(input.replaceAll("[^a-zA-Z0-9\\s+]", "").toLowerCase().trim());
        if (check) {
            System.out.println("Entered value:" + input + " is palindrome");
        } else {
            System.out.println("Entered value:" + input + " is not palindrome");
        }
    }

    static boolean checkPalindrome(String s) {
        //palindrome means it reads same from back and also from front
        //Edge cases: single character, null value
        //will check if char at first index == char at str.lengh-1 and char at index+1 == str.length-2

        if (s == null || s.isBlank()) return false;
        if (s.length() == 1) return true;

        String cleaned = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Cleaned String: "+cleaned);

     /*   int lastIndex = s.length() - 1;

        for (int i = 0; i <= lastIndex; i++) {
            if (s.charAt(i) != s.charAt(lastIndex)) {
                return false;
            } else {
                lastIndex--;
            }
        }
        return true;*/

        int left = 0;
        int right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
