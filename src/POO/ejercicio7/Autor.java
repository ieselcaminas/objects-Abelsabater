package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Autor {
private int cod_aut;
private String nombre;
private List<LLibre>lLibres;

public Autor(int cod_aut, String nombre) {
    this.cod_aut = cod_aut;
    this.nombre = nombre;
    this.lLibres=new ArrayList<>();
}

public int getCod_aut() {
    return cod_aut;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void add(LLibre lLibre) {
    this.lLibres.add(lLibre);
}

public List<LLibre> getlLibres() {
    return lLibres;
}

@Override
public String toString() {
    return "Autor: "+getNombre();
}

}
