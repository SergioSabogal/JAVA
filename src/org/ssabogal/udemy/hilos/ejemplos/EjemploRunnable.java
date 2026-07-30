package org.ssabogal.udemy.hilos.ejemplos;

import org.ssabogal.udemy.hilos.ejemplos.runnable.ViajeTarea;

public class EjemploRunnable {
    public static void main(String[] args) {

       new Thread(new ViajeTarea("Colombia")).start();
       new Thread(new ViajeTarea("España")).start();
       new Thread(new ViajeTarea("Uruguay")).start();




    }
}
