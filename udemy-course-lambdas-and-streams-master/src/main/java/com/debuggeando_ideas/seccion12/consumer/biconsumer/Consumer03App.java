package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer03App {
    public static void main(String[] args) {
        description();

        List<String> list = Arrays.asList("a", "ab", "abc");
        Consumer<String> consumer = str -> System.out.print(str.length()+" ");

        forEach(list, consumer);
    }

    static <T> void forEach(List<T> list, Consumer<T> consumer){
        for (T t : list){
            consumer.accept(t);
        }
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Consumer is a functional interface; it takes an argument and returns nothing.");
        System.out.println("2. Higher Order Function\n" +
                "2.1 This example accepts Consumer as an argument, simulates a forEach to print size of string from a list.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
