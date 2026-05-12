package org.ssabogal.udemy.colecciones.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHastSetAgregar {
    public static void main(String []args){

        Set<String> hs = new HashSet<>();
        hs.add("uno");
        hs.add("dos");
        hs.add("tres");
        hs.add("cuatro");
        hs.add("cinco");

        System.out.println(hs);
    }
}
 