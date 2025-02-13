package POO.Maquinaexpendedora;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private double cantidad;
    private List<Tiquet> tiquets;

    public Cliente(double cantidad) {
        this.cantidad = cantidad;
        this.tiquets=new ArrayList<>();
    }

    public List<Tiquet> getTiquets() {
        return tiquets;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
}
