package org.ssabogal.udemy.hilos.retos.reto1;

public class ImprimeLetras extends Thread{
    @Override
    public void run() {
        for(char i = 'a'; i <= 'z'; i++){
            System.out.println(i + " ->" + Thread.currentThread().getName());
        }
    }
}
