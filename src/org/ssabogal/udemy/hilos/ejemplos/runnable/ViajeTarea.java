package org.ssabogal.udemy.hilos.ejemplos.runnable;

import java.util.Random;

public class ViajeTarea implements Runnable{

    private String nombre;

    public ViajeTarea(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println(i + ". "+  this.nombre);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Fialmente... : "+ this.nombre);
    }
}
