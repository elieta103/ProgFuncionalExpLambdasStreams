package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class _01ConstructoresApp {
    public static void main(String[] args) {
        Stream<Videogame> myStream = Database.videogames.stream();
        myStream.forEach(System.out::println);

        System.out.println("--------------------Stream from Array ----------------------------");
        Integer[] arrayInt = {1,2,3,4,5};
        Stream<Integer> integerArrayStream  = Stream.of(arrayInt);
        integerArrayStream.forEach(System.out::println);

        System.out.println("--------------------Stream from List ----------------------------");
        List<Integer> listInt = List.of(1,2,3,4,5);
        Stream<Integer> integerListStream  = listInt.stream();
        integerListStream.forEach(System.out::println);

        System.out.println("--------------------Stream from Stream.of ----------------------------");
        Stream.of("Luis", "Pedro", "Juan").forEach(System.out::println);

        System.out.println("--------------------Stream from DoubleStream ----------------------------");
        DoubleStream doubleStream = DoubleStream.of(2.34, 30.02, 50.99);
        doubleStream.forEach(System.out::println);
    }
}
