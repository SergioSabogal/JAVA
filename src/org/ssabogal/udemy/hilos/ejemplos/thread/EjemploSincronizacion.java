package org.ssabogal.udemy.hilos.ejemplos.thread;

public class EjemploSincronizacion {
    public static void main(String[] args) {

        new Thread(new ImprimirFrases("Hola", " que tal?")).start();
        new Thread(new ImprimirFrases("gracias", " amigo")).start();
        new Thread(new ImprimirFrases("¿Quien eres", " tu?")).start();


    }

    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print (frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(frase2);
    }
}
