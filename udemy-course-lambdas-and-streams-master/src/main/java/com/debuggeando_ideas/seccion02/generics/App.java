package com.debuggeando_ideas.seccion02.generics;

public class App {

    public static void main(String[] args) {
        DatabaseService<Product> productDatabaseService = new ProductDB();
        DatabaseService<Employee> employeeDatabaseService = new EmployeeDB();

        System.out.println(productDatabaseService.getById(10L));
        System.out.println(employeeDatabaseService.getById(20L));
    }

}
