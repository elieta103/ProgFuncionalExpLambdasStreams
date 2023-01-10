package com.debuggeando_ideas.seccion17.collectors;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _01CollectorsToCollection {
    public static void main(String[] args) {
        Stream<Videogame> videoGames = Database.videogames.stream();
       // System.out.println("Type de object : "+ streamToCollection(videoGames, "SET").getClass().getName());
        System.out.println("Type de object : "+ streamToMap(videoGames).getClass().getName());

    }

    static Collection<Videogame> streamToCollection(Stream<Videogame> stream, String type){
        return type.equals("LIST") ? stream.collect(Collectors.toList()) : stream.collect(Collectors.toSet());
    }

    static Map<String, Double> streamToMap(Stream<Videogame> stream) {
        return stream.distinct().collect(Collectors.toMap(Videogame::getName, Videogame::getPrice));
    }

}
