package POO.ejercicio4;

public class Autor {
private String nombre;
private String fecha;

public Autor(String nombre, String fecha) {
    this.nombre = nombre;
    this.fecha = fecha;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getNombre() {
    return nombre;
}

public String getFecha() {
    return fecha;
}
public String toString(){
    return getNombre()+" nacio el "+getFecha();
}
}
