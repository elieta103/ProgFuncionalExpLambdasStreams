package com.debuggeando_ideas.seccion11.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicate03App {
    static BiPredicate<String, String> myEqualsString = (s1,s2)-> s1.concat(s2).equals("HelloWorld");

    public static void main(String[] args) {
        description();
        System.out.println("BiPredicate : "+ myEqualsString.test("Hello", "World"));
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiPredicate is a functional interface, which accepts two arguments and returns a boolean, basically this BiPredicate is same with the Predicate, instead, it takes 2 arguments for the test.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
