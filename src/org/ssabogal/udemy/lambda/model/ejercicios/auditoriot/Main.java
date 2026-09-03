package org.ssabogal.udemy.lambda.model.ejercicios.auditoriot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Dispositivo>  loteDispositivos = new ArrayList<>();
        GestorCalidad gestorCalidad = new GestorCalidad();

        loteDispositivos.add(new Dispositivo("SN-001", "Smartphone", 85, false));
        loteDispositivos.add(new Dispositivo("SN-002", "Tablet", 15, false));
        loteDispositivos.add(new Dispositivo("SN-003", "Smartphone", 100, true));
        loteDispositivos.add(new Dispositivo("SN-004", "Tablet", 60, false));
        loteDispositivos.add(new Dispositivo("s10121", "Smartphone", 85, false));
        loteDispositivos.add(new Dispositivo("s10121", "Smartphone", 85, false));
        loteDispositivos.add(new Dispositivo("s10121", "Smartphone", 85, false));


        Predicate<Dispositivo> revisionBateria = dispositivo  -> 20 > dispositivo.getPorcentajeBateria() ;
        Consumer<Dispositivo> cargarBateria = dispositivo -> dispositivo.setEstadoActual("Mandar a Recargar");
        Predicate<Dispositivo> defectosFisicos = Dispositivo::isTieneFalloFisico;
        Consumer<Dispositivo> darDeBaja =  dispositivo -> dispositivo.setEstadoActual("RECHAZADO - DESTRUIR");
        Predicate<Dispositivo> revisionFinal = dispositivo ->  !dispositivo.isTieneFalloFisico() && dispositivo.getPorcentajeBateria() > 20;
        Consumer<Dispositivo> verificadoFinal = dispositivo -> dispositivo.setEstadoActual("APROBADO PARA VENTA");


        Runnable tareaAuditoria = () -> {
            try {
                System.out.println("Inicio tarea de auditoria....");
                Thread.sleep(1500);
                gestorCalidad.auditarLote(loteDispositivos, revisionBateria, cargarBateria);
                Thread.sleep(1500);
                gestorCalidad.auditarLote(loteDispositivos, defectosFisicos, darDeBaja);
                Thread.sleep(1500);
                gestorCalidad.auditarLote(loteDispositivos, revisionFinal, verificadoFinal);

                System.out.println("Auditoria finalizada...  !");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };


        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(tareaAuditoria);

        executor.shutdown();










        System.out.println("\n\n\n RESULTADO DE AUDITORIAS");
        loteDispositivos.forEach(System.out::println);

    }
}
