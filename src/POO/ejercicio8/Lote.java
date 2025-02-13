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

    public void setArticulos(List<Articulo> articulos) {
        this.articulos = articulos;
    }

    public List<Puja> getPujas() {
        return pujas;
    }

    public void setPujas(List<Puja> pujas) {
        this.pujas = pujas;
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
    public void adjudicado(){
        if(this.articulos.size()==0){
            System.out.println("No adjudicado");
        }
    }
    public void adda(Articulo articulo){
        this.articulos.add(articulo);
    }
    public void addp(Puja puja){
        this.pujas.add(puja);
    }
    @Override
    public String toString(){
        return "Este es el lote "+this.cod;
    }
}