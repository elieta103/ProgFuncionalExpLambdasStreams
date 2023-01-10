package com.debuggeando_ideas.seccion08.function;

import java.util.function.Function;

public class Function01App {
    public static void main(String[] args) {
        description();
        Function<String, Integer> func = str -> str.length();
        Integer resp = func.apply("eliel");
        System.out.println("func.apply(\"eliel\") : "+ resp);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("1. Function<T, R>\n" +
                "1.1 This example takes a <T> String and returns the length of the string as <R> Integer.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
