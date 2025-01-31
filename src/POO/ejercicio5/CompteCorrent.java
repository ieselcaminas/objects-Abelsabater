package POO.ejercicio5;

public class CompteCorrent {
private int n_cc;
private String nombre;
private String contrasena;
private Sucursal sucursal;

public CompteCorrent(int n_cc, String nombre, String contrasena, Sucursal sucursal) {
    this.n_cc = n_cc;
    this.nombre = nombre;
    this.contrasena = contrasena;
    this.sucursal=sucursal;
}

public int getN_cc() {
    return n_cc;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getContrasena() {
    return contrasena;
}

public void setContrasena(String contrasena) {
    this.contrasena = contrasena;
}
@Override
public String toString(){
    return nombre;
}
}
