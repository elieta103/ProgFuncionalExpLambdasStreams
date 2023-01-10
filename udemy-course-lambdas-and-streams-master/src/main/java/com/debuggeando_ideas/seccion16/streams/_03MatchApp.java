package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.stream.Stream;

public class _03MatchApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //anyMatchOperator(videogameStream);
        //allMatchOperator(videogameStream);
        noneMatchOperator(videogameStream);
    }

    static void anyMatchOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------anyMatch Operator --------------------------------------");
        boolean resp = videogameStream.anyMatch(item -> item.getTotalSold() > 1);
        System.out.println("anyMatch : "+resp);
    }

    static void allMatchOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------allMatch Operator --------------------------------------");
        boolean resp = videogameStream.allMatch(item -> item.getTotalSold() > 1_000);
        System.out.println("allMatch : "+resp);
    }

    static void noneMatchOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------noneMatch Operator --------------------------------------");
        boolean resp = videogameStream.noneMatch(item -> item.getReviews().isEmpty());
        System.out.println("noneMatch : "+resp);
    }

}
