package lab3_simulacionguerra;

public class General extends Soldado {

    private int años_mandato;
    private Arma arma;

    public General() {
        super();
    }

    public General(int años_mandato, String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
        this.años_mandato = años_mandato;

    }

    public int getAños_mandato() {
        return años_mandato;
    }

    public void setAños_mandato(int años_mandato) {
        this.años_mandato = años_mandato;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "General{" + "a\u00f1os_mandato=" + años_mandato + ", arma=" + arma + '}';
    }

}
