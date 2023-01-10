package com.debuggeando_ideas.seccion05.lambdas_generics;

@FunctionalInterface
public interface Printer<T> {

    void print(T toPrint);
}
