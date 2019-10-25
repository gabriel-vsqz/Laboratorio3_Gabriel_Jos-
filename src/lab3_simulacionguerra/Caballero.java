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
public class Caballero extends Soldado {

    private Arma arma;

    public Caballero() {
        super();
    }

    public Caballero(Arma arma, String nombre, String lugar, int edad, String sexo) {
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
