package com.debuggeando_ideas.seccion14.unary.binary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperator01App {
    //static Function<String, String> stringUpperCase = (str)-> str.toUpperCase();
    static Function<String, String> funcStringUpperCase = String::toUpperCase;
    static UnaryOperator<String> unaryStringUpperCase = String::toUpperCase;



    public static void main(String[] args) {
        System.out.println(funcStringUpperCase.apply("hola"));
        System.out.println(unaryStringUpperCase.apply("hola"));

    }
}
