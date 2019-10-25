package lab3_simulacionguerra;

public class Caballero extends Soldado {

    private Arma arma;

    public Caballero() {
        super();
    }

    public Caballero(Arma arma, String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
        this.arma = arma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Caballero{" + "arma=" + arma + '}';
    }
    
}
