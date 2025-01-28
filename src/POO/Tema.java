package POO;

public class Tema {
private String nombre;
public Tema(String nombre) {
    this.nombre = nombre;
}
public String getNombre() {
    return nombre;
}
public String toString(){
    return getNombre();
}
}
