package org.ssabogal.udemy.lambda;

import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {

        Consumer<String> consumidor = saludo -> {
            System.out.println(saludo);
        };
    }
}
