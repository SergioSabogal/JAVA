package org.ssabogal.udemy.colecciones.set;

import org.ssabogal.udemy.colecciones.modelo.Alumno;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploHashSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> alumnoSet = new HashSet<>();

        alumnoSet.add(new Alumno("Sergio Sabogal", 45));
        alumnoSet.add(new Alumno("Julian Alvarez", 85));
        alumnoSet.add(new Alumno("Raul Jimenez", 60));
        alumnoSet.add(new Alumno("Cristiano Ronaldo", 100));

        System.out.println(alumnoSet);
    }
}
