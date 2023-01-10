package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Review;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _11PeekApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //peekOperator1(videogameStream);
        peekOperator2(videogameStream);
    }

    static void peekOperator1(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------peek 1 Operator --------------------------------------");
        videogameStream
                .peek(System.out::println)
                .collect(Collectors.toList());
    }

    static void peekOperator2(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------peek 2 Operator --------------------------------------");
        videogameStream
                .peek(item -> item.setName(""))
                .forEach(System.out::println);
    }

}
