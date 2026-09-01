package org.ssabogal.udemy.hilos.retos.entendimiento.servidor;

public class Servidor {
    public static void main(String[] args) {
        System.out.println("Inicio de hilo principal...");


        Thread monitore = new Thread(
                () -> {
                    try {
                        Thread.sleep(500);
                        System.out.println("Inicio de  monitoreo ...");
                        Thread.sleep(3500);
                        System.out.println("Monitoreando servidor...");
                        Thread.sleep(2500);
                        System.out.println("Monitoreo Terminaddo");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
        );

        monitore.start();
        System.out.println("Continuando con el proceso actual...");
    }
}
