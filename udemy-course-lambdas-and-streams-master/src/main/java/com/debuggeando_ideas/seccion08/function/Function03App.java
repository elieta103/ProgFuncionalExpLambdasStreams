package com.debuggeando_ideas.seccion08.function;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Function03App {
    public static void main(String[] args) {
        description();

        List<String> list = Arrays.asList("node", "java", "javascript", "c++", "plsql", "spring boot");

        // Lambda
        Map<String, Integer> response = convertListToMap(list, str-> getLength(str));
        System.out.println("lambda : "+response.toString());

        //Method reference
        response = convertListToMap(list, String::length);
        System.out.println("Method reference : "+ response.toString());

    }

    public static  <T,R> Map<T,R> convertListToMap (List<T> list , Function<T, R> func){
        Map<T, R> result = new HashMap<>();
        for(T t : list){
            result.put(t, func.apply(t));
        }
        return result;
    }

    public static Integer getLength(String str){
        return str.length();
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("3. List -> Map\n" +
                "3.1 This example accepts Function as an argument, convert a List into a Map.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
