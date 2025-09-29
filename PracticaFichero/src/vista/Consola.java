package vista;

import java.util.Scanner;

public class Consola {

    private static final Scanner sc = new Scanner(System.in);

    public static void mostrarString(String mensaje) {

        System.out.println(mensaje);
    }

    public static String leerString(String mensaje) {

        System.out.print(mensaje);
        return sc.nextLine();
    }


    public static int leerInt(String mensaje) {

        int num;
        while (true) {
            try {
                System.out.print(mensaje);
                num = Integer.parseInt(sc.nextLine());
                return num;
            } catch (NumberFormatException e) {
                System.out.println("Error: Número inválido.");
            }
        }
    }

    public static void mostrarMenu(String mensaje) {

        System.out.println(mensaje);
    }
}