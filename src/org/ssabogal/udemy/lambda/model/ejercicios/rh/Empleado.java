package org.ssabogal.udemy.lambda.model.ejercicios.rh;

public class Empleado {
        private String nombre;
        private String departamento;
        private double salario;

        public Empleado(String nombre, String departamento, double salario) {
            this.nombre = nombre;
            this.departamento = departamento;
            this.salario = salario;
        }

        public String getNombre() { return nombre; }
        public String getDepartamento() { return departamento; }
        public double getSalario() { return salario; }

        public void setSalario(double salario) { this.salario = salario; }

        @Override
        public String toString() {
            return nombre + " (" + departamento + ") - Salario: $" + salario;
        }
}
