package lab3_jasonderas_miguelblanco;

public class Jugador {

    private String nombre;
    private String apellido;
    private int edad;
    private String estado;
    private String pais_nacimiento;
    private String pie_preferido;
    private int numero;
    private double precio;
    private String equipo = "";
    private String posicion;
    private String titularidad = "Banca";

    public Jugador(String nombre, String apellido, int edad, String estado, String pais_nacimiento, String pie_preferido, int numero, double precio, String posicion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.estado = estado;
        this.pais_nacimiento = pais_nacimiento;
        this.pie_preferido = pie_preferido;
        this.numero = numero;
        this.precio = precio;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais_nacimiento() {
        return pais_nacimiento;
    }

    public void setPais_nacimiento(String pais_nacimiento) {
        this.pais_nacimiento = pais_nacimiento;
    }

    public String getPie_preferido() {
        return pie_preferido;
    }

    public void setPie_preferido(String pie_preferido) {
        this.pie_preferido = pie_preferido;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public String getTitularidad() {
        return titularidad;
    }

    public void setTitularidad(String titularidad) {
        this.titularidad = titularidad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "apellido=" + apellido + ", estado=" + estado + ", pie_preferido=" + pie_preferido + ", numero=" + numero + ", posicion=" + posicion + '}';
    }

}
