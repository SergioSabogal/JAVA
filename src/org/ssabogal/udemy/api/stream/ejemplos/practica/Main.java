package org.ssabogal.udemy.api.stream.ejemplos.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    /*
    * Como pasar de cualquier tipo de dato a una instanca, es decir realizar lecturas e instancias,
    * ejemplos; tomar datos de consola y mediante un Stram hacerles un tratamiento especial y luego publicar la lista de usuarios
    *
    * */

    public static void main(String[] args) {

        List<Usuario> usuarios = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numeroUsuarios;

        System.out.println("Ingrese el numero de usuarios que desea agregar...  \n");
        numeroUsuarios = sc.nextInt();

        for(int i = 0 ; i < numeroUsuarios; i++ ){
            Interfaz.IngresarUsuario(usuarios);
        }


        Stream<String> procesador = usuarios.stream()
                .map(usuario -> {
                    String nombre = usuario.getNombre().toUpperCase();
                    usuario.setNombre(nombre);
                    String apellido = usuario.getApellido().toLowerCase();
                    usuario.setApellido(apellido);

                })
                .peek(System.out::println);

    }


}
