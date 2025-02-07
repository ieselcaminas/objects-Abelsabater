package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Lector {
private String dni;
private String nombre;
List<Exemplar>exemplars;

public Lector(String dni, String nombre) {
    this.dni = dni;
    this.nombre = nombre;
    this.exemplars=new ArrayList<>();
}
public void add(Exemplar exemplar) {
    this.exemplars.add(exemplar);
}
public String getDni() {
    return dni;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}
public List<Exemplar> getExemplars() {
    return exemplars;
}
@Override
public String toString() {
    return "Nombre:" + getNombre();
}

}
