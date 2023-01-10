package com.debuggeando_ideas.seccion01.fundamentals;

import java.util.List;

public class MongoDB implements  DatabaseService{
    @Override
    public String getById(Long id) {
        return "Getting data from MongoDB with id : "+id;
    }

    @Override
    public List<String> getAllRecords() {
        return List.of("From", "MongoDB");
    }
}
