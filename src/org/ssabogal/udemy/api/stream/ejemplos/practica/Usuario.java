package org.ssabogal.udemy.api.stream.ejemplos.practica;

public class Usuario {
    private String nombre;
    private String apellido;
    private short  edad;

    public Usuario() {
    }

    public  Usuario(String nombre, String apellido, short edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad  =edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                '}';
    }
}
