package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Optional;
import java.util.stream.Stream;

public class _04FindApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //findFirstOperator(videogameStream);
        findAnyOperator(videogameStream);
    }

    static void findFirstOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------findFirst Operator --------------------------------------");
        Optional<Videogame> optionalVideogame = videogameStream.findFirst();
        System.out.println("findFirst : "+optionalVideogame.orElseThrow());
    }

    static void findAnyOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------findAny Operator --------------------------------------");
        Optional<Videogame> optionalVideogame = videogameStream.findAny();
        System.out.println("findAny : "+optionalVideogame.orElseThrow());
    }
}
