package org.ssabogal.udemy.colecciones.set;

import org.ssabogal.udemy.colecciones.modelo.Alumno;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EjemploIterar {
    public static void main(String[] args) {

        Set<Alumno> listadoAlumnos = new HashSet<>();
        listadoAlumnos.add(new Alumno("Maritza Arevalo", 75));
        listadoAlumnos.add(new Alumno("Juan Mendez", 175));
        listadoAlumnos.add(new Alumno("Aurora Murillo", 67));
        listadoAlumnos.add(new Alumno("Camila Romero", 256));
        listadoAlumnos.add(new Alumno("Sergio Sabogal", 19));
        listadoAlumnos.add(new Alumno("Mateo Castiblanco", 175));




        // Iterando con un ForEach
        System.out.println("Iterando con un for each");
        for(Alumno alumno : listadoAlumnos){
            System.out.println(alumno.getNombre());
        }

        System.out.println("\n\nIterando con ForEach");
        listadoAlumnos.forEach(a -> System.out.println(a.getNombre()));

        System.out.println("\n\nIterando con Foreach Y expresiones lamnda");
        listadoAlumnos.forEach(System.out::println);

        System.out.println("\n\nIterando con un iterator");
        Iterator<Alumno> it = listadoAlumnos.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getNombre());
        }


    }


}
