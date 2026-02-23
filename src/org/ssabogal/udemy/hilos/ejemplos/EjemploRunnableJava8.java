package org.ssabogal.udemy.hilos.ejemplos;

public class EjemploRunnableJava8 {
    public static void main(String[] args) {

        Runnable hilo = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Taras "+ Thread.currentThread().getName() + " "+ i + "%");
                try {
                    Thread.sleep((int)(Math.random()  * 1000));
                }catch (InterruptedException e){}
            }
            System.out.println("Ultima tarea :  " + Thread.currentThread().getName());
        };

        new Thread(hilo , "Backup").start();
        new Thread(hilo , "Restore").start();

    }
}
