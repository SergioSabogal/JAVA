package org.ssabogal.udemy.colecciones.reto.util;

import org.ssabogal.udemy.colecciones.reto.Vuelo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FileUtils {
    public static final String SEPARADOR_LINEA = ",";
    public static final String FILE_NAME = "C:\\Users\\Usuario Acebri.P-0032\\Desktop\\JAVA\\JAVA\\src\\org\\ssabogal\\udemy\\colecciones\\reto\\util\\vuelos.csv";

    public static List<Vuelo> cargarVuelos_csv(){
        List<Vuelo> listVuelos = new ArrayList<>();

        try{
            List<String> lineas = Files.readAllLines(Paths.get(FILE_NAME));

            lineas.forEach(line -> {
                String[] datos = line.split(SEPARADOR_LINEA);

                if(datos.length == 6){
                    String vuelo = datos[0].trim();
                    String origen = datos[1].trim();
                    String destino =  datos[2].trim();
                    String fechaLlegada =  datos[3].trim();
                    String hora_llegada = datos[4].trim();
                    int numeroPasaderos = Integer.parseInt(datos[5].trim());

                    DateTimeFormatter formatter =
                            DateTimeFormatter.ofPattern("EEE dd MMM yyyy", new Locale("es", "ES"));
                    LocalDate fecha = LocalDate.parse(fechaLlegada.toLowerCase(), formatter);

                    DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm 'hrs'");
                    LocalTime hora = LocalTime.parse(hora_llegada, formatter1);
                    listVuelos.add(new Vuelo(vuelo, origen, destino, fecha, hora, numeroPasaderos));
                }


            });

        } catch (IOException e) {
            System.out.println("Error al cargar los vuelos: " +  e.getMessage());;
        }

        return listVuelos;
    }
}
