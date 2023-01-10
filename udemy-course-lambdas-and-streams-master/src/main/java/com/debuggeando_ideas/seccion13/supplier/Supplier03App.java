package com.debuggeando_ideas.seccion13.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.function.Supplier;

public class Supplier03App {
    public static void main(String[] args) {
        description();

        Developer dev1 = factory(Developer::new);
        System.out.println(dev1);

        Developer dev2 = factory(()-> new Developer("Eliel"));
        System.out.println(dev2);

    }

    static Developer factory (Supplier<? extends  Developer> supplier){
        Developer developer = supplier.get();

        if(developer.getName()== null || "".equals(developer.getName())){
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.now());
        return developer;
    }

    public static void description() {
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Supplier is a functional interface; it takes no arguments and returns a result.");
        System.out.println("3. Factory\n" +
                "3.1 A simple factory method to return a Developer object.");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }

    @Data
    @ToString
    @AllArgsConstructor
    static class Developer {
        String name;
        BigDecimal salary;
        LocalDate start;

        public Developer() {
        }

        public Developer(String name) {
            this.name = name;
        }
    }
}
