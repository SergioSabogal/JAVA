package org.ssabogal.udemy.hilos.timer2;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTarea {
    public static void main(String[] args) {

        Timer timer = new Timer();
        Timer timerPeriodic = new Timer();
        AtomicInteger counter = new AtomicInteger(3);


        timer.schedule(new
                TimerTask() {
                    @Override
                    public void run() {
                        System.out.println("Ejecución de backup: "+ Thread.currentThread().getName());
                        System.out.println();
                        System.out.println("Backup finalizada: "+ Thread.currentThread().getName());
                        System.out.println("\n\n");
                        timer.cancel();
                    }
                },5000
        );


        //Tarea periodica
        timerPeriodic.schedule(new TimerTask() {
            @Override
            public void run() {
                int contador = counter.decrementAndGet();
                if(counter.get() > 0){
                    System.out.println("Tarea periodica se ejecutara diaria..." +  Thread.currentThread().getName()+ " fecha: "+ new Date());
                }else {
                    System.out.println("Tarea finalizada: "+ Thread.currentThread().getName()+ " fecha: "+ new Date());
                    System.out.println("\n\n");
                    timerPeriodic.cancel();
                }

            }
        },0, 5000);

        System.out.println("Tarea Agendada en 5 segundos");

    }
}
