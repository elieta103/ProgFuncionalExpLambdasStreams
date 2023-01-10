package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.BasicVideogame;
import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Review;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _10FlatMapApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        //flatMapOperator1(videogameStream);
        flatMapOperator2(videogameStream);
    }

    static void flatMapOperator1(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------flatMap 1 Operator --------------------------------------");
        List<List<Review>> listOfList = videogameStream
                .map(item -> item.getReviews())
                .collect(Collectors.toList());

        System.out.println("Con Map es una lista de Listas de Reviews [[],[],[]] => " );
        listOfList.forEach(System.out::println);
    }

    static void flatMapOperator2(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------flatMap 2 Operator --------------------------------------");
        List<Review> listReviews = videogameStream
                .flatMap(item -> item.getReviews().stream())
                .collect(Collectors.toList());

        System.out.println("Con FlatMap es una lista de Reviews [, , , ] => " );
        listReviews.forEach(System.out::println);
    }

}
