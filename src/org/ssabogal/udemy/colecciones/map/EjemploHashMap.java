package org.ssabogal.udemy.colecciones.map;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Sergio");
        persona.put("Apellido", "Padilla");
        persona.put("ApellidoPatero","Doe");
        persona.put("ApellidoMaterno", "Materno");
        persona.put("Email","email@correo.com");
        persona.put("Telefono","456789");


        System.out.println("Persona: " + persona);


        persona.remove("ApellidoPatero");
        System.out.println("Persona: " + persona);



    }
}
