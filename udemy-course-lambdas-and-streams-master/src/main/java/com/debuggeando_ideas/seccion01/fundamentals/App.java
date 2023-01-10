package com.debuggeando_ideas.seccion01.fundamentals;

public class App {

    public static void main(String[] args) {
        DatabaseService mongoService = new MongoDB();
        DatabaseService postgresService = new PostgresDB();

        System.out.println(mongoService.getById(20L));
        System.out.println(mongoService.getById(30L));

    }

}
