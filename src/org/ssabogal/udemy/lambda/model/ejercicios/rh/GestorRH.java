package org.ssabogal.udemy.lambda.model.ejercicios.rh;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class GestorRH {

    public void aplicarbono(List<Empleado> listaEmpleados, Predicate<Empleado> comprobacion, Consumer<Empleado> aplicacionDeBono){
        listaEmpleados.forEach(empleado -> {
            if(comprobacion.test(empleado)){
                aplicacionDeBono.accept(empleado);

                System.out.println("Empleado: "+empleado.getNombre()+"\nSalario aplicado: " + empleado.getSalario());
            }else {
                System.out.println(empleado + " no es posible aplicar al bono este mes ");
            }
        });
    }
}
