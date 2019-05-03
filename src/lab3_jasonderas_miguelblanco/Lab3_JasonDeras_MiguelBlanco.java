package lab3_jasonderas_miguelblanco;

import java.util.Scanner;

public class Lab3_JasonDeras_MiguelBlanco {

    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("1. Crear Equipo\n"
                    + "2. Eliminar\n"
                    + "Ingrse su opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("1. Hacer Comrpas\n"
                            + "2. Organizar Equipo\n"
                            + "3. Listar Equipos\n"
                            + "4. Listar Jugadores\n"
                            + "Ingrese su opcion: ");
                    int temp1 = leer.nextInt();
                    switch (temp1) {
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:

                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
