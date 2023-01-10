package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.BasicVideogame;
import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _09MapApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //map1Operator(videogameStream);
        map2Operator(videogameStream);
    }

    static void map1Operator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------map 1 Operator --------------------------------------");
        List<BasicVideogame> basicVideogameList = videogameStream.map(item ->{
            return BasicVideogame.builder()
                    .name(item.getName())
                    .console(item.getConsole())
                    .price(item.getPrice())
                    .build();
        }).collect(Collectors.toList());
        basicVideogameList.forEach(System.out::println);
    }

    static void map2Operator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------map 2 Operator --------------------------------------");
        List<String> titlesList = videogameStream
                .map(Videogame::getName)
                .collect(Collectors.toList());
        titlesList.forEach(System.out::println);
    }


}
