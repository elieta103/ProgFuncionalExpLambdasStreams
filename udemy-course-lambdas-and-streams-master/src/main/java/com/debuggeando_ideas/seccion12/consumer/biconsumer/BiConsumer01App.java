package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumer01App {


    public static void main(String[] args) {
        description();
        BiConsumer<String, String> print = (x,y) -> System.out.println(x+y);
        print.accept("java"," hello");   // java
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
