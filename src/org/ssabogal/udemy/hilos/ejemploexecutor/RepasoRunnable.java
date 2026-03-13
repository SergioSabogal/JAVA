package org.ssabogal.udemy.hilos.ejemploexecutor;

public class RepasoRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Inicio backup");
        try {
            for(int i=0;i<100;i+=11){
                System.out.println("Porcentaje de carga... "+i+"%");
            }
            Thread.sleep(500);
            System.out.println("Porcentaje de carga 100%");
            System.out.println("Backup finalizado");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hilo:  "+Thread.currentThread().getName() );
    }

    public static void main(String[] args) {


        System.out.println("Creacion de hilo");
        Thread t = new Thread(new RepasoRunnable());
        t.start();
        System.out.println("Continuar con proceso main");
    }
}
