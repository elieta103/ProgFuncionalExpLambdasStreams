package com.debuggeando_ideas.seccion13.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class Supplier01App {
    public static void main(String[] args) {
        description();
        Supplier<LocalDateTime> s = () -> LocalDateTime.now();
        LocalDateTime time = s.get();

        System.out.println(time);

        Supplier<String> s1 = () -> LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String time2 = s1.get();

        System.out.println(time2);
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.");
        System.out.println("1. Supplier\n" +
                "1.1 This example uses Supplier to return a current date-time.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
