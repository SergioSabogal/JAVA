package org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.runnable;

import org.ssabogal.udemy.hilos.ejemplos.thread.ejemplosyn.Panaderia;

public class ConsumidorPanaderia {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();

        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();

    }
}
