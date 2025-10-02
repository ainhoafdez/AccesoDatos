package controlador;

import servicio.ServicioFichero;
import vista.Consola;
import vista.Escaner;

import java.util.ArrayList;
import java.util.List;

public class ControladorIndicencias {

    public static void iniciar() throws Exception {
        String usuario = Escaner.pedirString("Introduce el usuario: ");

        List<String> menu = new ArrayList<>();
        menu.add("Introducir incidencia");
        menu.add("Buscar incidencia (usuario, fecha o excepción)");
        menu.add("Salir");

        boolean salir = false;

        while (!salir) {
            Consola.mostrarMenu(menu);
            int opcion = Escaner.pedirInt("Elige una opción: ");

            switch (opcion) {
                case 1:
                    String excepcion = Escaner.pedirString("Introduce la excepción: ");
                    ServicioFichero.guardar(usuario, excepcion);
                    break;
                case 2:
                    String dato = Escaner.pedirString("Introduce el dato a buscar: ");
                    ServicioFichero.buscar(dato);
                    break;
                case 3:
                    salir = true;
                    break;
                default:
                    Consola.mostrarString("Opción no válida");
            }
        }
    }
}
