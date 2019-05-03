package lab3_jasonderas_miguelblanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JasonDeras_MiguelBlanco {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Jugador> jugadoress = new ArrayList();

    public static void main(String[] args) {
        while (true) {
            System.out.print("1. Equipo\n"
                    + "2. Jugador\n"
                    + "Ingrse su opcion: ");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("1. Hacer Compras\n"
                            + "2. Organizar Equipo\n"
                            + "3. Listar Equipos\n"
                            + "4. Listar Jugadores\n"
                            + "5. Eliminar Equipo\n"
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
                        case 5:

                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                case 2:
                    for (int i = 0; i < jugadoress.size(); i++) {
                        System.out.println(i + 1 + "- " + jugadoress.get(i));
                    }
                    System.out.println("1. Crear\n"
                            + "2. Modificar\n"
                            + "3. Eliminar\n"
                            + "Ingrese su opcion: ");
                    int temp2 = leer.nextInt();
                    switch (temp2) {
                        case 1:
                            System.out.print("Ingrese nombre: ");
                            String nombre = leer.next();
                            System.out.print("Ingrese apellido: ");
                            String apellido = leer.next();
                            System.out.print("Ingrese la edad: ");
                            int edad = leer.nextInt();
                            String estado = "Libre";
                            System.out.print("Ingrese el pais de nacimiento: ");
                            String paisnam = leer.next();
                            System.out.println("1. Izquierdo\n"
                                    + "2. Derecho\n"
                                    + "Ingrese el pie: ");
                            int pietemp = leer.nextInt();
                            String pie;
                            if (pietemp == 1) {
                                pie = "Izquierdo";
                            } else {
                                pie = "Derecho";
                            }
                            int numero = 0;
                            System.out.print("Ingrese el precio del jugador: ");
                            int precio = leer.nextInt();
                            String equipo = "";
                            System.out.print("1. Delantero\n"
                                    + "2. Medio\n"
                                    + "3. Defensa\n"
                                    + "4. Portero\n"
                                    + "Ingrese su opcion: ");
                            int temp4 = leer.nextInt();
                            switch (temp4) {
                                case 1:
                                    System.out.print("Ingrese Nivel de Definicion: ");
                                    int definicion = leer.nextInt();
                                    System.out.print("Ingrese la Velociodad: ");
                                    int velocidad = leer.nextInt();
                                    System.out.print("Ingrese el promedio de goles por partidos: ");
                                    double promedio = leer.nextDouble();
                                    jugadoress.add(new Delantero(definicion, velocidad, promedio, nombre, apellido, edad, estado, paisnam, pie, numero, precio, equipo));
                                    break;
                                case 2:
                                    System.out.print("Ingrese creatividad: ");
                                    int creatividad = leer.nextInt();
                                    System.out.print("Ingrese dominio: ");
                                    int dominio = leer.nextInt();
                                    System.out.print("Ingrese asistencia: ");
                                    int asistencia = leer.nextInt();
                                    jugadoress.add(new Medio(creatividad, dominio, asistencia, nombre, apellido, edad, estado, paisnam, pie, numero, precio, equipo));
                                    break;
                                case 3:
                                    System.out.print("Ingrese agresividad: ");
                                    int agresividad = leer.nextInt();
                                    System.out.print("Ingrese el peso: ");
                                    int peso = leer.nextInt();
                                    System.out.print("Ingrese velocidad: ");
                                    int velo = leer.nextInt();
                                    jugadoress.add(new Defensa(agresividad, peso, velo, nombre, apellido, edad, estado, paisnam, pie, numero, precio, equipo));
                                    break;
                                case 4:
                                    System.out.print("Ingrese portero: ");
                                    int areo = leer.nextInt();
                                    System.out.println("Ingrese del nivel de juego: ");
                                    int njuego = leer.nextInt();
                                    jugadoress.add(new Portero(areo, njuego, nombre, apellido, edad, estado, paisnam, pie, numero, precio, equipo));
                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.print("Ingrese que jugador dese eliminar: ");
                            int temp3 = leer.nextInt() - 1;
                            jugadoress.remove(temp3);
                            break;
                        default:
                            throw new AssertionError();
                    }
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
