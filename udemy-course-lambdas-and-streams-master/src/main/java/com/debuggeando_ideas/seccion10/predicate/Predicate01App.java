package com.debuggeando_ideas.seccion10.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Predicate01App {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream().filter(x -> x > 5).collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it used to apply in a filter for a collection of objects.");
        System.out.println("1. Predicate in filter()\n" +
                "filter() accepts predicate as argument.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
