package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Exemplar {
private int n_reg;
private String nombre;
private LLibre lLibre;
private List<Lector>lectors;

public Exemplar(int n_reg, String nombre, LLibre lLibre) {
    this.n_reg = n_reg;
    this.nombre = nombre;
    this.lLibre = lLibre;
    this.lectors=new ArrayList<>();
}

public List<Lector> getLectors() {
    return lectors;
}
public void add(Lector lector) {
    this.lectors.add(lector);
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
