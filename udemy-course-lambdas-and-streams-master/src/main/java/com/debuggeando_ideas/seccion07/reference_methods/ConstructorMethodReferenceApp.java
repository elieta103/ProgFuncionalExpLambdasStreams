package com.debuggeando_ideas.seccion07.reference_methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ConstructorMethodReferenceApp {
    public static void main(String[] args) {

        //Supplier<MyObject> getMyObject = () -> new MyObject();
        Supplier<MyObject> getMyObject = MyObject::new;

        System.out.println(getMyObject.get());
    }
}
