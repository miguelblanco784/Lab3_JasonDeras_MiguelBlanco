package lab3_jasonderas_miguelblanco;

import java.util.*;

public class EquipoCreado {

    Scanner leer = new Scanner(System.in);

    public void creacion() {
        System.out.print("Ingrese su el nombre del equipo: ");
        String nomequipo = leer.next();
        System.out.print("Ingrese Palmares: ");
        int palmares = leer.nextInt();
        System.out.print("Ingrese Ciudad: ");
        String ciudad = leer.next();
        System.out.print("Ingrese presupuesto: ");
        double presupuesto = leer.nextInt();
        equipos.add(new Equipos(nomequipo, palmares, ciudad, presupuesto));
    }

}
