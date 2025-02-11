package POO.ejercicio8;

public class Puja {
    private int cod;
    private double cantidad;
    private Lote lote;

    public Puja(double cantidad, int cod, Lote lote) {
        this.cantidad = cantidad;
        this.cod = cod;
        this.lote = lote;
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
