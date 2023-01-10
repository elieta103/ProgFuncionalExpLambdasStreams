package com.debuggeando_ideas.seccion02.generics;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();

}
