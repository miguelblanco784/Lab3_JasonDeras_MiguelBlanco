package lab3_jasonderas_miguelblanco;

public class Defensa extends Jugador {

    private int agresividad;
    private double peso;
    private int velocidad;

    public Defensa(int agresividad, double peso, int velocidad, String nombre, String apellido, int edad, String estado, String pais_nacimiento, String pie_preferido, int numero, double precio, String posicion) {
        super(nombre, apellido, edad, estado, pais_nacimiento, pie_preferido, numero, precio, posicion);
        this.agresividad = agresividad;
        this.peso = peso;
        this.velocidad = velocidad;
    }

    public int getAgresividad() {
        return agresividad;
    }

    public void setAgresividad(int agresividad) {
        this.agresividad = agresividad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString() + "Defensa{" + "agresividad=" + agresividad + ", peso=" + peso + ", velocidad=" + velocidad + '}';
    }

}
