package com.debuggeando_ideas.seccion09.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction03App {
    public static void main(String[] args) {
        description();

        //Concatena 2^4=16,  16 toString => "16.0"
        String result = powToString(2, 4,
                        (a1, a2)-> Math.pow(a1, a2),
                        number -> "Resultado : "+String.valueOf(number));
        System.out.println(result);

    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double, R> func2) {
        return func.andThen(func2).apply(a1, a2);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiFunction is a functional interface; it takes two arguments and returns an object.");
        System.out.println("2. BiFunction<T, U, R> + Function<T, R>\n" +
                "2.2 This example converts the above program into a method that accepts BiFunction and Function as arguments and chains it together.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
