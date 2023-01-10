package com.debuggeando_ideas.seccion12.consumer.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumer02App {

    public static void main(String[] args) {
        description();

        execute("Hello ","java", (x,y) -> System.out.println(x+y));
        execute(10, 20, (x,y) -> System.out.println(x+y));
        execute(20, 10, (x,y) -> System.out.println(x-y));
        execute(10, 20, (x,y) -> System.out.println(x*y));
        execute(20, 10, (x,y) -> System.out.println(x/y));

    }

    static <T> void execute(T t1, T t2, BiConsumer <T, T> biConsumer){
        biConsumer.accept(t1, t2);
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiConsumer is a functional interface; it takes two arguments and returns nothing.");
        System.out.println("2. Higher Order Function\n" +
                "2.1 This example accepts BiConsumer as an argument, create a generic addTwo to join two objects.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
