package org.ssabogal.udemy.lambda.model.ejercicios.auditoriot;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GestorCalidad {
// La Clase gestor de calidad, se encarga de ser el motor para la verifiacio de la lgica planteada para cada objeto

    public void auditarLote(List<Dispositivo> dispositivosList, Predicate<Dispositivo> verificador, Consumer<Dispositivo> ejecutorDeAcciones){
        dispositivosList.forEach(dispositivo -> {
            if(verificador.test(dispositivo)){
                ejecutorDeAcciones.accept(dispositivo);

                System.out.println(dispositivo);
            }
        });
    }

}
