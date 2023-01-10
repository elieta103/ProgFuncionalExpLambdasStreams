package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _08FilterApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        filterOperator(videogameStream);
    }

    static void filterOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------filter Operator --------------------------------------");
        List<Videogame> videogameList = videogameStream
                .filter(item -> item.getPrice() > 12.0)
                .filter(item -> !item.getIsDiscount())
                .filter(item -> item.getOfficialWebsite().contains("forza"))
                .collect(Collectors.toList());
        System.out.println("Filter: "+videogameList);
    }



}
