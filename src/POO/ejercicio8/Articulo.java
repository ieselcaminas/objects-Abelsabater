package POO.ejercicio8;

public class Articulo {
    private String nombre;
    private double precio;
    private Lote lote;

    public Articulo(String nombre,double precio) {
        this.nombre = nombre;
        this.precio=precio;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
