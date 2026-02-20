package org.ssabogal.udemy.hilos.ejemplos;

public class ExtenderThread {
    public static void main(String[] args) {

        Thread hilo = new NombreThread("Backup...");
        hilo.start();

        System.out.println("Hilo iniciado");
        System.out.println(hilo.getState());

        System.out.println("Hilo finalizado");
    }
}
