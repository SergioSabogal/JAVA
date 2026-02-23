package org.ssabogal.udemy.hilos.ejemplos;

public class EjemploRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Runnable hilo = () -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Taras "+ Thread.currentThread().getName() + " "+ i + "%");
                try {
                    Thread.sleep((int)(Math.random()  * 1000));
                }catch (InterruptedException e){}
            }
            System.out.println("Ultima tarea :  " + Thread.currentThread().getName());
        };

       Thread h1 =  new Thread(hilo , " Backup");
       Thread h2 = new Thread(hilo , " Restore");
        Thread h3 = new Thread(hilo, " Actualización");

        h1.start();
        h2.start();
        h3.start();

        h1.join();
        h2.join();
        h3.join();

        System.out.println("Continuando con la ejecución del metodo");
     }
}
