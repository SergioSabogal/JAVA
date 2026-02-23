package org.ssabogal.udemy.hilos.ejemplos;

import org.ssabogal.udemy.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploRunnable {
    public static void main(String[] args) {

        Thread backup = new Thread(new ViajeTarea("Proceso"));
        Thread hilo = new Thread(new ViajeTarea("Actualización de datos"));

        backup.start();
        hilo.start();



    }
}
