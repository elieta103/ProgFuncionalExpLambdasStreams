package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.stream.Stream;

public class _02CountForEachApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //countOperator(videogameStream);
        forEachOperator(videogameStream);
    }

    static void countOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------Count Operator --------------------------------------");
        System.out.println("Count : "+videogameStream.count());
    }

    static void forEachOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------forEach Operator --------------------------------------");
        videogameStream.forEach(System.out::println);
    }

}
