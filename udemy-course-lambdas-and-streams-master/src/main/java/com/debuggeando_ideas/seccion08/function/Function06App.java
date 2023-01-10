package com.debuggeando_ideas.seccion08.function;

import com.debuggeando_ideas.seccion08.function.Person;

import java.io.*;
import java.util.Arrays;
import java.util.function.Function;

public class Function06App {

    //Serializa un Objeto Persona en  0,1
    static Function<Person,ByteArrayOutputStream> serializer = person ->{
        ByteArrayOutputStream inMemoryBytes = new ByteArrayOutputStream();

        try(ObjectOutputStream outputStream = new ObjectOutputStream(inMemoryBytes)){
            outputStream.writeObject(person);
            outputStream.flush();
        }catch (IOException ioex){
            System.err.println(ioex.getMessage());
        }
        return  inMemoryBytes;
    };

    //Deserializa 0,1 en un Objeto Persona
    static Function<ByteArrayInputStream, Person> deserializer = byteArrayInputStream ->{
        try(ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)){
            return  (Person) objectInputStream.readObject();
        }catch (IOException | ClassNotFoundException ex){
            System.err.println(ex.getMessage());
            throw  new RuntimeException(ex.getMessage());
        }
    };



    public static void main(String[] args) {
        ByteArrayOutputStream objectSerializable = serializer.apply(new Person("Eliel", 44));
        System.out.println("Persona -> bytes ");
        System.out.println(Arrays.toString(objectSerializable.toByteArray()));

        System.out.println("bytes -> Persona");
        Person persona = deserializer.apply(new ByteArrayInputStream(objectSerializable.toByteArray()));
        System.out.println(persona);
    }

    public static void description(){
        System.out.println("-------------------------------------------------------------------------------------------------------");
        System.out.println("In Java 8, Function is a functional interface; it takes an argument (object of type T) \n" +
                " and returns an object (object of type R). The argument and output can be a different type.");
        System.out.println("6. serializer -> deserializer, deserializer -> serializer");
        System.out.println("-------------------------------------------------------------------------------------------------------");
    }
}
