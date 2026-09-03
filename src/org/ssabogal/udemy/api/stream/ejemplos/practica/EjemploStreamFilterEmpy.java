package org.ssabogal.udemy.api.stream.ejemplos.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpy {
    public static void main(String[] args) {

        long count = Stream.of("Sergio Sabogal", "Bibiana Gamboa","Cathalina Diaz","Claudia Lozano")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();
        System.out.println("Count =" + count);


    }
}
