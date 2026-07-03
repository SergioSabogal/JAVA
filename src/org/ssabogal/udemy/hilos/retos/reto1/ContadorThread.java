package org.ssabogal.udemy.hilos.retos.reto1;

public class ContadorThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("ContadorThread: "+i + Thread.currentThread().getName());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
