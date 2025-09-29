package controlador;

import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Escaner;

import java.io.IOException;

public class ControladorIndicencias {

    //Pedir usuario
    public static void iniciar() throws IOException {

        Fichero fIncidencias = new Fichero("datos/incidencias.txt");

        fIncidencias.addDato("2025-09-16;14:01:00;excepción test 1;usuario1");

        String usuario = Escaner.pedirString("Introduce el usuario: ");

        String opcion = Escaner.pedirString("Introduce la opción: ");

        ServicioFichero.guardar(usuario,opcion);

    }

    //Mostrar menu
        //Introducir datos(num)
            //Mostrar excepciones
        //Buscar
            //Buscar por usuario
            //Buscar fecha
}