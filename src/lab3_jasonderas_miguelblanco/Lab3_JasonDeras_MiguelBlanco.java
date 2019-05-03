package lab3_jasonderas_miguelblanco;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_JasonDeras_MiguelBlanco {
    
    static Scanner leer = new Scanner(System.in);
    static ArrayList<Jugador> jugadoress = new ArrayList();
    static ArrayList<Equipos> equipos = new ArrayList();
    static ArrayList Titulares = new ArrayList();
    
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
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.println(i + 1 + "- " + equipos.get(i));
                            }
                            
                            System.out.print("Ingrese posicion del equipo a comprar: ");
                            int temp7 = leer.nextInt() - 1;
                            for (int i = 0; i < jugadoress.size(); i++) {
                                if (jugadoress.get(i).getEquipo().equals("Libre")) {
                                    System.out.println(i + "= " + jugadoress.get(i));
                                }
                            }
                            System.out.print("Ingrese la posicion del jugador a comprar: ");
                            int temp8 = leer.nextInt();
                            if ((jugadoress.get(temp8).getPrecio() > equipos.get(temp7).getPresupuesto()) && jugadoress.get(temp8).getEquipo().equals("Libre")) {
                                System.out.println("No lo puede comprar\n");
                            } else if ((jugadoress.get(temp8).getPrecio() < equipos.get(temp7).getPresupuesto()) && jugadoress.get(temp8).getEquipo().equals("Libre")) {
                                int axu;
                                System.out.print("Ingrese el numero del jugador: ");
                                int num = leer.nextInt();
                                axu = (int) (equipos.get(temp7).getPresupuesto() - jugadoress.get(temp8).getPrecio());
                                if (jugadoress.get(temp8).getNumero() == num) {
                                    System.out.println("Un jugador ya tiene ese numero\n");
                                } else {
                                    jugadoress.remove(temp8);
                                    equipos.get(temp7).setPresupuesto(axu);
                                    System.out.println("");
                                }
                            } else if ((jugadoress.get(temp8).getPrecio() == equipos.get(temp7).getPresupuesto()) && jugadoress.get(temp8).getEquipo().equals("Libre")) {
                                int axu;
                                System.out.print("Ingrese el numero del jugador: ");
                                int num = leer.nextInt();
                                axu = (int) (equipos.get(temp8).getPresupuesto() - jugadoress.get(temp8).getPrecio());
                                equipos.get(temp7).setPresupuesto(axu);
                                if (jugadoress.get(temp8).getNumero() == num) {
                                    System.out.println("Un jugador ya tiene ese numero\n");
                                } else {
                                    jugadoress.remove(temp8);
                                    equipos.get(temp7).setPresupuesto(axu);
                                    System.out.println("");
                                }
                            }
                            System.out.println("");
                            break;
                        case 2:
                            System.out.println("Ingrese su formacion: "
                                    + "Ejemplo: defensas,medios,delanteros");
                            String temp9 = leer.next();
                            String[] formacion = temp9.split(",");
                            int opcion11 = Integer.parseInt(formacion[2]),
                             opcion22 = Integer.parseInt(formacion[1]),
                             opcion33 = Integer.parseInt(formacion[0]);
                            int opcion1 = 0,
                             opcion2 = 0,
                             opcion3 = 0;
                            for (int i = 0; i < equipos.size(); i++) {
                                if (equipos.get(i).getJugadores().get(i) instanceof Delantero) {
                                    opcion1++;
                                }
                            }
                            for (int i = 0; i < equipos.size(); i++) {
                                if (equipos.get(i).getJugadores().get(i) instanceof Medio) {
                                    opcion2++;
                                }
                            }
                            for (int i = 0; i < equipos.size(); i++) {
                                if (equipos.get(i).getJugadores().get(i) instanceof Defensa) {
                                    opcion3++;
                                }
                            }
                            if ((opcion11 >= opcion1) && (opcion22 >= opcion2) && (opcion33 >= opcion3) && (opcion11 + opcion22 + opcion33 == 10)) {
                                System.out.println("Delanteros: ");
                                for (int i = 0; i < equipos.size(); i++) {
                                    if (equipos.get(i).getJugadores().get(i) instanceof Delantero) {
                                        System.out.println(i + "_ " + equipos.size());
                                    }
                                }
                                System.out.println("Medios: ");
                                for (int i = 0; i < equipos.size(); i++) {
                                    if (equipos.get(i).getJugadores().get(i) instanceof Medio) {
                                        System.out.println(i + "_ " + equipos.size());
                                    }
                                }
                                System.out.println("Defensa ");
                                for (int i = 0; i < equipos.size(); i++) {
                                    if (equipos.get(i).getJugadores().get(i) instanceof Defensa) {
                                        System.out.println(i + "_ " + equipos.size());
                                    }
                                }
                                Object[] jugadoress = new Object[2];
                                Object[] temp10 = new Object[10];
                                ArrayList banca = new ArrayList();
                                jugadoress[0] = temp10;
                                jugadoress[1] = banca;
                                for (int i = 0; i < 10; i++) {
                                    System.out.println("Ingrese sus delanteros: ");
                                    for (int p = 0; p < opcion11; p++, i++) {
                                        System.out.println("Ingrese el delantero -" + i);
                                    }
                                    System.out.println("Ingrese sus Medio: ");
                                    for (int k = 0; k < opcion22; k++, i++) {
                                        System.out.println("Ingrese sus Medio -" + i);
                                    }
                                    System.out.println("Ingrese Defensa: ");
                                    for (int z = 0; z < opcion33; z++, i++) {
                                        System.out.println("Ingrese sus Defensas -" + i);
                                    }
                                }
                                Titulares.add(jugadoress);
                            }// fin if validacion 
                            break;
                        case 3:
                            System.out.print("Ingrese posicion del equipo: ");
                            int temp11 = leer.nextInt();
                            if (temp11 >= 0 && temp11 < equipos.size()) {
                                System.out.println(equipos.get(temp11));
                            }
                            break;
                        case 4:
                            System.out.println("Jugadores en equipos: ");
                            for (int i = 0; i < jugadoress.size(); i++) {
                                if (jugadoress.get(i).getEquipo().equals("Comprado")) {
                                    System.out.println(jugadoress.get(i));
                                }
                            }
                            System.out.println("Jugadores sin equipo: ");
                            for (int i = 0; i < jugadoress.size(); i++) {
                                if (jugadoress.get(i).getEquipo().equals("Libre")) {
                                    System.out.println(jugadoress.get(i));
                                }
                            }
                            break;
                        case 5:
                            for (int i = 0; i < equipos.size(); i++) {
                                System.out.print(i + 1 + "- " + equipos.get(i));
                            }
                            System.out.print("Ingrese el equipo que desea eliminiar: ");
                            int temp6 = leer.nextInt() - 1;
                            equipos.remove(temp6);
                            break;
                        case 6:
                            System.out.print("Ingrese su el nombre del equipo: ");
                            String nomequipo = leer.next();
                            System.out.print("Ingrese Palmares: ");
                            String palmares = leer.next();
                            System.out.print("Ingrese Ciudad: ");
                            String ciudad = leer.next();
                            System.out.print("Ingrese presupuesto: ");
                            double presupuesto = leer.nextInt();
                            equipos.add(new Equipos(nomequipo, palmares, ciudad, presupuesto));
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
                                        System.out.println("Para modificar el equipo del jugador debe de ir al menu de modificar equipo\n");
                                        System.out.println("");
                                    }
                                    System.out.println("");
                                    break;
                                default:
                                    System.out.println("Opcion de modificacion no valida\n");
                                    System.out.println("");
                            }//Fin del switch de modificacion de jugador
                            break;
                        case 3:
                            for (int i = 0; i < jugadoress.size(); i++) {
                                System.out.println(i + 1 + "- " + jugadoress.get(i));
                            }
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
