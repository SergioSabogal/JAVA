package org.ssabogal.udemy.hilos.mesadeayuda;

public class Main {
    public static void main(String[] args) {

        BandejaSoporte bs = new BandejaSoporte();

        new Thread(new Tecnico(bs)).start();
        new Thread(new Cliente(bs)).start();

    }
}
