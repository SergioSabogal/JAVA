package org.ssabogal.udemy.hilos.mesadeayuda;

import org.ssabogal.udemy.hilos.ejemplosync.Panaderia;

public class Tecnico implements Runnable{

    private BandejaSoporte bandejaSoporte;

    public Tecnico(BandejaSoporte bandejaSoporte){
        this.bandejaSoporte = bandejaSoporte;
    }



    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            bandejaSoporte.resolverTicket();
        }
    }
}
