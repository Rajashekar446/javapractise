package com.example.java8practice;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<String, String> convertToUpperCase = str -> str.toUpperCase();

        System.out.println(convertToUpperCase.apply("Hello"));
        //we have andThen and compose
        
    }
}
