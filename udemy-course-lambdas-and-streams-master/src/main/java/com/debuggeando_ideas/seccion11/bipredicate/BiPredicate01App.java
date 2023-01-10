package com.debuggeando_ideas.seccion11.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicate01App {
    public static void main(String[] args) {
        description();
        BiPredicate<String, Integer> filter = (x, y) -> x.length() == y;

        boolean result1 = filter.test("eliel", 5);
        System.out.println("Result 1 : " + result1);

        boolean result2 = filter.test("eliel", 4);
        System.out.println("Result 2 : " + result2);
    }


    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiPredicate is a functional interface, which accepts two arguments and returns a boolean, basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.");
        System.out.println("1. BiPredicate Hello World.\n" +
                "If the String length matches the provided length?");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}