package org.ssabogal.udemy.colecciones.reto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.ssabogal.udemy.colecciones.reto.util.FileUtils.cargarVuelos_csv;

public class Main {

    public static void main(String[] args){
        List<Vuelo> vuelos = new ArrayList<> (cargarVuelos_csv());
        List<Vuelo> vueloList = new ArrayList<> (vuelos);

        System.out.println("Vuelo por orden de llegadas");
        vueloList.sort(Comparator.comparing(Vuelo::getFechaLlegada).thenComparing(Vuelo::getHora_llegada));
        vueloList.forEach(System.out::println);

        System.out.println();
        System.out.println("Ultimo vuelo en llegar");
        System.out.println(vueloList.getLast());
        System.out.println();

        vueloList.sort(Comparator.comparing(Vuelo::getNumeroPasaderos));
        System.out.println("Vuelo con menor numero de pasajeros");
        System.out.println(vueloList.getFirst());

    }



}
