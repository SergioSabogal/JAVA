package org.ssabogal.udemy.hilos.ejemploexecutor.reto;

import java.util.Random;

public class Servidor {
    public synchronized void conexionServicio(String servicio) {


        System.out.println("Servicio conectado con : " + servicio);

        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Servicio finalizado con : "  + servicio);
    }
}
