package lab3_simulacionguerra;

public class Bomba extends Arma {
    
    private String material;
    private int alcance;

    public Bomba() {
    }

    public Bomba(String material, int alcance, String nombre, double precio) {
        super(nombre, precio);
        this.material = material;
        this.alcance = alcance;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAlcance() {
        return alcance;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    @Override
    public String toString() {
        return "Bomba{" + "material=" + material + ", alcance=" + alcance + '}';
    }

}