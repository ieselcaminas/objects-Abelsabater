package POO.ejercicio7;

public class Tema {
private int id;
private String nombre;

public Tema(int id, String nombre) {
    this.id = id;
    this.nombre = nombre;
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
}