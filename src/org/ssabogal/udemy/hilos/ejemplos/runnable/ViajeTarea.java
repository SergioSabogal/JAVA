package org.ssabogal.udemy.hilos.ejemplos.runnable;

import java.util.Random;

public class ViajeTarea implements Runnable{

    String nombre;
    public ViajeTarea(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void run() {
         for (int i = 0; i < 10; i++){
             System.out.println(i+ ". Tarea :" + this.nombre);

             try{
                 Thread.sleep((int)(Math.random()*1000));
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
         }
        System.out.println("Finalizanda tarea " + this.nombre);
    }
}
