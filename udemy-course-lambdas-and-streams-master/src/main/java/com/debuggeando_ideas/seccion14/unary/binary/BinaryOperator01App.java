package com.debuggeando_ideas.seccion14.unary.binary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class BinaryOperator01App {
    static BiFunction<String, String, String> biFunction = (str1, str2)-> str1.toUpperCase()+" - "+str2.toLowerCase();

    static BinaryOperator<String> binaryOperator = (str1, str2)-> str1.toUpperCase()+" - "+str2.toLowerCase();



    public static void main(String[] args) {
        System.out.println(biFunction.apply("ElieL ", "heRrErA"));
        System.out.println(binaryOperator.apply("ElieL ", "heRrErA"));


    }
}
