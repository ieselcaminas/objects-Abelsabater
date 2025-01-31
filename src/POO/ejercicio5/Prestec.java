package POO.ejercicio5;

public class Prestec {
private int num_p;
private int cant;
private Cliente cliente;

public Prestec(int num_p, Cliente cliente, int cant) {
    this.num_p = num_p;
    this.cliente = cliente;
    this.cant = cant;
}
public int getCant() {
    return cant;
}

public void setCant(int cant) {
    this.cant = cant;
}

public int getNum_p() {
    return num_p;
}

public Cliente getCliente() {
    return cliente;
}
@Override
public String toString(){
    return this.cant+"€";
}
}
