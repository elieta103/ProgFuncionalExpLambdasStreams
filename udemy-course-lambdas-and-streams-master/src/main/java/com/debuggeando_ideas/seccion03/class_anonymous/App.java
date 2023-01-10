package com.debuggeando_ideas.seccion03.class_anonymous;

import com.debuggeando_ideas.seccion03.class_anonymous.*;
import java.util.List;
import java.util.UUID;

public class App {

    public static void main(String[] args) {
        DatabaseService<Product> productDatabaseService = new  DatabaseService<Product>(){
            @Override
            public Product getById(Long id) {
                Product p = new Product();
                p.setId(id);
                p.setName("Galletas");
                p.setPrice(20.0);
                return p;
            }
            @Override
            public List<Product> getAllRecords() {
                return null;
            }
        };
        DatabaseService<Employee> employeeDatabaseService = new DatabaseService<Employee>(){
            @Override
            public Employee getById(Long id) {
                Employee e = new Employee();
                e.setDni(UUID.randomUUID().toString());
                e.setName("Pedro");
                e.setSalary(10000.0);
                return e;
            }

            @Override
            public List<Employee> getAllRecords() {
                return null;
            }
        };

        System.out.println(productDatabaseService.getById(10L));
        System.out.println(employeeDatabaseService.getById(20L));
    }

}
