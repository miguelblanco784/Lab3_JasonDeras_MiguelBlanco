package lab3_jasonderas_miguelblanco;

import java.util.*;

public class Equipos {

    private String nombre;
    private int palamares;
    private String ciudad;
    private double presupuesto;
    private ArrayList<Jugador> jugadores = new ArrayList();

    public Equipos(String nombre, int palamares, String ciudad, double presupuesto) {
        this.nombre = nombre;
        this.palamares = palamares;
        this.ciudad = ciudad;
        this.presupuesto = presupuesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPalamares() {
        return palamares;
    }

    public void setPalamares(int palamares) {
        this.palamares = palamares;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugador(Jugador j) {
        jugadores.add(j);
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    @Override
    public String toString() {
        return "Equipos{" + "nombre=" + nombre + ", palamares=" + palamares + ", ciudad=" + ciudad + ", jugadores=" + jugadores + '}';
    }

}
