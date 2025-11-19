package com.example.java8practice.week1fi;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //lamda expression implementing functional interface
        Greeting greeting = (name)-> System.out.println("hello"+ name);


        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("hello"+ name);
            }
        };

        greeting.sayHello("Raj");
        greeting1.sayHello("Sheka/r");
    }
}
