package lab3_simulacionguerra;

public class Soldado {
    
    private String nombre;
    private String lugar;
    private int edad;
    private char sexo;

    public Soldado() {
    }

    public Soldado(String nombre, String lugar, int edad, char sexo) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Soldado{" + "nombre=" + nombre + ", lugar=" + lugar + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
}