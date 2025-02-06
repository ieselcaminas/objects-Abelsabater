package POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class Professor {
private String nom;
private int id;
private Departament departament;
private List<Catedra> catedras;

public Professor(String nom, int id, Departament departament) {
    this.nom = nom;
    this.id = id;
    this.departament = departament;
    this.catedras=new ArrayList<>();
}
public void add(Catedra catedra){
    this.catedras.add(catedra);
}
public int getId() {
    return id;
}

public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public Departament getDepartament() {
    return departament;
}

public void setDepartament(Departament departament) {
    this.departament = departament;
}
@Override
public String toString() {
    return "Exemplar:" + getNom();
}
}
