package com.debuggeando_ideas.seccion16.streams;

import com.debuggeando_ideas.seccion16.streams.util.Database;
import com.debuggeando_ideas.seccion16.streams.util.Videogame;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05AcumuladorApp {
    public static void main(String[] args) {
        Stream<Videogame> videogameStream = Database.videogames.stream();
        acumuladorOperator(videogameStream);
        //fibonacci();
    }

    static void acumuladorOperator(Stream<Videogame> videogameStream ){
        System.out.println("-----------------------acumulador Operator --------------------------------------");
        Optional<Integer> optionalVideogame = videogameStream
                .filter(Videogame::getIsDiscount)
                .map(Videogame::getTotalSold)
                .reduce(Integer::sum);

        System.out.println("Total de ventas : "+optionalVideogame.orElseThrow());
    }

    static  void fibonacci (){
        IntStream intStream = IntStream.range(1,101);
        //OptionalInt optionalInt = intStream.reduce(Integer::sum);
        OptionalInt optionalInt = intStream.reduce((num1, num2)-> num1+num2);

        System.out.println(optionalInt.orElseThrow());
    }

}
