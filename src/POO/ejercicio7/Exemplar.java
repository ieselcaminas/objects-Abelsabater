package POO.ejercicio7;

public class Exemplar {
private int n_reg;
private String nombre;
private LLibre lLibre;

public Exemplar(int n_reg, String nombre, LLibre lLibre) {
    this.n_reg = n_reg;
    this.nombre = nombre;
    this.lLibre = lLibre;
}

public int getN_reg() {
    return n_reg;
}

public LLibre getlLibre() {
    return lLibre;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
}
