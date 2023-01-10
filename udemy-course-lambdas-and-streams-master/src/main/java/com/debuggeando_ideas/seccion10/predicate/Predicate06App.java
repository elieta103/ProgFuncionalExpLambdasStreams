package com.debuggeando_ideas.seccion10.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Predicate06App {

    static Predicate<Integer> isGreatherThan100 = item -> item > 100;
    static Predicate<Integer> isLessThan10 = item -> item < 10;
    static Predicate<Integer> isBeetwen10And100 = isLessThan10.or(isGreatherThan100);


    public static void main(String[] args) {
        List<Integer>  numbers = Arrays.asList(1,2,3,10,50,100, 150,200);

        numbers.removeIf(isBeetwen10And100.negate());

        System.out.println(numbers);

    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Predicate is a functional interface, which accepts an argument and returns a boolean. Usually, it used to apply in a filter for a collection of objects.");
        System.out.println("1. Predicate in removeIf()\n" +
                "remove element from list");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
