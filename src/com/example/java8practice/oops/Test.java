package com.example.java8practice.oops;

public class Test {

    public static void main(String[] args) {

        Harrier c = new Harrier("SUV", "TATA");
        System.out.println(c.body + " " + c.company);

        c.color();
        c.start();
        c.hello();
        c.say();

        Vehicle v = new Harrier("sedan", "TATA");
        System.out.println(v.body );

        v.hello();

    }
}
