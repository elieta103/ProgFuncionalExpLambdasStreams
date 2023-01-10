package com.debuggeando_ideas.seccion09.bifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction02App {
    public static void main(String[] args) {
        description();

        // Math.pow(a1, a2) returns Double
        BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> Math.pow(a1, a2);

        // takes Double, returns String
        Function<Double, String> func2 = (input) -> "Result : " + String.valueOf(input);

        //Concatena 2^4=16,  16 toString => "16.0"
        String result = func1.andThen(func2).apply(2, 4);

        System.out.println(result);

    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiFunction is a functional interface; it takes two arguments and returns an object.");
        System.out.println("2. BiFunction<T, U, R> + Function<T, R>\n" +
                "2.1 This BiFunction takes two Integer and returns a Double, and uses andThen() to chain it with a Function to convert the Double into a String.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
