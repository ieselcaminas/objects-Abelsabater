package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Editorial {
private int id;
private String nombre;
private List<LLibre> lLibres;

public Editorial(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
    this.lLibres=new ArrayList<>();
}

public List<LLibre> getlLibres() {
    return lLibres;
}
public void add(LLibre lLibre) {
    this.lLibres.add(lLibre);
}
public int getId() {
    return id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
@Override
public String toString() {
    return "Editorial: " + getNombre();
}

}

