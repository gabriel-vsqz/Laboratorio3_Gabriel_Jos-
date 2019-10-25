/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_simulacionguerra;

/**
 *
 * @author jrdjh
 */
public class Ejecutor extends Soldado {

    private Arma arma;
    private Bomba boma;

    public Ejecutor() {
        super();
    }

    public Ejecutor(Arma arma, Bomba boma, String nombre, String lugar, int edad, String sexo) {
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
