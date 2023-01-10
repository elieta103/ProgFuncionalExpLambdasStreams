package com.debuggeando_ideas.intro_examples;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.stream.Collectors;

public class GroupByIntro {

    public static void main(String[] args) {
        System.out.println(
                Database.videogames
                        .stream()
                        .collect(
                                Collectors.groupingBy(Videogame::getConsole,
                                Collectors.summarizingDouble(Videogame::getPrice)))
        );
    }
}
