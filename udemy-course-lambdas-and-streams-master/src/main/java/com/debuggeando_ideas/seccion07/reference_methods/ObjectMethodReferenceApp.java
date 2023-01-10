package com.debuggeando_ideas.seccion07.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class ObjectMethodReferenceApp {
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>(10);

        IntStream repeat = IntStream.range(1, 11);
        repeat.forEach(number::add);

        System.out.println(number);
    }
}
