package org.ssabogal.udemy.hilos.ejemploexecutor;

import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class PrubaDeUsoExecutor {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable backup = () -> {
            System.out.println("Inicio de backup de sistema");

                try {
                    for (int i = 0; i < 100; i+= 13 ) {
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Pocentaje de carga : " +i + "% ");
                    }

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            System.out.println("Fin de backup de sistema");
        };

        executor.submit(backup);
        executor.shutdown();
        System.out.println("Estado terminado: " +  executor.awaitTermination(2, TimeUnit.SECONDS));

    }
}
