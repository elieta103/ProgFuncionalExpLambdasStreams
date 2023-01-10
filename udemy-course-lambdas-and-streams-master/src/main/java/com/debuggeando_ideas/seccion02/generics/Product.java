package com.debuggeando_ideas.seccion02.generics;

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
