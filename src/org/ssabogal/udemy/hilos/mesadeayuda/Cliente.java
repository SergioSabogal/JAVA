package org.ssabogal.udemy.hilos.mesadeayuda;

import org.ssabogal.udemy.hilos.ejemplosync.Panaderia;

import java.util.concurrent.ThreadLocalRandom;

public class Cliente implements Runnable{

    private BandejaSoporte bandejaSoporte;

    public Cliente(BandejaSoporte bandejaSoporte){
        this.bandejaSoporte = bandejaSoporte;

    }

    @Override
    public void run() {
        for (int i =0; i<10; i++){
            bandejaSoporte.generarTicket("SH-".concat(String.valueOf(i)));

            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(0,1000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
