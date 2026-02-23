package org.ssabogal.udemy.hilos.ejemplos.thread;

import java.time.LocalDateTime;

public class NombreThread extends Thread{
    public NombreThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for(int i=0;i<10;i++){
            System.out.println(i + this.getName());
        }
        System.out.println("Proceso de "+this.getName()+" finalizado: " + LocalDateTime.now() );
    }
}
