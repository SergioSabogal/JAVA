package org.ssabogal.udemy.hilos.ejemplos;

public class EjemploRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Runnable backup = () -> {
            for(int i=0; i<100; i++){
                System.out.println("Proceso " + Thread.currentThread().getName() + " " + i +"%");
                try {
                    Thread.sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Proceso " + Thread.currentThread().getName() + " terminado...");
        };

        new Thread(backup, "Backup Mikrotik").start();
        new Thread(backup, "Backup Servidor Windows").start();
        new Thread(backup, "Backup UCM").start();
     }
}
