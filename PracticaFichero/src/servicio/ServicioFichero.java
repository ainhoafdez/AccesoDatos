package servicio;

import modelo.Incidencia;
import repositorio.Fichero;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ServicioFichero {

    // Guardar nuevas incidencias
    public static void guardar(String usuario, String excepcion) throws IOException {
        Incidencia incidencia = new Incidencia(
                (int)(Math.random() * 1000), // id simple
                usuario,
                excepcion,
                LocalDate.now(),
                LocalTime.now()
        );

        Fichero fichero = new Fichero("datos/incidencias.txt");
        fichero.addDato(incidencia.getFecha() + ";" +
                incidencia.getHora() + ";" +
                incidencia.getExcepcion() + ";" +
                incidencia.getUsuario());
    }

    // Buscar cualquier coincidencia en el fichero
    public static void buscar(String dato) throws IOException {
        Fichero fichero = new Fichero("datos/incidencias.txt");
        List<String> incidencias = fichero.buscarDato(dato);

        if (incidencias.isEmpty()) {
            System.out.println("No se encontraron coincidencias para: " + dato);
        } else {
            incidencias.forEach(System.out::println);
        }
    }
}
