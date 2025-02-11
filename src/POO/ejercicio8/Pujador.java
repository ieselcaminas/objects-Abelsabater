package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Pujador {
    private String DNI;
    private String nombre;
    private List<Puja>pujas;

    public Pujador(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.pujas=new ArrayList<>();
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void addp(Puja puja) {
        this.pujas.add(puja);
    }
}
