package com.debuggeando_ideas.seccion15.lambdas.applications;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile01 {
    public static void main(String[] args) {
        Path file = Paths.get("src/main/resources/lambdas.txt");
        try(Stream<String> lines= Files.lines(file).onClose(()-> System.out.println("Cerrando file...")  )){
            lines.forEach(System.out::println);
        }catch (IOException ioex){
            ioex.printStackTrace();
        }
    }
}
