package POO.ejercicio6;

public class Professor {
private String nom;
private int id;
private Departament departament;

public Professor(String nom, int id, Departament departament) {
    this.nom = nom;
    this.id = id;
    this.departament = departament;
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
}
