package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _12SortStreamApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();

        sortStreamOperator1(videogameStream);
    }

    static void sortStreamOperator1(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------sort Stream Operator --------------------------------------");
        List<Videogame> listSorted = videogameStream
                .sorted(Comparator.comparing(v-> v.getReviews().size()))
                .collect(Collectors.toList());
        listSorted.forEach(System.out::println);
    }


}
