package POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Catedra {
private String nombre;
private int id;
private List<Professor>professores;
private Facultad facultad;
private Departament departament;

public Catedra(String nombre, int id, Facultad facultad, Departament departament) {
    this.nombre = nombre;
    this.id = id;
    this.facultad = facultad;
    this.departament = departament;
    this.professores=new ArrayList<>();
}

public List<Professor> getProfessores() {
    return professores;
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

public Facultad getFacultad() {
    return facultad;
}

public void setFacultad(Facultad facultad) {
    this.facultad = facultad;
}

public Departament getDepartament() {
    return departament;
}

public void setDepartament(Departament departament) {
    this.departament = departament;
}
@Override
public String toString() {
    return "Exemplar:" + getNombre();
}
}
