package lab3_simulacionguerra;

public class General extends Soldado {

    private int años_mandato;

    public General() {
    }

    public General(int años_mandato, String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
        this.años_mandato = años_mandato;
    }

    public General(int años_mandato, String nombre, String lugar, int edad, char sexo, Arma arm) {
        super(nombre, lugar, edad, sexo, arm);
        this.años_mandato = años_mandato;
    }

    public int getAños_mandato() {
        return años_mandato;
    }

    public void setAños_mandato(int años_mandato) {
        this.años_mandato = años_mandato;
    }

    @Override
    public String toString() {
        return super.toString() + "General{" + "Mandato: " + años_mandato + '}';
    }

}