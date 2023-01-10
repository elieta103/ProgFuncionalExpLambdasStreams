package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _13TakeWhileDropWhileApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();

        takeWhileOperator(videogameStream);
        //dropWhileOperator(videogameStream);

    }

    static void takeWhileOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------takeWhile Operator --------------------------------------");
        List<Videogame> listSorted = videogameStream
                .sorted(Comparator.comparing(Videogame::getName))
                .takeWhile(v-> !v.getName().startsWith("M")) //Tomar items mientras no empiecen con M
                .collect(Collectors.toList());

        listSorted.forEach(System.out::println);
    }

    static void dropWhileOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------dropWhile Operator --------------------------------------");
        List<Videogame> listSorted = videogameStream
                .sorted(Comparator.comparing(Videogame::getName))
                .dropWhile(v-> !v.getName().startsWith("M")) //Elimina items mientras no empiecen con M
                .collect(Collectors.toList());

        listSorted.forEach(System.out::println);
    }

}
