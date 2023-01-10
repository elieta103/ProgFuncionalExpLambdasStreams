package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _07DistinctLimitSkipApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //distinctOperator(videogameStream);
        //limitOperator(videogameStream);
        skipOperator(videogameStream);
    }

    static void distinctOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------distinct Operator --------------------------------------");
        Long count = videogameStream
                        .distinct()
                        .count();
        System.out.println("Cuenta distintos : "+count);
    }

    static void limitOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------limit Operator --------------------------------------");
        videogameStream
                .limit(5)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    static void skipOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------skip Operator --------------------------------------");
        videogameStream
                .skip(15)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

}
