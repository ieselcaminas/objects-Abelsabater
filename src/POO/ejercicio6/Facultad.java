package POO.ejercicio6;

public class Facultad {
private String nom;
private int id;

public Facultad(String nom, int id) {
    this.nom = nom;
    this.id = id;
}

public void setNom(String nom) {
    this.nom = nom;
}

public String getNom() {
    return nom;
}

public int getId() {
    return id;
}
}
