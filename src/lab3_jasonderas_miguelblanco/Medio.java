package lab3_jasonderas_miguelblanco;

public class Medio extends Jugador{
private int creatividad;
private int dominio;
private double asistencias;

    public Medio(int creatividad, int dominio, double asistencias, String nombre, String apellido, int edad, String estado, String pais_nacimiento, double precio, String posicion) {
        super(nombre, apellido, edad, estado, pais_nacimiento, precio, posicion);
        this.creatividad = creatividad;
        this.dominio = dominio;
        this.asistencias = asistencias;
    }

    public int getCreatividad() {
        return creatividad;
    }

    public void setCreatividad(int creatividad) {
        this.creatividad = creatividad;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        this.dominio = dominio;
    }

    public double getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(double asistencias) {
        this.asistencias = asistencias;
    }

    @Override
    public String toString() {
        return "Medio{" + "creatividad=" + creatividad + ", dominio=" + dominio + ", asistencias=" + asistencias + '}';
    }

}
