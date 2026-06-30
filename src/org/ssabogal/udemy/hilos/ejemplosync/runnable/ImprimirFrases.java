package org.ssabogal.udemy.hilos.ejemplosync.runnable;

import static org.ssabogal.udemy.hilos.EjemploSincronizacionThread.imprimirFraces;

public class ImprimirFrases implements Runnable{
    String frase1;
    String frase2;

    public ImprimirFrases(String frase1, String frase2) {
        this.frase1 = frase1;
        this.frase2 = frase2;
    }

    @Override
    public void run() {
        try {
            imprimirFraces(this.frase1, this.frase2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
