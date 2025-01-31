package POO.ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class Banco {
private int n_ent;
private String nombre;
private List<Sucursal>sucursales;

public Banco(int n_ent, String nombre) {
    this.n_ent = n_ent;
    this.nombre = nombre;
    this.sucursales = new ArrayList<>();
}
public List<Sucursal> getSucursales() {
    return sucursales;
}
public void addsucursal(Sucursal sucursal){
    this.sucursales.add(sucursal);
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public int getN_ent() {
    return n_ent;
}
@Override
public String toString(){
    return this.nombre;
}
}