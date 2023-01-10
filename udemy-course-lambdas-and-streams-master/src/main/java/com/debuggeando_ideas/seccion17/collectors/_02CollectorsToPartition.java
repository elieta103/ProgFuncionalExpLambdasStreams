package com.debuggeando_ideas.seccion17.collectors;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _02CollectorsToPartition {
    public static void main(String[] args) {
        Stream<Videogame> videoGames = Database.videogames.stream();
        //Particion

        Map<Boolean, List<Videogame>> partitionMap =
                videoGames.collect(Collectors.partitioningBy( v-> v.getPrice() > 15 ));

        partitionMap.forEach((k,v) -> System.out.println("Key : "+k+ " , Value : "+v));
    }


}
