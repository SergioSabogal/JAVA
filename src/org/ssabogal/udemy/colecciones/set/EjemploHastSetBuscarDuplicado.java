package org.ssabogal.udemy.colecciones.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHastSetBuscarDuplicado {
    public static void main(String[] args) {
        String[] peces = {"Corvina","Lenguado","Pejerrey","Atún","Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();

        for(String pez : peces){
            if(!unicos.add(pez)){
                System.out.println("Elemento duplicado: ");
                duplicados.add(pez);
            }
        }

        System.out.println("Elementos duplicados: "+duplicados);
        System.out.println("Elementos unicos: "+unicos);

        System.out.println("\nElementos originales: ");
        for(String pez : peces){
            System.out.print(pez+" ");
        }

    }
}
