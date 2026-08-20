package org.ssabogal.udemy.lambda.model.ejercicios.rh;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        int bonoFijo = 800;
        double bonoPorcentaje = 0.25;
        GestorRH gestorRH = new GestorRH();
        List<Empleado> empleados = new ArrayList<>();


        empleados.add(new Empleado("Sergio Sabogal", "Sistemas", 3500.45));
        empleados.add(new Empleado("Bibiana Gamboa", "Compras", 3800.45));
        empleados.add(new Empleado("Jhon Jairo", "Sistemas", 1500.45));
        empleados.add(new Empleado("Carlos Murillo", "Calidad", 1800.45));
        empleados.add(new Empleado("Cathalina Diaz", "Logistica", 1930.45));
        empleados.add(new Empleado("Maritza Arevalo", "Ventas", 1500.45));


        Predicate<Empleado> consultarBonoSalario = salario -> 2000 > salario.getSalario();
        Predicate<Empleado> consultarArea = empleado -> empleado.getDepartamento().equals("Sistemas");

        Consumer<Empleado> aplicarBonoFijo = empleado -> {
            empleado.setSalario(empleado.getSalario() + bonoFijo);
        };

        Consumer<Empleado> aplicarBonoPorcentaje = empleado -> {
            empleado.setSalario(empleado.getSalario() + empleado.getSalario() * bonoPorcentaje);
        };

        gestorRH.aplicarbono(empleados, consultarArea, aplicarBonoPorcentaje);
        gestorRH.aplicarbono(empleados, consultarBonoSalario, aplicarBonoFijo);



    }
}
