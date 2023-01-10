package com.debuggeando_ideas.seccion03.class_anonymous;

import java.util.List;

public interface DatabaseService<T> {

    T getById(Long id);
    List<T> getAllRecords();

}
