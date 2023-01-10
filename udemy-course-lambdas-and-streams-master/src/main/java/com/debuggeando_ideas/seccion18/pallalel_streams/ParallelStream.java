package com.debuggeando_ideas.seccion18.pallalel_streams;

import java.util.List;

public class ParallelStream {

    // Se pasa como argumento el numero de threads
    //-D java.util.concurrent.ForkJoinPool.common.parallelism=5
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5);
        numbers
                .parallelStream()
                .forEach(n-> System.out.println(n+" "+Thread.currentThread().getName()));
    }
}
