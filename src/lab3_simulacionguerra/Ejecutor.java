package lab3_simulacionguerra;

public class Ejecutor extends Soldado {

    private Arma arma;
    private Bomba boma;

    public Ejecutor() {
        super();
    }

    public Ejecutor(Arma arma, Bomba boma, String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
        this.arma = arma;
        this.boma = boma;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Bomba getBoma() {
        return boma;
    }

    public void setBoma(Bomba boma) {
        this.boma = boma;
    }

    @Override
    public String toString() {
        return "Ejecutor{" + "arma=" + arma + ", boma=" + boma + '}';
    }

}