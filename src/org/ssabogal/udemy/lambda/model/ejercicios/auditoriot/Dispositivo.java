package org.ssabogal.udemy.lambda.model.ejercicios.auditoriot;

public class Dispositivo {
    private String serial;
    private String tipo; // "Smartphone" o "Tablet"
    private int porcentajeBateria;
    private boolean tieneFalloFisico;
    private String estadoActual;

    public Dispositivo(String serial, String tipo, int porcentajeBateria, boolean tieneFalloFisico) {
        this.serial = serial;
        this.tipo = tipo;
        this.porcentajeBateria = porcentajeBateria;
        this.tieneFalloFisico = tieneFalloFisico;
        this.estadoActual = "EN REVISIÓN"; // Estado por defecto
    }

    public String getSerial() { return serial; }
    public String getTipo() { return tipo; }
    public int getPorcentajeBateria() { return porcentajeBateria; }
    public boolean isTieneFalloFisico() { return tieneFalloFisico; }

    public String getEstadoActual() { return estadoActual; }
    public void setEstadoActual(String estadoActual) { this.estadoActual = estadoActual; }

    @Override
    public String toString() {
        return tipo + " [" + serial + "] - Batería: " + porcentajeBateria + "% - Fallo: " + tieneFalloFisico + " -> ESTADO: " + estadoActual;
    }
}