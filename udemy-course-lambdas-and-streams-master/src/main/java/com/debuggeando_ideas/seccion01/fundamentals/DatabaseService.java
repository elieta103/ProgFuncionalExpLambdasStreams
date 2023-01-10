package com.debuggeando_ideas.seccion01.fundamentals;

import java.util.List;

public interface DatabaseService {

    String getById(Long id);
    List<String> getAllRecords();

}
