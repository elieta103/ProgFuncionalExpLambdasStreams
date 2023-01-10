package com.debuggeando_ideas.seccion15.lambdas.applications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambdas04 {
    public static void main(String[] args) {

        //  NUMEROS
        List<Integer> listNumbers = Arrays.asList(4, 3, 6, 8, 7, 5, 8, 10);
        //listNumbers.sort( (x1, x2) ->  x1 - x2 ); // Mayor a menor ( 4-3 > 0 ) (+++++)
        listNumbers.sort( (x1, x2) ->  x2 - x1 );   // Menor a Mayor ( 3-4 > 0 ) (-----)

        System.out.println(listNumbers);


        // CADENAS
        List<String> listString = Arrays.asList("Max", "Alex", "Opal", "Maria", "Mario");
        //listString.sort((str1,str2)-> str1.compareTo(str2) ); //  A-Z
        listString.sort(String::compareTo); //  A-Z
        System.out.println(listString);
        listString.sort(Comparator.reverseOrder());
        System.out.println(listString);

        //OBJETOS
        List<Person> persons = Arrays.asList(new Person("Robert", 31),
                new Person("Andy", 32),
                new Person("John", 32),
                new Person("Peter", 27));

        //Por la edad
        persons.sort(Comparator.comparingInt(Person::getAge).thenComparing(Person::getAge) );
        System.out.println(persons);


    }

@Data
@AllArgsConstructor
@ToString
static class Person{
        private String name;
        private Integer age;
}

}
