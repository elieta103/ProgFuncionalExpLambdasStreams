package com.debuggeando_ideas.seccion17.collectors;

import com.debuggeando_ideas.seccion16.streams.util.Console;
import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _04CollectorsGroupBySum {
    public static void main(String[] args) {
        Stream<Videogame> videoGames = Database.videogames.stream();

        //Group by and Sumatoria del total de ventas
        Map<Console, Integer> partitionMap =
                videoGames.collect(Collectors.groupingBy(Videogame::getConsole,
                                   Collectors.summingInt(Videogame::getTotalSold)));

        partitionMap.forEach((k,v) -> System.out.println("Key : "+k+ " , Value : "+v));
    }


}
