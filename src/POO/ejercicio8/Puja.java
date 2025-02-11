package POO.ejercicio8;

public class Puja {
    private int cod;
    private double cantidad;
    private Lote lote;
    private Pujador pujador;

    public Puja(double cantidad, int cod, Lote lote,Pujador pujador) {
        this.cantidad = cantidad;
        this.cod = cod;
        this.lote = lote;
        this.pujador=pujador;
    }

    public int getCod() {
        return cod;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }
}
