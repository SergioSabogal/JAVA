package org.ssabogal.udemy.lambda.model.ejercicios;

import java.util.List;
import java.util.function.Consumer;

public class GestorTarea{

    public void procesarTarea(List<Tarea> tareas, Consumer<Tarea> procesador){
        for (Tarea tarea : tareas) {
            procesador.accept(tarea);
        }
    }
}
