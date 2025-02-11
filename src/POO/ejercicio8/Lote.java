package POO.ejercicio8;

import java.util.ArrayList;
import java.util.List;

public class Lote {
    private int cod;
    private double precio;
    private List<Articulo>articulos;
    private List<Puja>pujas;

    public Lote(int cod) {
        this.cod = cod;
        this.precio=0;
        this.articulos=new ArrayList<>();
        this.pujas=new ArrayList<>();

    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        for (Articulo ar:articulos){
            precio+= ar.getPrecio();
        }
    }

    public List<Articulo> getArticulos() {
        return articulos;
    }

    public void adda(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void addp(Puja puja){
        this.pujas.add(puja);
    }
}