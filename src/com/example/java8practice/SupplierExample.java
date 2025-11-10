package com.example.java8practice;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Double> randomDouble = ()->new Random().nextDouble(10);

        System.out.println(randomDouble.get());
    }
}
