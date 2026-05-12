package org.ssabogal.udemy.colecciones.reto;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo implements Comparable<Vuelo>{
    private String vuelo;
    private String origen;
    private String destino;
    private LocalDate fechaLlegada;
    private LocalTime hora_llegada;
    private int numeroPasaderos;

    public Vuelo(String vuelo, String origen, String destino, LocalDate fechaLlegada, LocalTime hora_llegada, int numeroPasaderos){
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.hora_llegada = hora_llegada;
        this.numeroPasaderos = numeroPasaderos;
    }

    public String getVuelo() {
        return vuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public LocalTime getHora_llegada() {
        return hora_llegada;
    }

    public int getNumeroPasaderos() {
        return numeroPasaderos;
    }


    @Override
    public String toString() {
        return  " vuelo: " + vuelo +
                " origen: " + origen +
                " destino: " + destino +
                " fechaLlegada: " + fechaLlegada +
                " hora_llegada: " + hora_llegada +
                " numeroPasaderos: " + numeroPasaderos;
    }

    @Override
    public int compareTo(Vuelo o) {
        if (this.numeroPasaderos < o.numeroPasaderos){
            return -1;
        }else if (this.numeroPasaderos > o.numeroPasaderos){
            return 1;
        }
        return 0;
    }
}
