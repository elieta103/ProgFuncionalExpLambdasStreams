package com.debuggeando_ideas.seccion08.function;

import java.util.function.Function;

public class Function02App {
    public static void main(String[] args) {
        description();
        Function<String, Integer> func = x -> x.length();
        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("eliel");   // 12
        System.out.println("func.andThen(func2).apply(\"eliel\") : "+result);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("2. Chain Function<T, R>\n" +
                "2.1 This example chains the Function with andThen().");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
