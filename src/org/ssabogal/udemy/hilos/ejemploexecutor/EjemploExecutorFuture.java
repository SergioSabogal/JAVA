package org.ssabogal.udemy.hilos.ejemploexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();

        Runnable tarea = () -> {
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del Thread: "+ Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Fin de la tarea...");
        };

        Future<?> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con el metodo main ");

        System.out.println("Resultado: "+ resultado.isDone());

    }
}
