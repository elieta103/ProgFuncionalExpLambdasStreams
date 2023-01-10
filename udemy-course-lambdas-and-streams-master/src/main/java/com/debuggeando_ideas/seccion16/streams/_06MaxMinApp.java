package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class _06MaxMinApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //maximoOperator(videogameStream);
        minimoOperator(videogameStream);
    }

    static void maximoOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------maximo Operator --------------------------------------");
        Optional<Videogame> optionalVideogame = videogameStream
                .max(Comparator.comparing(Videogame::getPrice));

        System.out.println("Mayor precio : "+optionalVideogame.orElseThrow());
    }

    static void minimoOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------maximo Operator --------------------------------------");
        Optional<Videogame> optionalVideogame = videogameStream
                .min(Comparator.comparing(Videogame::getPrice));
        System.out.println("Menor precio : "+optionalVideogame.orElseThrow());
    }

}
