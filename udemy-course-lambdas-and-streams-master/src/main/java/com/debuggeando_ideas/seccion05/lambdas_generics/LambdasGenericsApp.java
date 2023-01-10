package com.debuggeando_ideas.seccion05.lambdas_generics;

import java.util.UUID;

public class LambdasGenericsApp {
    public static void main(String[] args) {
        Printer<String> stringPrinter =  str -> System.out.println(str);
        Printer<Employee> employeePrinter = emp -> System.out.println(emp);
        Printer<Product> productPrinter = pro -> System.out.println(pro);

        stringPrinter.print("Hola Mundo");

        Employee e = new Employee();
        e.setDni(UUID.randomUUID().toString());
        e.setName("Pedro");
        e.setSalary(10000.0);
        employeePrinter.print(e);

        Product p = new Product();
        p.setId(1L);
        p.setName("Galletas");
        p.setPrice(20.0);
        productPrinter.print(p);
    }
}
