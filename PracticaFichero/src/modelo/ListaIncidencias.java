package modelo;

import java.util.ArrayList;

public class ListaIncidencias {

    private ArrayList<Incidencia> listaIncidencias;

    public static void addIncidencia(Incidencia incidencia, ArrayList<Incidencia> listaIncidencias){
        listaIncidencias.add(incidencia);
    }
}
