package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class CasaSubasta {
    private int cod;
    private String nombre;
    private List<Subasta>subastas;

    public CasaSubasta(int cod, String nombre) {
        this.cod = cod;
        this.nombre = nombre;
        this.subastas=new ArrayList<>();
    }

    public int getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Subasta> getSubastas() {
        return subastas;
    }

    public void adds(Subasta subasta) {
        this.subastas.add(subasta);
    }
    @Override
    public String toString(){
        return "Bienvenidos a "+this.nombre;
    }
}
