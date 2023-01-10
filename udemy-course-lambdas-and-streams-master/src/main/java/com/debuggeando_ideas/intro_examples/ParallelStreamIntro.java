package com.debuggeando_ideas.intro_examples;

import com.debuggeando_ideas.seccion16.streams.util.Database;

public class ParallelStreamIntro {

    public static void main(String[] args) {
        Database.videogames.parallelStream()
                .forEach(v -> System.out.println(Thread.currentThread().getName() + " - " + v));
    }
}
