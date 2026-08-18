package org.ssabogal.udemy.lambda.model.ejercicios;

public class Tarea {
    private int tareaId;
    private String descripcion;
    private Prioridad prioridad;
    private boolean completada;

    public Tarea(int tareaId, Prioridad prioridad, String descripcion, boolean completada) {
        this.tareaId = tareaId;
        this.prioridad = prioridad;
        this.descripcion = descripcion;
        this.completada = completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    public int getTareaId() {
        return tareaId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public boolean isCompletada() {
        return completada;
    }

    @Override
    public String toString() {
        return "Resumen\n" +
                "tareaId: " + tareaId +
                "descripcion: " + descripcion +
                "completada: " + completada;
    }
}
