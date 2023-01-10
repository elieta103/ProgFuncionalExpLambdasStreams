package com.debuggeando_ideas.seccion07.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class StaticMethodReferenceApp {
    public static void main(String[] args) {
        //Supplier<UUID> getToken = () -> UUID.randomUUID();
        Supplier<UUID> getToken = UUID::randomUUID;

        System.out.println("UUID : "+ getToken.get());
    }
}
