package org.ssabogal.udemy.colecciones.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    @Override
    public int compareTo(Alumno a) {
        if (a == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);

    }

    private String nombre;
    private Integer nota;


    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }


    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}
