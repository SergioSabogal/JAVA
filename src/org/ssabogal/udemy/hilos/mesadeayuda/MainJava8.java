package org.ssabogal.udemy.hilos.mesadeayuda;

import java.util.concurrent.ThreadLocalRandom;

public class MainJava8 {
    public static void main(String[] args) {

        BandejaSoporte bs = new BandejaSoporte();

        new Thread( () ->{
            for(int i = 0; i < 10; i++){
                bs.resolverTicket();
            }
        }).start();


        new Thread( () -> {
            for (int i =0; i<10; i++){
                bs.generarTicket("SH-".concat(String.valueOf(i)));

                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(0,1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}
