package lab3_simulacionguerra;

public class Caballero extends Soldado {

    public Caballero() {
    }

    public Caballero(String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
    }

    public Caballero(String nombre, String lugar, int edad, char sexo, Arma arm) {
        super(nombre, lugar, edad, sexo, arm);
    }

    @Override
    public String toString() {
        return super.toString() + "Caballero";
    }
}