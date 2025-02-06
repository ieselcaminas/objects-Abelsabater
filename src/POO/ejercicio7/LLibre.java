package POO.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class LLibre {
private int id;
private String nombre;
private Editorial editorial;
private Tema tema;
private List<Autor>autors;
private List<Exemplar>exemplars;

public LLibre(String nombre, int id, Editorial editorial, Tema tema) {
    this.nombre = nombre;
    this.id = id;
    this.editorial = editorial;
    this.tema = tema;
    this.autors=new ArrayList<>();
    this.exemplars=new ArrayList<>();
}
public void add(Exemplar exemplar) {
    this.exemplars.add(exemplar);
}
public List<Autor> getAutors() {
    return autors;
}

public void add(Autor autor) {
    this.autors.add(autor);
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

public Editorial getEditorial() {
    return editorial;
}

public void setEditorial(Editorial editorial) {
    this.editorial = editorial;
}

public Tema getTema() {
    return tema;
}

public void setTema(Tema tema) {
    this.tema = tema;
}
@Override
public String toString() {
    return "Exemplar:" + getNombre();
}
}
