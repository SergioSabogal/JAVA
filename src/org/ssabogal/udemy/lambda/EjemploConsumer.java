package org.ssabogal.udemy.lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };
        consumidor.accept("Hola mundo lambda");

        BiConsumer<String, Integer> biConsumer = (nombre, edad) -> {
            System.out.println("nombre de usuario: "+nombre + " edad:  " + edad);
        };

        biConsumer.accept("Sergio Sabogal", 25);
    }
}
