package controlador;

import repositorio.Fichero;
import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ControladorIndicencias {

    //Pedir usuario
    public static void iniciar() throws IOException {

        List<String> menu = new ArrayList<>();
        String usuario = Escaner.pedirString("Introduce el usuario: ");

        //Mostrar menu

        menu.add("Opción 1 - Introducir datos");
        menu.add("Opción 2 - Buscar por usuario");
        menu.add("Opción 3 - Buscar por fecha");
        menu.add("Opción 4 - Salir");
        Consola.mostrarMenu(menu);

        //Introducir datos(num)
        //Mostrar excepciones
        //Buscar
        //Buscar por usuario
        //Buscar fecha
    }
}