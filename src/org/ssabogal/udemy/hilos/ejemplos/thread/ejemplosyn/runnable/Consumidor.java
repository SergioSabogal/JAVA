package org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.runnable;

import org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.Panaderia;

public class Consumidor implements Runnable {

    private Panaderia panaderia;

    public Consumidor(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 1 ; i < 10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            panaderia.consumir();
        }
    }
}
