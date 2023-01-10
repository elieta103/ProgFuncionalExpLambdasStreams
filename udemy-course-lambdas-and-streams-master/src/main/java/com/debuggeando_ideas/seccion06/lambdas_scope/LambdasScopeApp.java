package com.debuggeando_ideas.seccion06.lambdas_scope;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class LambdasScopeApp {

    public static void main(String[] args) {
        //int num; No se puede usar dentro de la Lambda, Ya que la expresion Lambda puede ejecutarse en otro thread
        //int num = 10;
        //static volatile int num = 10;  Una opcion es ponerla como variable miembro fuera del main
        //AtomicInteger permite que el acceso al objeto por varios threads o subprocesos

        AtomicInteger num1 = new AtomicInteger(10);
        IntStream.range(1,10).forEach(item -> System.out.println(num1.get() + item));

        //AtomicReference puede tener referencia a cualquier objeto
        AtomicReference<Integer> num2 = new AtomicReference<Integer>(10);
        IntStream.range(1,10).forEach(item -> System.out.println(num2.get() + item));

    }
}
