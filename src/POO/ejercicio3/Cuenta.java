package POO.ejercicio3;

public class Cuenta {
private String titular;
private double cantidad;

public Cuenta(String titular) {
    this.titular = titular;
    this.cantidad=0;
}

public Cuenta(double cantidad, String titular) {
    this.cantidad = cantidad;
    this.titular = titular;
}
public String getTitular() {
    return titular;
}
public double getCantidad() {
    return cantidad;
}

public void setCantidad(double cantidad) {
    this.cantidad = cantidad;
}
public void ingresarcantidad(double cant){
    if(cant>0){
        this.cantidad=getCantidad()+cant;
    }
}
public void quitarcantidad(double cant){
    if(cant>0 && cant<this.cantidad){
        this.cantidad=getCantidad()-cant;
    }
}
public String toString(){
    return "Eres "+this.titular+" tienes actualmente "+this.cantidad+"€";
}
}
