package com.example.java8practice.oops;

 abstract class Vehicle {

     String body;

    abstract void  start();

    abstract void color();

    String hello(){
        return "Hello world!";

    }

    void say(){
        System.out.println("say");
    }

    Vehicle(String body) {
        this.body = body;
    }

}

class Harrier extends Vehicle{

     String company;

    Harrier(String body, String company) {
        super(body);
        this.company = company;
    }

    void helloMethod(){
        System.out.println("HArrier class");
    }

    @Override
    void start() {
        System.out.println("Auto");
    }

    @Override
    void color() {

        System.out.println("Black");
    }
}
