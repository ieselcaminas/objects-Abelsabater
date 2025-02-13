package POO.Maquinaexpendedora;

public class MonedaoBillete {
    private int precio;
    private Cajon cajon;

    public MonedaoBillete(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Cajon getCajon() {
        return cajon;
    }

    public void setCajon(Cajon cajon) {
        this.cajon = cajon;
    }
}
