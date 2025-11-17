package com.example.java8practice.strings;

/**
 * check if rotation of one string is rotation of other string
 */
public class CheckRotation {

    public static void main(String[] args) {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        System.out.println(checkRotationIsSame(s1, s2));
    }

    static boolean checkRotationIsSame(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        return (s1+s1).contains(s2);
    }
}
