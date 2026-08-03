package org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.runnable;

import org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.Panaderia;

public class Panadero implements  Runnable {

    private Panaderia panaderia;

    public Panadero(Panaderia panaderia) {
        this.panaderia = panaderia;
    }

    @Override
    public void run() {
        for (int i = 1 ; i < 10 ; i++) {
            panaderia.hornear("Pan de maiz");
        }
    }
}
