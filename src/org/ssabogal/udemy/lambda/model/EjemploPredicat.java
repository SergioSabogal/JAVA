package org.ssabogal.udemy.lambda.model;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class EjemploPredicat {
    public static void main(String[] args) {

        Predicate<Integer> test = num -> num > 10;
        boolean result = test.test(7);
        System.out.println(result);

        BiPredicate<Integer, Integer> total = (i,j) -> i>j;
        boolean result2 = total.test(7, 8);
        System.out.println(result2);

        Usuario a  = new Usuario();
        Usuario b = new Usuario();
        a.setNombre("Juan");
        b.setNombre("Catha");

        BiPredicate<Usuario, Usuario> t5 = (ua,ub) -> ua.getNombre().equals(ub.getNombre());
        boolean result3 = t5.test(a,b);
        System.out.println(result3);
    }
}
