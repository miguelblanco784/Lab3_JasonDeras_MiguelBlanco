package lab3_jasonderas_miguelblanco;

public class Portero extends Jugador {

    private int areo;
    private int nivel_pies;

    public Portero(int areo, int nivel_pies, String nombre, String apellido, int edad, String estado, String pais_nacimiento, String pie_preferido, int numero, double precio, String posicion) {
        super(nombre, apellido, edad, estado, pais_nacimiento, pie_preferido, numero, precio, posicion);
        this.areo = areo;
        this.nivel_pies = nivel_pies;
    }

    public int getAreo() {
        return areo;
    }

    public void setAreo(int areo) {
        this.areo = areo;
    }

    public int getNivel_pies() {
        return nivel_pies;
    }

    public void setNivel_pies(int nivel_pies) {
        this.nivel_pies = nivel_pies;
    }

    @Override
    public String toString() {
        return super.toString() + "Portero{" + "areo=" + areo + ", nivel_pies=" + nivel_pies + '}';
    }

}
