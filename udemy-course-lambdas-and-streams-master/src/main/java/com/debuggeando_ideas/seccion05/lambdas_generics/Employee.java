package com.debuggeando_ideas.seccion05.lambdas_generics;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class Employee {

    private String dni;
    private String name;
    private Double salary;

}
