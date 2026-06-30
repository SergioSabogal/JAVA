package org.ssabogal.udemy.hilos;

import org.ssabogal.udemy.hilos.ejemplosync.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args){

        new Thread(new ImprimirFrases("Hola ", "que tal!")).start();
        new Thread(new ImprimirFrases("¿Quien eres", "tu ? ")).start();
        new Thread(new ImprimirFrases("Muchas ", "gracias, adios")).start();

    }

    public synchronized static void imprimirFraces(String frase1, String frase2) throws InterruptedException {

        System.out.println(frase1);
        Thread.sleep(500);
        System.out.println(frase2);
    }
}
