package POO.ejercicio6;

import java.util.ArrayList;
import java.util.List;

public class AreaConeixement {
private String nom;
private int id;
private List<Departament> departaments;

public AreaConeixement(String nom, int id) {
    this.nom = nom;
    this.id = id;
    this.departaments=new ArrayList<>();
}
public void add(Departament departament){
    this.departaments.add(departament);
}
public String getNom() {
    return nom;
}

public void setNom(String nom) {
    this.nom = nom;
}

public int getId() {
    return id;
}
@Override
public String toString() {
    return "Exemplar:" + getNom();
}
}
