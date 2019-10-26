package lab3_simulacionguerra;

public class Rifle extends Arma {
    
    private int max;
    private int min;
    private String automatica;

    public Rifle() {
    }

    public Rifle(int max, int min, String automatica, String nombre, double precio) {
        super(nombre, precio);
        this.max = max;
        this.min = min;
        this.automatica = automatica;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getAutomatica() {
        return automatica;
    }

    public void setAutomatica(String automatica) {
        this.automatica = automatica;
    }

    @Override
    public String toString() {
        return super.toString() + "Rifle{" + "Max: " + max + ", Min: " + min + ", Automatica: " + automatica + '}';
    }

}