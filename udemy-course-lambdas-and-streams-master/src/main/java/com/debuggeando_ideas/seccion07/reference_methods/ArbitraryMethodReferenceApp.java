package com.debuggeando_ideas.seccion07.reference_methods;


import java.util.List;
import java.util.function.BiPredicate;


public class ArbitraryMethodReferenceApp {
    public static void main(String[] args) {
        //BiPredicate<String, String> biPredicate = (s1, s2)->s1.equals(s2);
        BiPredicate<String, String> biPredicate = String::equals;

        System.out.println(biPredicate.test("hola", "hola"));
    }
}
