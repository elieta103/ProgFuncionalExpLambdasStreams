package com.debuggeando_ideas.seccion10.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate03App {
    public static void main(String[] args) {
        Predicate<Integer> noGreaterThan5 = x -> x > 5;
        Predicate<Integer> noLessThan8 = x -> x < 8;

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5.and(noLessThan8))
                .collect(Collectors.toList());

        System.out.println(collect);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it used to apply in a filter for a collection of objects.");
        System.out.println("2.1 Predicate.and()");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
