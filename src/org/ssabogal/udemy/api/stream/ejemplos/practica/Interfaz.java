package org.ssabogal.udemy.api.stream.ejemplos.practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfaz {

    public static void IngresarUsuario(List<Usuario> usuariosList){
        Scanner sc = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>(usuariosList) ;
        Usuario usuario = new Usuario();
        System.out.println("\nIngrese el primer nombre: ");
        usuario.setNombre(sc.nextLine());


        System.out.println("\nEscriba su primer apellido para el usuaio  " + usuario.getNombre());
        usuario.setApellido(sc.nextLine());


        System.out.println("Ingrese la edad para " + usuario.getNombre() + " " + usuario.getApellido() + " ");
        usuario.setEdad(Short.parseShort(sc.nextLine()));

        System.out.println("\n\n\n");
        System.out.println("***********************");
        System.out.println("Datos de usuario \n");
        System.out.println(usuario);


        System.out.println("Desea crearlo ? Y/N");
        if(sc.nextLine().toUpperCase().equals("Y")){
            usuarios.add(usuario);
        }


    }

}


