package org.ssabogal.udemy.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class AgendarTarea {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en " +  new Date() + " nombre del hilo: "
                + Thread.currentThread().getName());

                System.out.println("Finaliza el tiempo");
                timer.cancel();
            }
        } , 5000 );
    }
}
