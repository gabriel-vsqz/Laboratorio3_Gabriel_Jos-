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
public class General extends Soldado {

    private int años_mandato;
    private Arma arma;

    public General() {
        super();
    }

    public General(int años_mandato, Arma arma, String nombre, String lugar, int edad, String sexo) {
        super(nombre, lugar, edad, sexo);
        this.años_mandato = años_mandato;
        this.arma = arma;
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
