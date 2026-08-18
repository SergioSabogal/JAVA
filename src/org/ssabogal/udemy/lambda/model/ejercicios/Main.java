package org.ssabogal.udemy.lambda.model.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        GestorTarea gestorTarea = new GestorTarea();
        List<Tarea> tareas =  new ArrayList<>();
        tareas.add(new Tarea(1, Prioridad.ALTA, "Soporte tecnico servicio de internet caido", false));
        tareas.add(new Tarea(2, Prioridad.BAJA, "Teclado fallando", false));
        tareas.add(new Tarea(3, Prioridad.ALTA, "Caida del servidor", false));
        tareas.add(new Tarea(4, Prioridad.ALTA, "Reporte ISOWIN", false));
        tareas.add(new Tarea(5, Prioridad.MEDIA, "Falla concurrente en la red", false));
        tareas.add(new Tarea(6, Prioridad.BAJA, "PC lento", false));
        tareas.add(new Tarea(7, Prioridad.ALTA, "Copia de seguridad faltante", false));





        /*
        *1. Marcar como completada todas las taeas con prioridad alta
        * 2.Imprimir el detalle de las tareas pendientes
        * 3.Construir una lista de resumenes, con texto
        *  */


        //Consumidor que competara las tareas con prioridad alta


        Consumer<Tarea> completarAltas = tarea -> {
            if (tarea.getPrioridad() == Prioridad.ALTA) {
                tarea.setCompletada(true);
            }
        };


        Consumer<Tarea> detallePendientes = tarea -> {
            if(!tarea.isCompletada()){
                System.out.println(tarea);
            }
        };


        List<String> resumen = new ArrayList<>();
        Consumer<Tarea> resumenTareas= tarea -> {
            if(tarea.isCompletada()){
                resumen.add(tarea.toString().concat(" COMPLETADA"));
            }
        };


        gestorTarea.procesarTarea(tareas, completarAltas);
        gestorTarea.procesarTarea(tareas, detallePendientes);
        gestorTarea.procesarTarea(tareas, resumenTareas);

        for(String r: resumen){
            System.out.println(r);
        }

    }
}
