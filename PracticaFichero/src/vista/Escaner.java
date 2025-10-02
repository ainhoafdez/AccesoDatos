package vista;

import java.util.Scanner;

public class Escaner {

    private static final Scanner sc = new Scanner(System.in);

    // Pedir un texto
    public static String pedirString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    // Pedir un número entero
    public static int pedirInt(String mensaje) {
        while (true) {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                sc.nextLine(); // limpiar el salto de línea pendiente
                return num;
            } else {
                System.out.println("Error: número inválido.");
                sc.nextLine(); // limpiar el input incorrecto
            }
        }
    }
}