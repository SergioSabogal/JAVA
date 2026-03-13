package org.ssabogal.udemy.hilos.ejemploexecutor.reto;

public class Main {
    public static void main(String[] args) {

        Servidor servidorErp = new Servidor();

        Thread t1 = new Thread(new Cliente(servidorErp, "Servicio de copia de seguridad"));
        Thread t2 = new Thread(new Cliente(servidorErp, "Servicio de consulta BD"));
        Thread t3 = new Thread(new Cliente(servidorErp, "Servicio de escritorio remoto"));

        t1.start();
        t2.start();
        t3.start();
    }
}
