package com.debuggeando_ideas.seccion03.class_anonymous;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@NoArgsConstructor
public class Product {

    private Long id;
    private String name;
    private Double price;

}
