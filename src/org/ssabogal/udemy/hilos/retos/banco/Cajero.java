package org.ssabogal.udemy.hilos.retos.banco;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cajero implements Runnable{

    private CuentaBancaria cuentaBancaria;
    private Object nextBoolean;
    public Cajero(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i< 10 ; i++){
            boolean resultado = random.nextBoolean();

            if (resultado){
                try {
                    cuentaBancaria.depositar(ThreadLocalRandom.current().nextInt(1000,350000));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }else if (!resultado){
                try {
                    cuentaBancaria.sacar(ThreadLocalRandom.current().nextInt(1000,250000));
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
