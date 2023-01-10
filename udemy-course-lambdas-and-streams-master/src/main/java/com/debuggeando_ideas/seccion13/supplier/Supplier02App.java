package com.debuggeando_ideas.seccion13.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Random;
import java.util.function.Supplier;

public class Supplier02App {

    static Supplier<Integer> integerSupplier = () -> new Random().nextInt(100);
    static Supplier<MyProduct> myProductSupplier = () -> new MyProduct(100, "SmartPhone");

    public static void main(String[] args) {
        System.out.println(integerSupplier.get());
        System.out.println(myProductSupplier.get());
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.");
        System.out.println("1. Supplier\n" +
                "1.1 This example uses Supplier to return an Object.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    @Data
    @ToString
    @AllArgsConstructor
    @NoArgsConstructor
    static class MyProduct{
        Integer price;
        String name;
    }
}


