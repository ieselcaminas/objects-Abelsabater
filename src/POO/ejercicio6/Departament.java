package POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Departament {
private int id;
private String nombre;
private AreaConeixement areaConeixement;
private List<Professor> professores;
public Departament(int id, String nombre, AreaConeixement areaConeixement) {
    this.id = id;
    this.nombre = nombre;
    this.areaConeixement = areaConeixement;
    this.professores=new ArrayList<>();
}
public void add(Professor professor){
    this.professores.add(professor);
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

public AreaConeixement getAreaConeixement() {
    return areaConeixement;
}

public void setAreaConeixement(AreaConeixement areaConeixement) {
    this.areaConeixement = areaConeixement;
}
}
