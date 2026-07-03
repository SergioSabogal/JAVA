package org.ssabogal.udemy.hilos.retos.reto1;

public class ImprimeNumeros extends Thread{

    @Override
    public void run() {
        for (int i = 1; i <= 26; i++) {
            System.out.println(i + " -> " + Thread.currentThread().getName());
        }
    }
}
