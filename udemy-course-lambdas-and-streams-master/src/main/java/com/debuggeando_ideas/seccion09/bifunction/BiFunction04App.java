package com.debuggeando_ideas.seccion09.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunction04App {
    public static void main(String[] args) {
        description();

        //Al ser un metodo generico, puede tener multiples implementaciones.
        String pow = convert(2,4,
                    (a1, a2)-> Math.pow(a1, a2),
                    number -> "Resultado pow : "+String.valueOf(number));
        System.out.println(pow);

        String sum = convert(2,4,
                (a1, a2)-> a1-a2,
                number -> "Resultado sum : "+String.valueOf(number));
        System.out.println(sum);

        String mul = convert(2,4,
                (a1, a2)-> a1*a2,
                number -> "Resultado mul : "+String.valueOf(number));
        System.out.println(mul);




    }

    //Generic Method
    public static <T1,T2,R1,R2> R2 convert(T1 t1, T2 t2,
                                    BiFunction<T1, T2, R1> func1,
                                    Function<R1, R2> func2) {
        return func1.andThen(func2).apply(t1, t2);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, BiFunction is a functional interface; it takes two arguments and returns an object.");
        System.out.println("2. BiFunction<T, U, R> + Function<T, R>\n" +
                "2.3 This example converts the above method into a generic method:");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
