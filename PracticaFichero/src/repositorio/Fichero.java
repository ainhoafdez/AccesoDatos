package repositorio;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Fichero {

    private String ruta;

    @Override
    public String toString() {
        return "Fichero{" +
                "ruta='" + ruta + '\'' +
                '}';
    }

    // Añadir una línea al fichero
    public void addDato(String dato) throws IOException {
        FileWriter fichero = null;
        BufferedWriter escritor = null;

        try {
            fichero = new FileWriter(ruta, true); // append = true
            escritor = new BufferedWriter(fichero);

            escritor.write(dato);
            escritor.newLine();

        } catch (IOException e) {
            System.err.println("No encuentro el fichero");
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                }
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero");
            }
        }
    }

    // Buscar coincidencias en cualquier campo
    public List<String> buscarDato(String dato) throws IOException {

        String cadena = "";
        FileReader fichero = null;
        BufferedReader lector = null;
        List<String> resultados = new ArrayList<>();

        try {
            fichero = new FileReader(ruta);
            lector = new BufferedReader(fichero);

            do {
                cadena = lector.readLine();

                if (cadena != null) {
                    String[] campos = cadena.split(";");
                    boolean encontrada = false; // evita duplicar la misma línea
                    for (String campo : campos) {
                        if (campo.equalsIgnoreCase(dato)) {
                            if (!encontrada) {
                                resultados.add(cadena);
                                encontrada = true;
                            }
                        }
                    }
                }
            } while (cadena != null);

        } catch (FileNotFoundException e) {
            System.err.println("No encuentro el fichero");

        } catch (IOException e) {
            System.err.println("Error de lectura");

        } catch (Exception e) {
            System.err.println("Error de fichero");

        } finally {

            try {
                if (lector != null) {
                    lector.close();
                }
                if (fichero != null) {
                    fichero.close();
                }
            } catch (IOException e) {
                System.err.println("Error al cerrar el fichero");
            }
        }

        return resultados;
    }

    public ArrayList<String> leerFichero(String dato) {
        return null;
    }

    public Fichero(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
}