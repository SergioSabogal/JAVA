package org.ssabogal.udemy.colecciones.set;

import org.ssabogal.udemy.colecciones.modelo.Alumno;

import java.util.ArrayList;
import java.util.List;

public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        al.add(new Alumno("Sergio Sabogal", 75));
        al.add(new Alumno("Hector Padilla", 175));


    }
}
