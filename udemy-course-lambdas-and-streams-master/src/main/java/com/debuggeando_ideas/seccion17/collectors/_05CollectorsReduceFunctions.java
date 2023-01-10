package com.debuggeando_ideas.seccion17.collectors;

import com.debuggeando_ideas.seccion16.streams.util.Console;
import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.IntSummaryStatistics;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _05CollectorsReduceFunctions {
    public static void main(String[] args) {
        Stream<Videogame> videoGames = Database.videogames.stream();
        //avg(videoGames);
        //sum(videoGames);
        join(videoGames);
    }


    static void avg (Stream<Videogame> stream){
        Double avg = stream.collect(Collectors.averagingDouble(Videogame::getPrice));
        System.out.println("AVG : "+avg);
    }

    static void sum (Stream<Videogame> stream){
        IntSummaryStatistics intSummaryStatistics =
                stream.collect(Collectors.summarizingInt(v -> v.getReviews().size()));
        System.out.println("intSummaryStatistics min : "+intSummaryStatistics.getMin());
        System.out.println("intSummaryStatistics max : "+intSummaryStatistics.getMax());
        System.out.println("intSummaryStatistics sum : "+intSummaryStatistics.getSum());
        System.out.println("intSummaryStatistics avg : "+intSummaryStatistics.getAverage());
        System.out.println("intSummaryStatistics count : "+intSummaryStatistics.getCount());
    }

    static void join (Stream<Videogame> stream){
        String str = stream.map(Videogame::toString).collect(Collectors.joining("\n"));
        System.out.println("Join  : "+str);
    }

}
