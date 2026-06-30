package org.ssabogal.udemy.hilos.mesadeayuda;

public class BandejaSoporte {
    private String ticket;
    private boolean available;


    public synchronized void generarTicket(String  ticket) {

        while (available){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        this.ticket = ticket;
        System.out.println("Ticket creado: " + ticket);
        this.available = true;

        notify();
    }


    public synchronized void resolverTicket() {
        while (!available){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Ticket resuelto: " + this.ticket );
        this.available = false;
        notify();
    }
}