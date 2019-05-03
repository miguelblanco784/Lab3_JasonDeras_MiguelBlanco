package lab3_jasonderas_miguelblanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JasonDeras_MiguelBlanco {

    static Scanner leer = new Scanner(System.in);
    static ArrayList<Jugador> jugadoress = new ArrayList();
    static ArrayList<Equipos> equipos = new ArrayList();

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
                            + "6. Crear equipo\n"
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
                            System.out.println("Menu de modificacion de jugadores\n");
                            System.out.println("1. Nombre");
                            System.out.println("2. Apellido");
                            System.out.println("3. Edad");
                            System.out.println("4. Estado");
                            System.out.println("5. Pais de nacimeinto");
                            System.out.println("6. Pie preferido");
                            System.out.println("7. Precio");
                            System.out.println("8. Equipo");
                            System.out.print("Ingrese posicion del jugador a modificar: ");
                            int pos = leer.nextInt();
                            System.out.print("Ingrese una opcion: ");
                            int temp5 = leer.nextInt();
                            switch (temp5) {
                                case 1:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo nombre: ");
                                        nombre = leer.next();
                                        jugadoress.get(pos).setNombre(nombre);
                                    }
                                    System.out.println("");
                                    break;
                                case 2:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo apellido: ");
                                        apellido = leer.next();
                                        jugadoress.get(pos).setNombre(apellido);
                                    }
                                    System.out.println("");
                                    break;
                                case 3:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nueva edad: ");
                                        edad = leer.nextInt();
                                        jugadoress.get(pos).setEdad(edad);
                                    }
                                    System.out.println("");
                                    break;
                                case 4:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        if (jugadoress.get(pos).getEstado().equalsIgnoreCase("libre")) {
                                            System.out.println("Ingrese posicion del equipo que lo quiere comprar: ");
                                            int pos2 = leer.nextInt();
                                            if (pos2 >= 0 && pos2 < equipos.size()) {
                                                equipos.get(pos2).setJugador(jugadoress.get(pos));
                                                jugadoress.remove(pos);
                                            } else {
                                                System.out.println("Posicion de eqipo no valido\n");
                                                System.out.println("");
                                            }//If auxiliar de la compra de jugadores
                                        } else if (jugadoress.get(pos).getEstado().equalsIgnoreCase("Comprado")) {
                                            jugadoress.get(pos).setEstado("Libre");
                                        }
                                    }
                                    System.out.println("");
                                    break;
                                case 5:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo pais de nacimiento: ");
                                        paisnam = leer.next();
                                        jugadoress.get(pos).setPais_nacimiento(paisnam);
                                    }
                                    System.out.println("");
                                    break;
                                case 6:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo pie preferido: ");
                                        pie = leer.next();
                                        jugadoress.get(pos).setNombre(pie);
                                    }
                                    System.out.println("");
                                    break;
                                case 7:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo precio: ");
                                        precio = leer.nextInt();
                                        jugadoress.get(pos).setPrecio(precio);
                                    }
                                    System.out.println("");
                                    break;
                                case 8:
                                    if (pos >= 0 && pos < jugadoress.size()) {
                                        System.out.print("Ingrese nuevo equipo: ");
                                        equipo = leer.next();
                                    }
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Opcion de modificacion no valida\n");
                                    System.out.println("");
                            }//Fin del switch de modificacion de jugador
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
            }//Fin del case de los jugadores o equipos
        }
    }
}
