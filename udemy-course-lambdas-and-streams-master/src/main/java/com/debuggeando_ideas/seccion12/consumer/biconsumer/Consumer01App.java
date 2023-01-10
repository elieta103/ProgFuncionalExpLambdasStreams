package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.function.Consumer;

public class Consumer01App {


    public static void main(String[] args) {
        description();
        Consumer<String> print = x -> System.out.println(x);
        print.accept("java");   // java
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Consumer is a functional interface; it takes an argument and returns nothing.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
