package org.ssabogal.udemy.hilos.ejemplos.thread;

public class ExtenderThread {
    public static void main(String[] args) {

        Thread backup = new NombreThread("Backup 2026");
        backup.start();


        NombreThread tarea = new NombreThread("Revisión automatica");
        tarea.start();


        Thread hilo = new NombreThread("Hilo 1");
        hilo.start();

    }
}
