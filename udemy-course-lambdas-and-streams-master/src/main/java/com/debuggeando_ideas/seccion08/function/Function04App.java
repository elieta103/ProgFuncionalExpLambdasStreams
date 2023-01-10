package com.debuggeando_ideas.seccion08.function;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.*;
import java.util.function.Function;

public class Function04App {
    public static void main(String[] args) {
        description();

        List<String> list = Arrays.asList("node", "java", "javascript", "c++", "plsql", "spring boot");
        Function04App function04App = new Function04App();

        // Lambda
        List<String> response = toListSha256(list, str-> function04App.sha256(str));
        System.out.println("lambda : "+response.toString());

        System.out.println();

        //Method reference
        response = toListSha256(list, function04App::sha256);
        System.out.println("Method reference : "+ response.toString());

    }

    public static  <T, R> List<R> toListSha256 (List<T> list , Function<T, R> func){
        List<R> result = new ArrayList<>();
        for(T t : list){
            result.add(func.apply(t));
        }
        return result;
    }

    public String sha256(String str){
        return DigestUtils.sha256Hex(str);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("4. List -> List\n" +
                "4.1 This example accepts Function as an argument, convert a List of String into another List of String, which was hashed with SHA256.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
