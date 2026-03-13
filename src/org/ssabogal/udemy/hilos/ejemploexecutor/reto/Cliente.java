package org.ssabogal.udemy.hilos.ejemploexecutor.reto;

public class Cliente implements Runnable {

    private String nombreServicio;
    private Servidor servidor;
    private int idCliente;
    int ultimoIdCliente;

    public Cliente(Servidor servidor, String nombreServicio) {
        this.nombreServicio = nombreServicio;
        this.servidor = servidor;
        this.idCliente = ultimoIdCliente;
        ultimoIdCliente++;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public int getIdCliente() {
        return idCliente;
    }

    @Override
    public void run() {
        servidor.conexionServicio(nombreServicio);
    }
}
