package com.debuggeando_ideas.seccion18.pallalel_streams;

import java.util.stream.IntStream;

public class ParallelStreamVsStreamTime {

    // Se pasa como argumento el numero de threads
    //-D java.util.concurrent.ForkJoinPool.common.parallelism=5
    public static void main(String[] args) {
        parallelStreamTime();
        streamTime();
    }

    static  void parallelStreamTime(){
        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1,200_000_000).parallel().reduce(0, Integer::sum);
        long stopTime = System.currentTimeMillis();

        System.out.println("parallelStreamTime : "+(stopTime-startTime));
    }

    static  void streamTime(){
        long startTime = System.currentTimeMillis();
        IntStream.rangeClosed(1,200_000_000).reduce(0, Integer::sum);
        long stopTime = System.currentTimeMillis();

        System.out.println("streamTime : "+(stopTime-startTime));
    }
}
