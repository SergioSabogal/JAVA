package org.ssabogal.udemy.colecciones.reto;

import java.text.DateFormat;

public class Vuelo {
    private String vuelo;
    private String origen;
    private String destino;
    private DateFormat fechaLlegada;
    private DateFormat hora_llegada;
    private int numeroPasaderos;

    public Vuelo(String vuelo, String origen, String destino, DateFormat fechaLlegada, DateFormat hora_llegada, int numeroPasaderos){
        this.vuelo = vuelo;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.hora_llegada = hora_llegada;
        this.numeroPasaderos = numeroPasaderos;
    }

}
