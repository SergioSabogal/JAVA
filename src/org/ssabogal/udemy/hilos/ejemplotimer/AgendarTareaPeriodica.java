package org.ssabogal.udemy.hilos.ejemplotimer;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class AgendarTareaPeriodica {
    public static void main(String[] args) {

        Timer timer = new Timer();


        AtomicInteger i = new AtomicInteger(5);
        timer.schedule(new TimerTask() {

            @Override
            public void run() {

                int contador = i.getAndDecrement();

                if (contador > 1) {
                    System.out.println(contador);
                }else {
                    System.out.println("Tarea finalizada.");
                    timer.cancel();

                }
            }
        }, 5000, 3000);

        System.out.println("Tarea periodica en ejecución");

    }
}
