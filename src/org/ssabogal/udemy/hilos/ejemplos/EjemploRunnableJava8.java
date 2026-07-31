package org.ssabogal.udemy.hilos.ejemplos;

public class EjemploRunnableJava8 {
    public static void main(String[] args) throws InterruptedException {

        Runnable backup = () -> {
            for(int i=0; i<10; i++){
                System.out.println("Proceso " + Thread.currentThread().getName() + " " + i*10 +"%");
                try {
                    Thread.sleep((long) (Math.random()*1000));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Proceso " + Thread.currentThread().getName() + " terminado...");
        };

        Thread h1 =  new Thread(backup, "Backup Mikrotik");
        Thread h2 = new Thread(backup, "Backup Servidor Windows");
        Thread h3 = new Thread(backup, "Backup UCM");

        h1.start();
        h2.start();
        h3.start();

        h1.join();
        h2.join();
        h3.join();
        System.out.println("Continuando con la ejecución del metodo main ...");
     }
}
