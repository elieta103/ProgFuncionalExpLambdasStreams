package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumer02App {
    public static void main(String[] args) {
        description();

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> consumer = item -> System.out.print(item+" - ");

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
                "2.1 This example accepts Consumer as an argument, simulates a forEach to print each item from a list.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
