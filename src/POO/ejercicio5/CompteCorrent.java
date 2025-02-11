package POO.ejercicio5;
import java.util.ArrayList;
import java.util.List;

public class CompteCorrent {
private int n_cc;
private String nombre;
private String contrasena;
private Sucursal sucursal;
private List<Cliente> clientes;
private List<Domiciliacio>domiciliacions;

public CompteCorrent(int n_cc, String nombre, String contrasena, Sucursal sucursal) {
    this.n_cc = n_cc;
    this.nombre = nombre;
    this.contrasena = contrasena;
    this.sucursal=sucursal;
    this.clientes=new ArrayList<>();
    this.domiciliacions=new ArrayList<>();
}
public List<Domiciliacio> getDomiciliacions() {
    return domiciliacions;
}
public void adddomiciliacio(Domiciliacio domiciliacio) {
    this.domiciliacions.add(domiciliacio);
}
public List<Cliente> getClientes() {
    return clientes;
}
public void addcliente(Cliente cliente) {
    this.clientes.add(cliente);
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