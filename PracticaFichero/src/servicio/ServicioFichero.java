package servicio;

import modelo.Incidencia;
import repositorio.Fichero;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;

public class ServicioFichero {

    public static void guardar(int id, String usuario, String excepcion, LocalDate fecha, LocalTime hora) throws IOException {

        Incidencia incidencia = new Incidencia(id, usuario, excepcion, fecha, hora);
        Fichero fichero = new Fichero("datos/incidencias.txt");

        fichero.addDato(incidencia.toString());
    }
}