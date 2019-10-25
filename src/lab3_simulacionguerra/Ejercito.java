package lab3_simulacionguerra;

import java.util.ArrayList;

public class Ejercito {

    private String nombre;
    private String region;
    private int cant_victorias;
    private double dinero_dis;
    private ArrayList<Soldado> soldados;

    public Ejercito() {
    }

    public Ejercito(String nombre, String region, double dinero_dis, ArrayList<Soldado> soldados) {
        this.nombre = nombre;
        this.region = region;
        this.dinero_dis = dinero_dis;
        this.soldados = soldados;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public int getCant_victorias() {
        return cant_victorias;
    }

    public void setCant_victorias(int cant_victorias) {
        this.cant_victorias = cant_victorias;
    }

    public double getDinero_dis() {
        return dinero_dis;
    }

    public void setDinero_dis(double dinero_dis) {
        this.dinero_dis = dinero_dis;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public void setSoldados(ArrayList<Soldado> soldados) {
        this.soldados = soldados;
    }

    @Override
    public String toString() {
        return "Ejercito{" + "nombre=" + nombre + ", region=" + region + ", cant_victorias=" + cant_victorias + ", dinero_dis=" + dinero_dis + ", soldados=" + soldados + '}';
    }
    
}