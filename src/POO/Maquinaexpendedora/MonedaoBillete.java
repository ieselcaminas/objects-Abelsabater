package POO.Maquinaexpendedora;

public class MonedaoBillete {
    private double precio;
    private Cajon cajon;

    public MonedaoBillete(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }
}
