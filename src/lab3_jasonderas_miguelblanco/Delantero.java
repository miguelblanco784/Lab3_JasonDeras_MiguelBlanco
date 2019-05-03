package lab3_jasonderas_miguelblanco;

public class Delantero extends Jugador {

   private int nivel_definicion;
   private double altura;
   private int velocidad;
   private double goles_por_partido;

    public Delantero(int nivel_definicion, double altura, int velocidad, double goles_por_partido, String nombre, String apellido, int edad, String estado, String pais_nacimiento, double precio, String posicion) {
        super(nombre, apellido, edad, estado, pais_nacimiento, precio, posicion);
        this.nivel_definicion = nivel_definicion;
        this.altura = altura;
        this.velocidad = velocidad;
        this.goles_por_partido = goles_por_partido;
    }

    public int getNivel_definicion() {
        return nivel_definicion;
    }

    public void setNivel_definicion(int nivel_definicion) {
        this.nivel_definicion = nivel_definicion;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public double getGoles_por_partido() {
        return goles_por_partido;
    }

    public void setGoles_por_partido(double goles_por_partido) {
        this.goles_por_partido = goles_por_partido;
    }

    @Override
    public String toString() {
        return "Delantero{" + "nivel_definicion=" + nivel_definicion + ", altura=" + altura + ", velocidad=" + velocidad + ", goles_por_partido=" + goles_por_partido + '}';
    }

}
