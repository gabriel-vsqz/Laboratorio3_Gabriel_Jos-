package lab3_simulacionguerra;

public class Ejecutor extends Soldado {

    private Bomba bomba;
    
    public Ejecutor() {
        super();
    }

    public Ejecutor(Bomba bomba, String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
        this.bomba = bomba;
    }

    public Ejecutor(String nombre, String lugar, int edad, char sexo) {
        super(nombre, lugar, edad, sexo);
    }
    
    public Ejecutor(Bomba bomba, String nombre, String lugar, int edad, char sexo, Arma arm) {
        super(nombre, lugar, edad, sexo, arm);
        this.bomba = bomba;
    }

    public Bomba getBomba() {
        return bomba;
    }

    public void setBomba(Bomba bomba) {
        this.bomba = bomba;
    }

    @Override
    public String toString() {
        return super.toString() + "Ejecutor{" + "bombas=" + bombas + '}';
    }
    
}