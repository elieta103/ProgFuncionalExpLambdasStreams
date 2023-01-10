package com.debuggeando_ideas.seccion08.function;

import java.util.function.Function;

public class Function05App {
    static Function<String, Integer> longitudCadena = str -> Integer.valueOf(str.length());
    static Function<Integer, Boolean> isImpar = n -> n.intValue()%2 == 0 ? Boolean.FALSE: Boolean.TRUE;
    static Function<String, Boolean> longitudCadenaThenIsImpar = longitudCadena.andThen(isImpar);

    static Function<Integer, Integer> multiply = n -> n * 10;
    static Function<Integer, Integer> sum = n -> n + 10;
    static Function<Integer, Integer> multiplyThenApplySum = multiply.andThen(sum);
    static Function<Integer, Integer> composeSumThenMultiply = multiply.compose(sum);

    public static void main(String[] args) {
        description();
        System.out.println("longitudCadena(\"Hola\"): "+longitudCadena.apply("Hola"));
        System.out.println("isImpar(3): "+ isImpar.apply(Integer.valueOf(3)));
        System.out.println("isImpar(4): "+ isImpar.apply(Integer.valueOf(4)));

        System.out.println( longitudCadenaThenIsImpar.apply("hola"));

        System.out.println("");
        System.out.println("(5*10) multiply.apply(5) : "+multiply.apply(5));
        System.out.println("(5+10) sum.apply(5) : "+sum.apply(5));
        System.out.println("Concatenar Funciones : (5*10=50+10=60) multiplyThenApplySum.apply(5) : "+multiplyThenApplySum.apply(5));
        System.out.println("Composicion Funciones : (5+10=15*10=150) composeSumThenMultiply.compose(5) "+composeSumThenMultiply.apply(5));
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("5. apply -> concatenar   compose -> Composicion");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
