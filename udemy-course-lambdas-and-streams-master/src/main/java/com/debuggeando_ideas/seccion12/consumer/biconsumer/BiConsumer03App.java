package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumer03App {

    public static void main(String[] args) {
        description();

        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Javascript");
        languages.put(3, "C++");
        languages.put(4, "PL-SQL");

        languages.forEach((k,v)-> System.out.println("Key : "+k+ " , Value : "+v));
    }

    static <T> void execute(T t1, T t2, BiConsumer <T, T> biConsumer){
        biConsumer.accept(t1, t2);
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
