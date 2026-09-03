package org.ssabogal.udemy.api.stream.ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        System.out.println("**************");
        System.out.println("\n\n\nMETODO 1");
git         Stream<String> nombres = Stream.of("RECUPERADOS","MANTENIMIENTO","LAMINA","PRODUCCION");
        nombres.forEach(System.out::println);

        System.out.println("**************");
        System.out.println("\n\n\nMETODO 2");
        Stream<String> areas = Stream.<String>builder()
                .add("Fibra")
                .add("ETIQUETA")
                .add("PELETIZADO")
                .build();
        areas.forEach(System.out::println);


        System.out.println("**************");
        System.out.println("\n\n\nMETODO 3");
        List<String> lista = new ArrayList<>();
        lista.add("SISTEMAS");
        lista.add("ADMINISTRACION");


        Stream<String> streamList = lista.stream();
        lista.forEach(System.out::println);


        System.out.println("**************");
        System.out.println("\n\n\nMETODO 4");
        System.out.println("");
        lista.stream().forEach(System.out::println);

    }
}
